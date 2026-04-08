import utils.EfeitoTexto;

private static final Scanner sc = new Scanner(System.in);

void main() {

    int opcao;
    do {
        Menu.MenuInicial();
        opcao = sc.nextInt();
        sc.nextLine();
        executarMenuInicial(opcao);
    } while (opcao != 0);
}

private static void executarMenuInicial(int opcao) {
    switch (opcao) {
        case 1:
            IO.println("Digite o login");
            String administrador = sc.nextLine();
            IO.println("Digite a senha");
            String senha = sc.nextLine();

            if (administrador.equals("admin") && senha.equals("admin")) {
                Menu.MenuAdmin();
            } else {
                System.out.println("Usuário ou senha inválidos");
            }

            break;
        case 2:
            //Menu cliente
            Menu.MenuCliente();
            break;
        case 0:
            EfeitoTexto.escrever("Encerrando o programa...", 50);
            break;
        default:
            System.out.println("Opção inválida");
    }
}