package enums;

public enum MenuEstoque {

    CADASTRAR_PRODUTO(1, "Cadastrar Produto"),
    LISTAR_PRODUTO(2, "Listar Produtos"),
    ATUALIZAR_PRODUTO(3, "Atualizar Produto"),
    DELETAR_PRODUTO(4, "Excluir Produto"),
    SAIR(0, "Sair");

    private int opcaoId;
    private String descricao;

    MenuEstoque(int opcaoId, String descricao) {
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
