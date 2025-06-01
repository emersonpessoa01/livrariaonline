package br.com.cdb.livraria;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        LivroFisico livroFisico = new LivroFisico("Título", "Autor", "asd123", 20, 1, 7);

        Ebook ebook = new Ebook("Título", "Autor", "asd123", 20, 12);

        System.out.println("Preço do livro físico: " + livroFisico.calcularPrecoTotal());

    }
}