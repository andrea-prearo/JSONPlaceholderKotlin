package com.aprearo.jsonplaceholder.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aprearo.jsonplaceholder.Client

class MainActivity : AppCompatActivity() {
    private val client = Client()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        posts()
    }

    private fun posts() {
        client.posts(
                successCallback = {
                    println("Posts = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }

    private fun comments() {
        client.comments(
                successCallback = {
                    println("Comments = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }

    private fun albums() {
        client.albums(
                successCallback = {
                    println("Albums = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }

    private fun photos() {
        client.photos(
                successCallback = {
                    println("Photos = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }

    private fun todos() {
        client.todos(
                successCallback = {
                    println("Todos = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }

    private fun users() {
        client.users(
                successCallback = {
                    println("Users = $it")
                },
                errorCallback = {
                    println("Error = $it")
                }
        )
    }
}
