package com.aprearo.jsonplaceholder

import com.aprearo.jsonplaceholder.mockResponses.*
import io.ktor.client.HttpClient
import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.http.ContentType
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf

class ApiMockEngine {
    fun get() = client.engine

    private val responseHeaders = headersOf("Content-Type" to listOf(ContentType.Application.Json.toString()))
    private val client = HttpClient(MockEngine) {
        engine {
            addHandler { request ->
                if (request.url.encodedPath == "/posts") {
                    respond(PostsMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else if (request.url.encodedPath == "/comments") {
                    respond(CommentsMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else if (request.url.encodedPath == "/albums") {
                    respond(AlbumsMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else if (request.url.encodedPath == "/photos") {
                    respond(PhotosMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else if (request.url.encodedPath == "/todos") {
                    respond(TodosMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else if (request.url.encodedPath == "/users") {
                    respond(UsersMockResponse(), HttpStatusCode.OK, responseHeaders)
                } else {
                    error("Unhandled ${request.url.encodedPath}")
                }
            }
        }
    }
}
