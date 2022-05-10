package exercicio1

class Cientifico : Livros() {

    fun registrarComGenero(
        isbnParametro : String,
        nomeLivroParametro : String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Científico")
    }

    fun registrarTudo(
        isbnParametro : String,
        nomeLivroParametro : String,
        pessoaAutoraParametro: String
    ){
        registrarLivro(
            isbn = isbnParametro,
            nome = nomeLivroParametro,
            genero = "Científico",
            pessoaAutora = pessoaAutoraParametro
        )
    }
}