package br.com.cdb.livraria;

public class Ebook extends Livro {
    private double tamanhoEmMB;

    public Ebook(String titulo, String autor, String isbn, double preco, double tamanhoEmMB) {
        super(titulo, autor, isbn, preco);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    public double getTamanhoEmMB() {
        return tamanhoEmMB;
    }

    public void setTamanhoEmMB(double tamanhoEmMB) {
        this.tamanhoEmMB = tamanhoEmMB;
    }

    // SOBRESCRITA DE MÉTODO
    @Override
    public double calcularPrecoTota() {
        // Método abstrato herdado da classe Livro, implementado aqui para satisfazer a
        // assinatura do método
        return getPreco(); // Substitua por sua lógica de cálculo, se necessário

    }

}
