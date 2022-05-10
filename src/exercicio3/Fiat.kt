package exercicio3

class Fiat(
    private var velocidade : Int = 3) : Carro() {

    override fun ligarMotor(): String {
        return "Iniciando o motor... minha velocidade está em [3km/h]"
    }

    override fun freiar(): String {
        velocidade -= 6
        verificaVelocidade(velocidade)
        return "Freando... minha velocidade está em [${velocidade}km/h]"
    }

    override fun acelerar(): String {
        velocidade += 12
        return "Acelerando...  minha velocidade está em [${velocidade}km/h]"
    }
}