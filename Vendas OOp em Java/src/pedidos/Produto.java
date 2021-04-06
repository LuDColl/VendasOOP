package pedidos;

public class Produto {
    private String codigo;
    private String produto;
    private float preco;
    private float imposto;
    private float desconto;

    public Produto(String codigo, String produto, float preco) {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public float getPreco() {
        return preco;
    }

}
