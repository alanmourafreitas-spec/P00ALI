package Produto;

public interface Estocavel {

    void adicionarEstoque(int quantidade);

    boolean removerEstoque(int quantidade);

    int getQuantidadeEmEstoque();
}
