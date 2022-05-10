package exercicio4

import kotlin.system.exitProcess

class Cadastro {
    private lateinit var conta : String
    private lateinit var nome : String
    private var saldo : Double = 0.0
    private lateinit var objetoConta : Conta
    private lateinit var objetoOperacoes : Operacoes

    fun introducao(){
        println("Olá, bem vinde!")
        pegarNome()
        println("Prazer, $nome. Vamos iniciar a criação de conta")
        println("----------------------------------------------------")
    }

    fun criarConta(){
        pegarTipoConta()
        if(conta == "C" || conta == "c") {
            saldoInicial()
        }

        verificacaoObjeto()
        verificacaoOperacoes()
    }

    private fun saldoInicial(){
        println("----------------------------------------------------")
        println("Insira o valor do saldo inicial")
        print("R$")
        saldo = readln().toDouble()
    }

    private fun pegarTipoConta() {
        println("----------------------------------------------------")
        println("Qual tipo de conta deseja criar?")
        println("[C] Corrente")
        println("[P] Poupança")
        println("[S] Salário")
        println("----------------------------------------------------")
        conta = readln()

        if (conta != "C" && conta != "c"
            && conta != "P" && conta != "p"
            && conta != "S" && conta != "s"){
            println("Escolha inválida, tente novamente")
            pegarTipoConta()
        }
    }

    private fun pegarNome(){
        println("----------------------------------------------------")
        println("Qual o seu nome?")
        println("------------------")
        nome = readln()
        println("----------------------------------------------------")
    }

    private fun verificacaoObjeto() {
        when (conta) {
            "C", "c" -> objetoConta = ContaCorrente(saldoAtual = saldo)
            "P", "p" -> objetoConta = ContaPoupanca()
            "S", "s" -> objetoConta = ContaSalario(nome = nome)
        }
        objetoOperacoes = Operacoes(objetoConta)
    }

    fun verificacaoOperacoes(){
        println("----------------------------------------------------")
        println("Deseja realizar alguma operação?")
        println("----------------------------------------------------")
        println("1 - Saque // 2 - Deposito // 3 - Sair")
        println("----------------------------------------------------")
        val escolha = readln().toInt()

        when (escolha){
            1 -> {
                objetoOperacoes.operacao(1)
                verificacaoOperacoes()
            }
            2 -> {
                objetoOperacoes.operacao(2)
                verificacaoOperacoes()
            }
            3 -> exitProcess(0)
            else -> {
                println("Escolha Inválida.")
                verificacaoOperacoes()
            }
        }
    }


}