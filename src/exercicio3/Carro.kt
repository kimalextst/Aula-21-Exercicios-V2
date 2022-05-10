package exercicio3

open class Carro (){

    fun mostrarInfoCarro(
        marca : String,
        ano : String,
        cor : String,
        portas : String,
        valor : String,
    ){
        println("----------------------------------------------------")
        println("Marca: $marca")
        println("Ano: $ano")
        println("Cor: $cor")
        println("Portas: $portas")
        println("Valor: R$$valor")
    }

    open fun ligarMotor(): String {
        return ""
    }

    open fun freiar(): String {
        return ""
    }

    open fun acelerar(): String {
        return ""
    }

    fun verificaVelocidade(velocidadeParametro : Int){
        var velocidade = velocidadeParametro
        if (velocidade < 0){
            velocidade = 0
        }
    }
}