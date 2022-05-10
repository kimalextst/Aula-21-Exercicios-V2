package exercicio1

class PegarInformacoes {
    private var objetoLivro : Livros = Livros()
    private var objetoRomance : Romance = Romance()
    private var objetoFiccao : Ficcao = Ficcao()
    private var objetoCientifico : Cientifico = Cientifico()
    private lateinit var isbn : String
    private lateinit var nomeLivro : String
    private lateinit var pessoaAutora : String

    fun opcoesCadastro(){
        println("---------------------------------------------")

        println("Deseja registrar o nome? ([S] Sim // [N] Não)")
        var escolhaNome = readln()
        when(escolhaNome){
            "s" -> escolhaNome = "S"
            "n" -> escolhaNome = "N"
        }

        println("----------------------------------------------------")
        println("Deseja registrar a pessoa autora? ([S] Sim // [N] Não)")
        var escolhaPessoaAutora = readln()
        when(escolhaPessoaAutora){
            "s" -> escolhaPessoaAutora = "S"
            "n" -> escolhaPessoaAutora = "N"
        }

        println("----------------------------------------------------")
        println("Deseja registrar o genêro? ([S] Sim // [N] Não)")
        var escolhaGenero = readln()
        when(escolhaGenero){
            "s" -> escolhaGenero = "S"
            "n" -> escolhaGenero = "N"
        }

        isbn = pegarISBN()

        if (escolhaNome == "S"){
            nomeLivro = pegarNomeLivro()
        }

        if (escolhaPessoaAutora == "S"){
            pessoaAutora = pegarPessoaAutora()
        }

        var genero : String = ""
        if (escolhaGenero == "S"){
            genero = pegarGenero()
        }

        if (escolhaNome == "N" && escolhaPessoaAutora == "N" && escolhaGenero == "N"){
            objetoLivro.registrarLivro(isbn)
        }else if (escolhaNome == "S" && escolhaPessoaAutora == "N" && escolhaGenero == "N"){
            objetoLivro.registrarLivro(isbn, nomeLivro)
        } else if (escolhaNome == "S" && escolhaPessoaAutora == "N" && escolhaGenero == "S"){
            when(genero){
                "C", "c" -> objetoCientifico.registrarComGenero(isbn, nomeLivro)
                "F", "f"-> objetoFiccao.registrarComGenero(isbn, nomeLivro)
                "R", "r" -> objetoRomance.registrarComGenero(isbn, nomeLivro)
            }
        } else if (escolhaNome == "S" && escolhaPessoaAutora == "S" && escolhaGenero == "S"){
            when(genero){
                "C", "c" -> objetoCientifico.registrarTudo(isbn, nomeLivro, pessoaAutora)
                "F", "f" -> objetoFiccao.registrarTudo(isbn, nomeLivro, pessoaAutora)
                "R", "r" -> objetoRomance.registrarTudo(isbn, nomeLivro, pessoaAutora)
            }
        }
    }

    private fun pegarISBN(): String {
        println("----------------------------------------------------")
        print("Insira o ISBN do livro: ")
        return readln()
    }

    private fun pegarNomeLivro(): String {
        println("----------------------------------------------------")
        print("Insira o nome do livro: ")
        return readln()
    }

    private fun pegarPessoaAutora(): String {
        println("----------------------------------------------------")
        print("Insira o nome da Pessoa Autora: ")
        return readln()
    }

    private fun pegarGenero(): String {
        println("----------------------------------------------------")
        println("Qual o gênero do livro que deseja registrar?")
        println("[C] Científico")
        println("[F] Ficção")
        println("[R] Romance")
        println("----------------------------------------------------")

        val escolha = readln()

        while (escolha != "C" && escolha!= "c"
            && escolha != "F" && escolha != "f"
            && escolha != "R" && escolha != "r") {
            println("Escolha Inválida. Tente novamente.")
            pegarGenero()
        }

        return escolha
    }
}