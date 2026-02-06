package Produto;

public class ProdutoFisico extends Produto {

    private double pesoKg;

    public ProdutoFisico(String id, String nome, double precoBase, double pesoKg) {
        super(id, nome, precoBase);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularImposto() {
        return precoBase * 0.10; // 10%
    }

    @Override
    public String exibirDetalhes() {
        return super.exibirDetalhes() +
               "\nPeso: " + pesoKg + " kg";
    }
}
