package com.aprearo.jsonplaceholder

import com.aprearo.jsonplaceholder.models.*
import com.aprearo.platform.DefaultDispatcher
import com.aprearo.platform.printThrowable
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

typealias AuthenticationSuccessCallback<T> = (T) -> Unit
typealias AuthenticationErrorCallback = (Throwable) -> Unit

class Client(httpClientEngine: HttpClientEngine) : CoroutineScope {
    constructor() : this(HttpClient().engine)

    private val exceptionHandler = object : CoroutineExceptionHandler {
        override val key: CoroutineContext.Key<*> = CoroutineExceptionHandler

        override fun handleException(context: CoroutineContext, exception: Throwable) {
            println("Exception in $context")
            printThrowable(exception)
        }
    }

    override val coroutineContext: CoroutineContext = DefaultDispatcher + SupervisorJob() + exceptionHandler

    private val api = Api(httpClientEngine)

    fun posts(
            successCallback: AuthenticationSuccessCallback<List<Post>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val posts = api.posts()
                successCallback(posts)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }

    fun comments(
            successCallback: AuthenticationSuccessCallback<List<Comment>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val comments = api.comments()
                successCallback(comments)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }

    fun albums(
            successCallback: AuthenticationSuccessCallback<List<Album>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val albums = api.albums()
                successCallback(albums)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }

    fun photos(
            successCallback: AuthenticationSuccessCallback<List<Photo>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val photos = api.photos()
                successCallback(photos)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }

    fun todos(
            successCallback: AuthenticationSuccessCallback<List<Todo>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val todos = api.todos()
                successCallback(todos)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }

    fun users(
            successCallback: AuthenticationSuccessCallback<List<User>>,
            errorCallback: AuthenticationErrorCallback
    ) {
        launch {
            try {
                val users = api.users()
                successCallback(users)
            } catch (t: Throwable) {
                errorCallback(t)
            }
        }
    }
}
