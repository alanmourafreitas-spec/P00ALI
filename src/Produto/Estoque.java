package Produto;

    import java.util.HashMap;
import java.util.Map;

public class Estoque implements Estocavel {

    private Map<String, Integer> mapaProdutos;
    private String produtoAtualId;

    // Membro estático
    public static int totalProdutosCadastrados = 0;

    public Estoque() {
        mapaProdutos = new HashMap<>();
    }

    // Define qual produto está sendo manipulado
    public void selecionarProduto(String produtoId) {
        this.produtoAtualId = produtoId;

        if (!mapaProdutos.containsKey(produtoId)) {
            mapaProdutos.put(produtoId, 0);
            totalProdutosCadastrados++;
        }
    }

    @Override
    public void adicionarEstoque(int quantidade) {
        int atual = mapaProdutos.get(produtoAtualId);
        mapaProdutos.put(produtoAtualId, atual + quantidade);
    }

    @Override
    public boolean removerEstoque(int quantidade) {
        int atual = mapaProdutos.get(produtoAtualId);

        if (quantidade <= atual) {
            mapaProdutos.put(produtoAtualId, atual - quantidade);
            return true;
        }
        return false;
    }

    @Override
    public int getQuantidadeEmEstoque() {
        return mapaProdutos.get(produtoAtualId);
    }

    // Método estático
    public static String formatarMoeda(double valor) {
        return String.format("R$ %.2f", valor);
    }
}
