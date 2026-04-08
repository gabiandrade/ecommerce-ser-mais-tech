package enums;

public enum OpcaoMenuCliente {

    LISTAR_PRODUTOS(1, "Listar Produtos"),
    PESQUISAR_PRODUTO(2, "Pesquisar Produto"),
    FAZER_PEDIDO(3, "Fazer Pedido"),
    LISTAR_PEDIDOS(4, "Listar meus pedidos"),
    SAIR(0, "Sair");

    private int opcaoId;
    private String descricao;
    OpcaoMenuCliente(int opcaoId, String descricao) {
        this.opcaoId = opcaoId;
        this.descricao = descricao;
    }

    public int getOpcaoId() {
        return opcaoId;
    }

    public String getDescricao() {
        return descricao;
    }

}
