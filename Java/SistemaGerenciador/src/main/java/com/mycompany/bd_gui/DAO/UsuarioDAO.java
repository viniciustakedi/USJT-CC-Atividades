package com.mycompany.bd_gui.DAO;

import com.mycompany.bd_gui.ConexaoDB;
import com.mycompany.bd_gui.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public boolean existe(Usuario usuario) {
        // 1 - Montar SQL
        String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND senha = ?";

        try {
            // 2 - Pegar a conexao com o DB
            Connection con = ConexaoDB.obtemConexao();

            // 3 - preparar SQL
            PreparedStatement pst = con.prepareStatement(sql);

            // 4 - Preencher os campos vazios na SQL
            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());

            // 5 - Solicitar execucao da consulta e guardar o  resultado
            ResultSet resultado = pst.executeQuery();

            if (resultado.next() == true) {
                return true;
            } else {
                return false;
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
