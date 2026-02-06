package Produto;

public class ProdutoDigital extends Produto {

    private double tamanhoMb;

    public ProdutoDigital(String id, String nome, double precoBase, double tamanhoMb) {
        super(id, nome, precoBase);
        this.tamanhoMb = tamanhoMb;
    }

    @Override
    public double calcularImposto() {
        return precoBase * 0.05; // 5%
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
               "\nTamanho: " + tamanhoMb + " MB";
    }
}
