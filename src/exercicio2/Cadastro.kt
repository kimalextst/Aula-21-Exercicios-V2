package exercicio2

import kotlin.system.exitProcess

class Cadastro{
    private val objetoCliente : Cliente = Cliente()
    private lateinit var nomeAnimal : String

    fun pegarInfoTutor(){
        println("-----------------------------------------------------------------")
        println("Olá! Para cadastrar seu bichinho, preciso cadastrar você primeiro")
        println("Qual seu nome?")
        println("-----------------------------------------------------------------")
        val nome = readln()
        println("-----------------------------------------------------------------")
        println("Prazer, $nome. Agora é hora de cadastrar seu animal")
        println("-----------------------------------------------------------------")
        objetoCliente.nome = nome
    }

    fun infoAnimal() {
        println("-----------------------------------------------------------------")
        print("Insira o nome do animal: ")
        nomeAnimal = readln()

        especieAnimal()
    }

    private fun especieAnimal() {
        println("-----------------------------------------------------------------")
        println("Qual a espécie do seu bichinho?")
        println("[C] Cachorro")
        println("[G] Gato")
        println("[P] Peixe")
        println("-----------------------------------------------------------------")
        val escolha = readln()

        if (escolha != "C" && escolha != "G" && escolha != "P") {
            println("Escolha Inválida. Tente novamente.")
            especieAnimal()
        }

        retornoInfo(escolha)
    }

    private fun retornoInfo(escolha: String) {
        val objetoCachorro : Cachorro = Cachorro(nomeParametro = nomeAnimal, pessoaTutoraParametro = objetoCliente.nome)
        val objetoGato : Gato = Gato(nomeParametro = nomeAnimal, pessoaTutoraParametro = objetoCliente.nome)
        val objetoPeixe : Peixe = Peixe(nomeParametro = nomeAnimal, pessoaTutoraParametro = objetoCliente.nome)

        when (escolha){
            "C" -> {
                objetoCachorro.mostrarInfoAnimal()
                objetoCachorro.acoes()
            }
            "G" -> {
                objetoGato.mostrarInfoAnimal()
                objetoGato.acoes()
            }
            "P" -> {
                objetoPeixe.mostrarInfoAnimal()
                objetoPeixe.acoes()
            }
        }
    }

    fun cadastrarNovoAnimal(){
        println("-----------------------------------------------------------------")
        println("Deseja cadastrar outro animal? ([S] Sim // [N] Não)")
        val escolha = readln()

        when (escolha) {
            "S" -> {
                main()
            }
            "N" -> {
                exitProcess(0)
            }
            else -> {
                println("Escolha Inválida. Tente novamente.")
                cadastrarNovoAnimal()
            }
        }
    }
}