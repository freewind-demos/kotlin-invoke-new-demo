package example

@JsName("hello")
external fun hello(name: String): String

fun main(args: Array<String>) {
    console.log(hello("Kotlin JS"))
}
