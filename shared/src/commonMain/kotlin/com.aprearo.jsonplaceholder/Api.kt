package com.aprearo.jsonplaceholder

import com.aprearo.jsonplaceholder.models.*
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.get
import io.ktor.http.takeFrom

class Api(httpClientEngine: HttpClientEngine) {
    private val baseUrl = "https://jsonplaceholder.typicode.com"
    private val client = HttpClient(httpClientEngine) {
        install(JsonFeature) {
            serializer = KotlinxSerializer()
        }
    }

    suspend fun posts(): List<Post> {
        return client.get {
            setupCall(Endpoint.Posts)
        }
    }

    suspend fun comments(): List<Comment> {
        return client.get {
            setupCall(Endpoint.Comments)
        }
    }

    suspend fun albums(): List<Album> {
        return client.get {
            setupCall(Endpoint.Albums)
        }
    }

    suspend fun photos(): List<Photo> {
        return client.get {
            setupCall(Endpoint.Photos)
        }
    }

    suspend fun todos(): List<Todo> {
        return client.get {
            setupCall(Endpoint.Todos)
        }
    }

    suspend fun users(): List<User> {
        return client.get {
            setupCall(Endpoint.Users)
        }
    }

    private fun HttpRequestBuilder.setupCall(endpoint: Endpoint) {
        url {
            takeFrom(urlString = baseUrl)
            encodedPath += endpoint.path
        }
    }
}
