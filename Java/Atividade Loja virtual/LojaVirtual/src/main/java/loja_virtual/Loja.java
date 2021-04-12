package loja_virtual;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Loja {

    public static void main(String[] args) {

        //Inicializacao do projeto
        //Instanciando e pegando a classe cliente
        Cliente cliente = new Cliente();
        Produtos produto = new Produtos();

        //Parte inicial do sistema, cadastro de usuario e apresentacao
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("{======* Bem-vindo à loja virtual *======}\n"
                + " Cadastre-se para poder acessar a loja!\n\r"
                + "1 - Cadastrar-se\n"
                + "0 - Sair\n\r"
                + "Insira a opcao desejada: "));

        switch (escolha) {
            //Caso um coleta de dados
            case 1:
                String n = JOptionPane.showInputDialog("Insira seu nome completo");
                String e = JOptionPane.showInputDialog("Insira seu email: ");
                String p = JOptionPane.showInputDialog("Insira a senha: ");
                String c = JOptionPane.showInputDialog("Insira seu CPF: ");
                String d = JOptionPane.showInputDialog("Insira seu endereco: ");
                cliente.setCliente(n, e, p, c, d);

                System.out.println(cliente.getDados());

                break;

            //Caso o usuario escolha sair
            case 0:
                JOptionPane.showMessageDialog(null, "Até logo!! Saindo...");

                break;
            //Caso o usuario escolha uma opcao invalida
            default:
                JOptionPane.showMessageDialog(null, "Opcao invalida...Tente Novamente");

                break;
        }
        //Segunda parte boas vindas e usuario pode 

        //Cadastrar produto
        JOptionPane.showMessageDialog(null, "Cadastrar produto");
        String prod = JOptionPane.showInputDialog("Produto");
        String preco = JOptionPane.showInputDialog("Preco: ");
        String qntEstoque = JOptionPane.showInputDialog("Quantidade estoque: ");
        produto.cadastrarProduto(prod, preco, qntEstoque);
        System.out.println(produto.getProduto());

    }
}
