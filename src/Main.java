import Produto.Estoque;
import Produto.Produto;
import Produto.ProdutoDigital;
import Produto.ProdutoFisico;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new ProdutoFisico(
                "P001", "Camiseta", 100.0, 0.3
        );

        Produto produto2 = new ProdutoDigital(
                "D001", "Curso Java", 200.0, 1500
        );

        Estoque estoque = new Estoque();

        // Produto físico
        estoque.selecionarProduto(produto1.getId());
        estoque.adicionarEstoque(10);

        // Produto digital
        estoque.selecionarProduto(produto2.getId());
        estoque.adicionarEstoque(5);

        // Polimorfismo
        System.out.println("=== PRODUTO FÍSICO ===");
        System.out.println(produto1.exibirDetalhes());
        System.out.println("Imposto: " +
                Estoque.formatarMoeda(produto1.calcularImposto()));

        System.out.println("\n=== PRODUTO DIGITAL ===");
        System.out.println(produto2.exibirDetalhes());
        System.out.println("Imposto: " +
                Estoque.formatarMoeda(produto2.calcularImposto()));

        // Teste remoção
        estoque.selecionarProduto(produto1.getId());
        boolean removido = estoque.removerEstoque(15);

        System.out.println("\nTentativa de remoção de 15 unidades:");
        System.out.println(removido ? "Remoção realizada" : "Estoque insuficiente");

        System.out.println("\nTotal de produtos cadastrados: "
                + Estoque.totalProdutosCadastrados);
    }
}