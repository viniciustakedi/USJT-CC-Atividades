package com.mycompany.bd_gui;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_gui";
    private static String usuario = "root";
    private static String senha = "#Holoko09";
    
    /**
     * Conecta com o banco de dados
     * @return Conexão estabelecida com a base ou null (em caso de problema)
     */
    public static Connection obtemConexao() {
        try {
            return DriverManager.getConnection(
                    //endereço (URL) jdbc:mysql://localhost:3306//lll
                    "jdbc:mysql://" + host + ":" + porta + "/" + db,
                    //usuario
                    usuario,
                    //senha
                    senha
            );
        } 
        catch(Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
