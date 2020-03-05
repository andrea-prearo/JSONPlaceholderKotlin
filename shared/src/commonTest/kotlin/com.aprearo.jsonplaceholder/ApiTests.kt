package com.aprearo.jsonplaceholder

import io.mockk.coVerify
import io.mockk.spyk
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlinx.coroutines.test.runBlockingTest

@UseExperimental(kotlinx.coroutines.ExperimentalCoroutinesApi::class)
class ApiTests {
    private val apiMockEngine = ApiMockEngine()
    private val apiMock = Api(apiMockEngine.get())
    private val apiSpy = spyk(apiMock)

    @Test
    fun `test posts is called`() = runBlockingTest {
        apiSpy.posts()
        coVerify(exactly = 1) {
            apiSpy.posts()
        }
    }

    @Test
    fun `test posts`() = runBlockingTest {
        val posts = apiMock.posts()
        assertEquals(10, posts.count())
    }

    @Test
    fun `test comments is called`() = runBlockingTest {
        apiSpy.comments()
        coVerify(exactly = 1) {
            apiSpy.comments()
        }
    }

    @Test
    fun `test albums`() = runBlockingTest {
        val albums = apiMock.albums()
        assertEquals(10, albums.count())
    }

    @Test
    fun `test albums is called`() = runBlockingTest {
        apiSpy.albums()
        coVerify(exactly = 1) {
            apiSpy.albums()
        }
    }

    @Test
    fun `test comments`() = runBlockingTest {
        val comments = apiMock.comments()
        assertEquals(10, comments.count())
    }

    @Test
    fun `test photos is called`() = runBlockingTest {
        apiSpy.photos()
        coVerify(exactly = 1) {
            apiSpy.photos()
        }
    }

    @Test
    fun `test photos`() = runBlockingTest {
        val photos = apiMock.photos()
        assertEquals(10, photos.count())
    }

    @Test
    fun `test todos is called`() = runBlockingTest {
        apiSpy.todos()
        coVerify(exactly = 1) {
            apiSpy.todos()
        }
    }

    @Test
    fun `test todos`() = runBlockingTest {
        val todos = apiMock.todos()
        assertEquals(10, todos.count())
    }

    @Test
    fun `test users is called`() = runBlockingTest {
        apiSpy.users()
        coVerify(exactly = 1) {
            apiSpy.users()
        }
    }

    @Test
    fun `test users`() = runBlockingTest {
        val users = apiMock.users()
        assertEquals(10, users.count())
    }
}
