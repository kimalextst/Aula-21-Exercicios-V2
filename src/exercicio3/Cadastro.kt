package exercicio3

import kotlin.system.exitProcess

class Cadastro {
    private var marca : String = ""

    fun pegarMarca(): String {
        println("----------------------------------------------------")
        println("Qual a marca do carro?")
        println("[F] Fiat")
        println("[H] Hyundai")
        println("[R] Renault")
        println("----------------------------------------------------")
        marca = readln()

        if (marca != "F" && marca != "H" && marca != "R") {
            println("Escolha Inválida. Tente novamente.")
            pegarMarca()
        }

        return marca
    }

    private fun pegarAno(): String {
        println("----------------------------------------------------")
        println("Qual o ano do carro?")
        return readln()
    }

    private fun pegarCor(): String {
        println("----------------------------------------------------")
        println("Qual a cor do carro?")
        return readln()
    }

    private fun pegarPortas(): String {
        println("----------------------------------------------------")
        println("O carro possui [2] duas ou [4] quatro portas?")
        val escolha = readln()

        if (escolha != "2" && escolha != "4") {
            println("Escolha Inválida. Tente novamente.")
            pegarPortas()
        }

        return escolha
    }

    private fun pegarValor(): String {
        println("----------------------------------------------------")
        println("Qual o valor do carro?")
        print("R$")
        return readln()
    }

    fun mostrarInfo() {
        val objetoCarro : Carro = Carro()

        println("----------------------------------------------------")
        when(marca){
            "F" -> objetoCarro.mostrarInfoCarro("FIAT", pegarAno(), pegarCor(), pegarPortas(), pegarValor())
            "H" -> objetoCarro.mostrarInfoCarro("HYUNDAI", pegarAno(), pegarCor(), pegarPortas(), pegarValor())
            "R" -> objetoCarro.mostrarInfoCarro("RENAULT", pegarAno(), pegarCor(), pegarPortas(), pegarValor())
        }
        println("----------------------------------------------------")
    }

    fun testDrive(objetoTestDrive: TestDrive) {
        println("----------------------------------------------------")
        println("Deseja fazer um TestDrive virtual? ([S] Sim // [N] Não)")
        val escolha = readln()

        when (escolha) {
            "S" -> {
                objetoTestDrive.introducao()
                objetoTestDrive.carroEscolhido(marca)
            }
            "N" -> {
                exitProcess(0)
            }
            else -> {
                println("Escolha Inválida. Tente novamente.")
                testDrive(objetoTestDrive)
            }
        }
    }
}