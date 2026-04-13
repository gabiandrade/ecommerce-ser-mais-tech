import utils.Constants;

public class Menu {

    public static void MenuInicial(){
        System.out.println(Constants.AZUL + "1 - Sou Administrador" + Constants.RESET);
        System.out.println(Constants.AZUL + "2 - Sou Cliente" + Constants.RESET);
        System.out.print(Constants.PRETO + "Escolha uma opção: " + Constants.RESET);
    }

    public static void MenuAdmin() {
        System.out.println(Constants.PRETO + "E-commerce Ser + Tech" + Constants.RESET);
        System.out.println("1 - Cadastrar Produto");
        System.out.println("2 - Listar Produtos");
        System.out.print("Escolha uma opção: ");
    }


    public static void MenuCliente() {
        System.out.println(Constants.PRETO + "Welcome to E-commerce Ser + Tech"  + Constants.RESET);
        System.out.println("1 - Listar Produtos");
        System.out.println("2 - Fazer Pedido");
        System.out.println("3 - Listar meus pedidos");
        System.out.println("0 - Sair");
    }
}
