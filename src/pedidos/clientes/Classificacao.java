package pedidos.clientes;

public class Classificacao {
    private int codigo;
    private String classificacao;
    private float imposto;
    private float desconto;

    public Classificacao(int codigo, String classificacao, float imposto, float desconto) {
        this.codigo = codigo;
        this.classificacao = classificacao;
        this.imposto = imposto;
        this.desconto = desconto;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getClassificacao(){
        return classificacao;
    }

    public float getImposto() {
        return imposto;
    }

    public float getDesconto() {
        return desconto;
    }
}
