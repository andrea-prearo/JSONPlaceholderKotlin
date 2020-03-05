package com.aprearo.jsonplaceholder

import io.mockk.coVerify
import io.mockk.spyk
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.coroutines.test.runBlockingTest

@UseExperimental(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ClientTests {
    private val apiMockEngine = ApiMockEngine()
    private val clientMock = Api(apiMockEngine.get())
    private val clientSpy = spyk(clientMock)

    @Test
    fun `test posts is called`() = runBlockingTest {
        clientSpy.posts()
        coVerify(exactly = 1) {
            clientSpy.posts()
        }
    }

    @Test
    fun `test posts`() = runBlockingTest {
        val posts = clientMock.posts()
        assertEquals(10, posts.count())
    }

    @Test
    fun `test comments is called`() = runBlockingTest {
        clientSpy.comments()
        coVerify(exactly = 1) {
            clientSpy.comments()
        }
    }

    @Test
    fun `test comments`() = runBlockingTest {
        val comments = clientMock.comments()
        assertEquals(10, comments.count())
    }

    @Test
    fun `test albums is called`() = runBlockingTest {
        clientSpy.albums()
        coVerify(exactly = 1) {
            clientSpy.albums()
        }
    }

    @Test
    fun `test albums`() = runBlockingTest {
        val albums = clientMock.albums()
        assertEquals(10, albums.count())
    }

    @Test
    fun `test photos is called`() = runBlockingTest {
        clientSpy.photos()
        coVerify(exactly = 1) {
            clientSpy.photos()
        }
    }

    @Test
    fun `test photos`() = runBlockingTest {
        val photos = clientMock.photos()
        assertEquals(10, photos.count())
    }

    @Test
    fun `test todos is called`() = runBlockingTest {
        clientSpy.todos()
        coVerify(exactly = 1) {
            clientSpy.todos()
        }
    }

    @Test
    fun `test todos`() = runBlockingTest {
        val todos = clientMock.todos()
        assertEquals(10, todos.count())
    }

    @Test
    fun `test users is called`() = runBlockingTest {
        clientSpy.users()
        coVerify(exactly = 1) {
            clientSpy.users()
        }
    }

    @Test
    fun `test users`() = runBlockingTest {
        val users = clientMock.users()
        assertEquals(10, users.count())
    }
}