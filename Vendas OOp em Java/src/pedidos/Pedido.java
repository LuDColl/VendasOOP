package pedidos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import pedidos.clientes.Cliente;

public class Pedido {
    private int codPedido;
    private String data;
    private Cliente cliente;
    private ArrayList<Item> lista;
    private Item item;

    public Pedido(int codPedido, String data, Cliente cliente, Produto produto, int quantidade) {
        this.codPedido = codPedido;
        this.data = data;
        this.cliente = cliente;
        lista = new ArrayList<>();
        addItem(produto, quantidade);
    }

    public void addItem(Produto produto, int quantidade) {
        item = new Item(produto, quantidade);
        item.setImposto(cliente.getImposto());
        item.setDesconto(cliente.getDesconto());
        lista.add(item);
    }

    public float getValorPedido() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        return getValor("getValor");
    }

    public float getValorImposto() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        return getValor("getValorImposto");
    }

    public float getValorTotal() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        return getValor("getValorTotal");
    }

    public float getValorLiquido() throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        return getValor("getValorLiquido");
    }

    private float getValor(String nomeMetodo) throws NoSuchMethodException, SecurityException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        Method getValorItem;
        float valor = 0;
        for (Item itemPedido : lista) {
            getValorItem = itemPedido.getClass().getMethod(nomeMetodo);
            valor = (float) getValorItem.invoke(itemPedido);
        }
        return valor;
    }

    public void print() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        System.out.println("Informações do Pedido.");
        System.out.println("Código: " + codPedido);
        System.out.println("Data:: " + data);
        System.out.println("Valor: " + getValorPedido());
        System.out.println("Valor do Imposoto: " + getValorImposto());
        System.out.println("Valor Total: " + getValorTotal());
        System.out.println("Valor Líquido: " + getValorLiquido());
        System.out.println();
        System.out.println("Informações do Cliente.");
        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("UF: " + cliente.getUf());
        System.out.println("Código da Classificação: " + cliente.getCodigoClassificacao());
        System.out.println("Classificação: " + cliente.getClassificacao());
        System.out.println("Imposto: " + cliente.getImposto());
        System.out.println("Desconto: " + cliente.getDesconto());
    }
}
