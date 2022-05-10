package exercicio1

class Ficcao () : Livros() {

    fun registrarComGenero(
        isbnParametro : String,
        nomeLivroParametro : String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Ficçao")
    }

    fun registrarTudo(
        isbnParametro : String,
        nomeLivroParametro : String,
        pessoaAutoraParametro: String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Ficçao",
            pessoaAutora = pessoaAutoraParametro
        )
    }
}