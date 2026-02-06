package Produto;

    public abstract class Produto {

    protected String id;
    protected String nome;
    protected double precoBase;

    // Construtor
    public Produto(String id, String nome, double precoBase) {
        this.id = id;
        this.nome = nome;
        this.precoBase = precoBase;
    }

    // Método abstrato
    public abstract double calcularImposto();

    // Método concreto
    public String exibirDetalhes() {
        return "ID: " + id +
               "\nNome: " + nome +
               "\nPreço Base: " + precoBase;
    }

    public String getId() {
        return id;
    }
}
