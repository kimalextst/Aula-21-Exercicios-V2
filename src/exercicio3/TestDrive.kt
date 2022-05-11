package exercicio3

import kotlin.system.exitProcess

class TestDrive {
    private lateinit var objetoCarro : Carro

    fun introducao(){
        println("----------------------------------------------------")
        println("Olá. Bem-Vinde ao nosso Test Drive virtual!")
        println("----------------------------------------------------")
    }

    fun carroEscolhido(marca: String) {
        when(marca){
            "F", "f" -> objetoCarro = Fiat()
            "H", "h" -> objetoCarro = Hyundai()
            "R", "r" -> objetoCarro = Renault()
        }
    }

    fun iniciar(){
        println("O que deseja fazer?")
        println("---------------------")
        println("[1] Iniciar o Carro")
        println("[2] Sair da simulação")
        println("----------------------------------------------------")
        val escolha = readln()

        when (escolha) {
            "1" -> {
                println("----------------------------------------------------")
                println(objetoCarro.ligarMotor())
                println("----------------------------------------------------")
            }
            "2" -> {
                exitProcess(0)
            }
            else -> {
                println("Escolha inválida. Tente novamente.")
                iniciar()
            }
        }
    }

    fun dirigir(){
        println("O que deseja fazer?")
        println("---------------------")
        println("[1] Acelerar")
        println("[2] Freiar")
        println("[3] Sair da simulação")
        println("----------------------------------------------------")
        val escolha = readln()

        when (escolha) {
            "1" -> {
                println("----------------------------------------------------")
                println(objetoCarro.acelerar())
                println("----------------------------------------------------")
                dirigir()
            }
            "2" -> {
                println("----------------------------------------------------")
                println(objetoCarro.freiar())
                println("----------------------------------------------------")
                dirigir()
            }
            "3" -> {
                exitProcess(0)
            }
            else -> {
                println("Escolha inválida. Tente novamente.")
                dirigir()
            }
        }
    }
}