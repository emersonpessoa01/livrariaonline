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
            //total += livro.calcularPrecoTota();
            total += livro.getPreco(); // Usando o método getPreco() para obter o preço do livro
            if (livro instanceof LivroFisico) {
                total += ((LivroFisico) livro).getFrete(); // Adiciona o frete se for um LivroFisico
            }

        }

        return total;
    }
}
