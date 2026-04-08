import utils.Constants;

public class Menu {

    public static void MenuInicial(){
        System.out.println(Constants.azul + "1 - Sou Administrador" + Constants.reset);
        System.out.println(Constants.azul + "2 - Sou Cliente" + Constants.reset);
        System.out.print(Constants.preto + "Escolha uma opção: " + Constants.reset);
    }

    public static void MenuAdmin() {
        System.out.println(Constants.preto + "E-commerce Ser + Tech" + Constants.reset);
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
    }


    public static void MenuCliente() {
        System.out.println(Constants.preto + "Welcome to E-commerce Ser + Tech"  + Constants.reset);
        System.out.println("1 - Listar Produtos");
        System.out.println("2 - Fazer Pedido");
        System.out.println("3 - Listar meus pedidos");
        System.out.println("0 - Sair");
    }
}
