import io.jooby.runApp

fun main(args: Array<String>) {
    runApp(args) {

        get("/") { "Hello Jooby!" }

        get("/height/{height}?") {
            val height = ctx.path("height").value("null")
            "Your height is: $height cm"
        }
    }
}