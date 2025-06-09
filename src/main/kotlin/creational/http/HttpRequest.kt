package src.main.kotlin.creational.http

data class HttpRequest(
    val url: String,
    val method: HttpMethod,
    val headers: Map<String, String>,
    val queryParams: Map<String, String>,
    val body: String,
    val timeoutSeconds: Int
)