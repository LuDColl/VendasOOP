package pedidos.clientes;

public class Cliente {
    private int codigo;
    private String nome;
    private String uf;
    private Classificacao classificacao;

    public Cliente(int codigo, String nome, String uf, Classificacao classificacao) {
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
        this.classificacao = classificacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }
    public String getUf() {
        return uf;
    }

    public float getCodigoClassificacao() {
        return classificacao.getCodigo();
    }

    public String getClassificacao() {
        return classificacao.getClassificacao();
    }
    
    public float getImposto() {
        return classificacao.getImposto();
    }

    public float getDesconto() {
        return classificacao.getDesconto();
    }
}
