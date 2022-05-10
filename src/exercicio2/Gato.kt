package exercicio2

class Gato(
    private val nomeParametro : String = "",
    private val pessoaTutoraParametro : String
) : Animal(
    nome = nomeParametro,
    raca = "Gato",
    pessoaTutora = pessoaTutoraParametro
){
    fun acoes(){
        println("-----------------------------------------------------------------")
        println(movimentar())
        println(comer())
        println(dormir())
    }

    override fun movimentar(): String {
        return "$nome está andando e saltando em 4 patas"
    }

    override fun comer(): String {
        return "$nome está comendo whiskas sachê"
    }

    override fun dormir(): String {
        return "$nome está dormindo na caixa"
    }
    fun mostrarInfoAnimal(){
        infoAnimal()
    }
}