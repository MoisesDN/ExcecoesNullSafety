//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val str: String? = null

    if (str != null) {
        str.lowercase()
        str.length
    }


    str?.let {
        it.lowercase()
        it.length
    }
}