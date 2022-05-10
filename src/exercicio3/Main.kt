package exercicio3

fun main(){
    val objetoCadastro : Cadastro = Cadastro()
    val objetoTestDrive : TestDrive = TestDrive()

    objetoCadastro.pegarMarca()
    objetoCadastro.mostrarInfo()
    objetoCadastro.testDrive(objetoTestDrive)

    objetoTestDrive.iniciar()
    objetoTestDrive.dirigir()
}