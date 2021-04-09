package pedidos;

public class Produto {
    private String codigo;
    private String produto;
    private float preco;

    public Produto(String codigo, String produto, float preco) {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public float getPreco() {
        return preco;
    }

}
