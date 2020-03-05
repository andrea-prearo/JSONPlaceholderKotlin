package com.aprearo.jsonplaceholder

internal enum class Endpoint(val path: String) {
    Posts("/posts"),
    Comments("/comments"),
    Albums("/albums"),
    Photos("/photos"),
    Todos("/todos"),
    Users("/users")
}
