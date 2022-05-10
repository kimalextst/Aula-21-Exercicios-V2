package exercicio3

class Renault (
    private var velocidade : Int = 0) : Carro() {

    override fun ligarMotor(): String {
        return "Iniciando o motor... minha velocidade está em [0km/h]"
    }

    override fun freiar(): String {
        velocidade -= 5
        verificaVelocidade(velocidade)
        return "Freando... minha velocidade está em [${velocidade}km/h]"
    }

    override fun acelerar(): String {
        velocidade += 10
        return "Acelerando...  minha velocidade está em [${velocidade}km/h]"
    }
}