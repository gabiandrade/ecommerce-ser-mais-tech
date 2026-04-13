import estoque.Produto;

import java.util.Scanner;

public class GerenciadorEstoque {

    public static void CadastrarProduto(Scanner sc){
        System.out.print("Codigo de Barras: ");
        String codigoBarras = sc.nextLine();
        sc.nextLine();

        System.out.print("Nome do produto: ");
        String nomeProduto = sc.nextLine();

        Produto produto = new Produto(codigoBarras, nomeProduto);
        System.out.println("Produto cadastrado com sucesso");
        System.out.println(produto);
    }

    public static void ListarProdutos(){

    }
}
