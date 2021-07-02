package com.mycompany.bd_gui;

import com.mycompany.bd_gui.DAO.UsuarioDAO;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        //Verificar se a conexão está funcionando
        //ConexaoDB.obtemConexao();
        
        //Verificar se o metodo existe() esta retornando corretamente
        //Usuario u = new Usuario("takedi97", "123");
        
        //UsuarioDAO uDAO = new UsuarioDAO();
        //System.out.println(uDAO.existe(u));
        Random n = new Random();
        n.nextInt(9) + 2;
        
       
    }
}
