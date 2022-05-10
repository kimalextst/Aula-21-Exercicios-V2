package exercicio4

class ContaSalario (
    private var deposito : Double = 0.0,
    private var saque : Double = 0.0,
    private var saldoAtual : Double = 1212.00,
    private var nome : String = ""
) : Conta() {

    override fun deposito(): Double {
        println("----------------------------------------------------")
        println("Você é o empregador de $nome?")
        println("[1] Sim, sou o empregador")
        println("[2] Não, sou $nome")
        println("[3] Nenhuma das duas opcões")
        println("----------------------------------------------------")
        val escolha = readln().toInt()

        when (escolha) {
            1 -> {
                println("----------------------------------------------------")
                println("Insira o valor do depósito desejado: ")
                deposito = readln().toDouble()
                println("----------------------------------------------------")
            }
            2 -> {
                println("Apenas o empregador pode depositar.")
            }
            3 -> {
                println("Apenas o empregador de $nome pode depositar.")
            }
            else -> {
                println("Escolha inválida, tente novamente")
                deposito()
            }
        }

        return deposito
    }

    override fun saque(): Double {
        println("----------------------------------------------------")
        println("Insira o valor do saque desejado: ")
        saque = readln().toDouble()
        println("----------------------------------------------------")

        if (saque > saldoAtual){
            println("Saldo insuficiente")
            saque = 0.0
        }
        return saque
    }

    override fun saldo(): Double {
        saldoAtual -= saque
        saldoAtual += deposito
        saque = 0.0
        deposito = 0.0
        return saldoAtual
    }
}