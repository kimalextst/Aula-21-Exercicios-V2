package exercicio1

class Romance() : Livros() {

    fun registrarComGenero(
        isbnParametro : String,
        nomeLivroParametro : String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Romance")
    }

    fun registrarTudo(
        isbnParametro : String,
        nomeLivroParametro : String,
        pessoaAutoraParametro: String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Romance",
            pessoaAutora = pessoaAutoraParametro
        )
    }
}