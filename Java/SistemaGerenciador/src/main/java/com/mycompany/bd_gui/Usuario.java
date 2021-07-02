package com.mycompany.bd_gui;

public class Usuario {

    private int id;
    private String usuario;
    private String nome;
    private String senha;

    
    public Usuario() {}
    
    public Usuario(String usuario, String senha) {
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
    }
    
    public Usuario(int id, String usuario, String nome, String senha) {
        //this(usuario, nome, senha);
        this.id = id;        
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
