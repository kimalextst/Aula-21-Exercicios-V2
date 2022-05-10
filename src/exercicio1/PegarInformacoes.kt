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
        val escolhaNome = readln()

        println("----------------------------------------------------")
        println("Deseja registrar a pessoa autora? ([S] Sim // [N] Não)")
        val escolhaPessoaAutora = readln()

        println("----------------------------------------------------")
        println("Deseja registrar o genêro? ([S] Sim // [N] Não)")
        val escolhaGenero = readln()

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
                "C" -> objetoCientifico.registrarComGenero(isbn, nomeLivro)
                "F" -> objetoFiccao.registrarComGenero(isbn, nomeLivro)
                "R" -> objetoRomance.registrarComGenero(isbn, nomeLivro)
            }
        } else if (escolhaNome == "S" && escolhaPessoaAutora == "S" && escolhaGenero == "S"){
            when(genero){
                "C" -> objetoCientifico.registrarTudo(isbn, nomeLivro, pessoaAutora)
                "F" -> objetoFiccao.registrarTudo(isbn, nomeLivro, pessoaAutora)
                "R" -> objetoRomance.registrarTudo(isbn, nomeLivro, pessoaAutora)
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

        while (escolha != "C" && escolha != "F" && escolha != "R") {
            println("Escolha Inválida. Tente novamente.")
            pegarGenero()
        }

        return escolha
    }
}