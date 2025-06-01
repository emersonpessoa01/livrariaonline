package br.com.cdb.livraria;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    //
    public void addLivro(Livro livro) {
        // Verifica se o livro já está no carrinho
        livros.add(livro);
    }

    ArrayList<Livro> livros = new ArrayList<Livro>();

    public double calcularTotal() {
        // Calcula o total do carrinho
        double total = 0;
        for (Livro livro : livros) {
            total += livro.calcularPrecoTota();
        }

        return total;
    }
}
