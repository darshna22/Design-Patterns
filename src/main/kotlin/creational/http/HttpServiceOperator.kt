package src.main.kotlin.creational.http

import HttpRequestBuilder

fun main() {
    val request = HttpRequestBuilder("https://api.example.com")
        .method(HttpMethod.GET)
        .addHeader("Accept", "application/json")
        .timeout(15).build()
}