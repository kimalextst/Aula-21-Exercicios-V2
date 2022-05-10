package exercicio3

class Hyundai (private var velocidade : Int = 2) : Carro() {

    override fun ligarMotor(): String {
        return "Iniciando o motor... minha velocidade está em [5km/h]"
    }

    override fun freiar(): String {
        velocidade -= 2
        verificaVelocidade(velocidade)
        return "Freando... minha velocidade está em [${velocidade}km/h]"
    }

    override fun acelerar(): String {
        velocidade += 15
        return "Acelerando...  minha velocidade está em [${velocidade}km/h]"
    }
}