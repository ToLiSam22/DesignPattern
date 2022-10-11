package chapter8_template

object CaffeineBeverageApplication  {

    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val coffee = Coffee()
        println("커피를 준비해보자")
        coffee.prepareRecipe()
        println()

        println("차를 준비해보자")
        val tea = Tea()
        tea.prepareRecipe()
        println()
    }
}