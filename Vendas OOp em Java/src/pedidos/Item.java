package pedidos;

public class Item {
    private Produto produto;
    private int quantidade;
    private float imposto;
    private float desconto;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return produto.getCodigo();
    }

    public String getProduto() {
        return produto.getProduto();
    }

    public float getPreco() {
        return produto.getPreco();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getPrecoImposto() {
        return produto.getPreco() * imposto;
    }

    public float getPrecoTotal() {
        return produto.getPreco() + getPrecoImposto();
    }

    public float getPrecoLiquido() {
        return getPrecoTotal() * (1 - desconto);
    }

    public float getValor() {
        return precoXQuantidade(produto.getPreco());
    }

    public float getValorImposto() {
        return precoXQuantidade(getPrecoImposto());
    }

    public float getValorTotal() {
        return precoXQuantidade(getPrecoTotal());
    }

    public float getValorLiquido() {
        return precoXQuantidade(getPrecoLiquido());
    }

    private float precoXQuantidade(float preco) {
        return preco * quantidade;
    }
}
