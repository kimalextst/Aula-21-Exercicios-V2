package exercicio4

class Operacoes(private val objetoConta : Conta) {

    fun operacao(escolha : Int) {
        var retorno : Double = 0.0

        if (escolha == 1){
            objetoConta.saldo()
            retorno = objetoConta.saque()
        } else {
            objetoConta.saldo()
            retorno = objetoConta.deposito()
        }

        mostrarOperacao(retorno)
    }

    private fun mostrarOperacao(retorno : Double){
        println("----------------------------------------------------")
        println("Deposito/Saque: R$$retorno")
        println("Saldo Atual: R$${objetoConta.saldo()}")
        println("----------------------------------------------------")
    }
}