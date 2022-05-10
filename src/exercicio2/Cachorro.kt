package exercicio2

class Cachorro(
    private val nomeParametro: String = "",
    private val pessoaTutoraParametro: String
) : Animal(
    nome = nomeParametro,
    raca = "Cachorro",
    pessoaTutora = pessoaTutoraParametro
)  {
    fun acoes(){
        println("-----------------------------------------------------------------")
        println(movimentar())
        println(comer())
        println(dormir())
    }

    override fun movimentar(): String {
        return "$nome está andando em 4 patas"
    }

    override fun comer(): String {
        return "$nome está comendo bife"
    }

    override fun dormir(): String {
        return "$nome está dormindo na cama da Jéssica"
    }

    fun mostrarInfoAnimal(){
        infoAnimal()
    }
}