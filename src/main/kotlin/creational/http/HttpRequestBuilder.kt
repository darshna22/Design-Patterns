import src.main.kotlin.creational.http.HttpMethod
import src.main.kotlin.creational.http.HttpRequest

class HttpRequestBuilder(private val url: String) {
    private var method: HttpMethod = HttpMethod.GET
    private val headers = mutableMapOf<String, String>()
    private val queryParams = mutableMapOf<String, String>()
    private var body: String? = null
    private var timeoutSeconds: Int = 30

    fun method(method: HttpMethod) = apply { this.method = method }

    fun addHeader(key: String, value: String) = apply {
        headers[key] = value
    }

    fun addQueryParam(key: String, value: String) = apply {
        queryParams[key] = value
    }

    fun body(body: String) = apply { this.body = body }

    fun timeout(seconds: Int) = apply { this.timeoutSeconds = seconds }

    fun build(): HttpRequest {
        return HttpRequest(
            url = url,
            method = method,
            headers = headers.toMap(),
            queryParams = queryParams.toMap(),
            body = body.toString(),
            timeoutSeconds = timeoutSeconds
        )
    }
}
