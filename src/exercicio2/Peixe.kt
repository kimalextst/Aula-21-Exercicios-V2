package exercicio2

class Peixe(
    private val nomeParametro : String = "",
    private val pessoaTutoraParametro : String
) : Animal(
    nome = nomeParametro,
    raca = "Peixe",
    pessoaTutora = pessoaTutoraParametro
){
    fun acoes(){
        println("-----------------------------------------------------------------")
        println(movimentar())
        println(comer())
        println(dormir())
    }

    override fun movimentar(): String {
        return "$nome está nadando"
    }

    override fun comer(): String {
        return "$nome está comendo ração molhada"
    }

    override fun dormir(): String {
        return "$nome está dormindo de olho aberto"
    }

    fun mostrarInfoAnimal(){
        infoAnimal()
    }
}