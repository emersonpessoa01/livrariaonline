package br.com.cdb.livraria;

public class Ebook extends Livro {
    private double tamanhoEmMB;

    public Ebook(String titulo, String autor, String isbn, double preco) {
        super(titulo, autor, isbn, preco);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    public double getTamanhoEmMB() {
        return tamanhoEmMB;
    }

    public void setTamanhoEmMB(double tamanhoEmMB) {
        this.tamanhoEmMB = tamanhoEmMB;
    }

}
