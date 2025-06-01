package br.com.cdb.livraria;

public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        LivroFisico livroFisico = new LivroFisico("Título", "Autor", "asd123", 20, 1, 7);

        Ebook ebook = new Ebook("Título", "Autor", "asd123", 20, 12);
        carrinho.addLivro(livroFisico);
        carrinho.addLivro(ebook);
        System.out.println("O preço total do carrinho é: " + carrinho.calcularTotal());

    }
}