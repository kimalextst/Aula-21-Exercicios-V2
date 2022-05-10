package exercicio2

open class Animal(
    val nome: String = "",
    val raca: String = "",
    private val pessoaTutora: String
        ){

    protected open fun acoes(){
        movimentar()
        comer()
        dormir()
    }
    protected open fun movimentar(): String {
        return ""
    }

    protected open fun comer(): String {
        return ""
    }

    protected open fun dormir(): String {
        return ""
    }

    fun infoAnimal(){
        println("-----------------------------------------------------------------")
        println("Nome: $nome")
        println("Raça: $raca")
        println("Pessoa tutora: $pessoaTutora")
    }
}