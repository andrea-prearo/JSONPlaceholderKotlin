package com.aprearo.jsonplaceholder

import kotlin.test.Test
import kotlin.test.assertEquals

class EndpointTests {
    @Test
    fun `test URL path`() {
        assertEquals("/posts", Endpoint.Posts.path)
        assertEquals("/comments", Endpoint.Comments.path)
        assertEquals("/albums", Endpoint.Albums.path)
        assertEquals("/photos", Endpoint.Photos.path)
        assertEquals("/todos", Endpoint.Todos.path)
        assertEquals("/users", Endpoint.Users.path)
    }
}
