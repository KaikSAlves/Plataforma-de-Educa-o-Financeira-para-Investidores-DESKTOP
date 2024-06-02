/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


public class Usuario {
    private String email;
    private String senha;        
    private String nome;
    private String nivelInvestimento;
    
    public Usuario(String email, String senha){
        this.email = email;
        this.senha = senha;
    }
    
    public Usuario(String email, String senha, String nome, String nivelInvestimento) {
        this.email = email;
        this.senha = senha;
        this.nome = nome;
        this.nivelInvestimento = nivelInvestimento;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivelInvestimento() {
        return nivelInvestimento;
    }

    public void setNivelInvestimento(String nivelInvestimento) {
        this.nivelInvestimento = nivelInvestimento;
    }
    
    
}
