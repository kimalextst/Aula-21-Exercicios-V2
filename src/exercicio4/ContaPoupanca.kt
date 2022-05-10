package exercicio4

class ContaPoupanca(
    private var deposito : Double = 0.0,
    private var saque : Double = 0.0,
    private var saldoAtual : Double = 0.0
) : Conta() {

    override fun deposito(): Double {
        println("----------------------------------------------------")
        println("Insira o valor do depósito desejado: ")
        deposito = readln().toDouble()
        println("----------------------------------------------------")
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