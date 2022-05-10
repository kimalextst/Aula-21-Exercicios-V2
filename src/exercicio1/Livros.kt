package exercicio1

open class Livros (
    var isbn : String = "",
    var nomeLivro : String = "",
    var pessoaAutora: String = ""
        ){

    fun registrarLivro(isbn : String){
        println("----------------------------------------------------")
        println("O livro foi registrado com o isbn")
        println("----------------------------------------------------")
        println("ISBN: $isbn")
        println("----------------------------------------------------")
    }

    fun registrarLivro(isbn : String, nome : String){
        println("----------------------------------------------------")
        println("O livro foi registrado com o isbn e o nome")
        println("----------------------------------------------------")
        println("ISBN: $isbn")
        println("Nome: $nome")
        println("----------------------------------------------------")
    }

    protected open fun registrarLivro(isbn : String, nome : String, genero : String){
        println("----------------------------------------------------")
        println("O livro foi registrado com o isbn, o nome e o gênero")
        println("----------------------------------------------------")
        println("ISBN: $isbn")
        println("Nome: $nome")
        println("Gênero: $genero")
        println("----------------------------------------------------")
    }

    protected open fun registrarLivro(isbn : String, nome : String, genero : String, pessoaAutora : String){
        println("----------------------------------------------------")
        println("O livro foi registrado com todos os atributos")
        println("----------------------------------------------------")
        println("ISBN: $isbn")
        println("Nome: $nome")
        println("Gênero: $genero")
        println("Pessoa Autora: $pessoaAutora")
        println("----------------------------------------------------")
    }

}