package example

@JsName("Hello")
external class Hello(name: String) {
    fun hello(): Unit = definedExternally
}

fun main(args: Array<String>) {
    val hello = Hello("Kotlin JS")
    console.log(hello.hello())
}
