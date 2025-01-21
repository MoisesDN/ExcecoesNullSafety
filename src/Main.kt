//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    try {
        val s: String? = null
        val a = 10/0

        println(s!!.length)
    } catch (e: NullPointerException) {
        println("Variavel nula!")
    } catch (e: ArithmeticException) {
        println("Impossivel dividir por zero!")
    } finally {
        println("Finally!")
    }

    println("Fim!")

}