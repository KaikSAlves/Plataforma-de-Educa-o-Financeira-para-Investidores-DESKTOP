/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.Carteira;
import entities.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDeDados {

    private Connection conexao;
    private String url = "jdbc:mysql://localhost:3306/plataforma_educacao_financeira";
    private String usuario = "root";
    private String senha = "p@$$w0rd";

    public BancoDeDados() throws ClassNotFoundException, SQLException {
        conectar();
    }

    public void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conexao = DriverManager.getConnection(url, usuario, senha);
    }

    //cadastrar
    public void cadastrar(Usuario usuario) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("CALL cadastrarUsuario(?,?,?,?)");
        st.setString(1, usuario.getEmail());
        st.setString(2, usuario.getSenha());
        st.setString(3, usuario.getNome());
        st.setString(4, usuario.getNivelInvestimento());
        st.execute();
    }

    //ler
    public ResultSet ler(Usuario usuario) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("select * from usuario where email = ? and senha = ?");
        st.setString(1, usuario.getEmail());
        st.setString(2, usuario.getSenha());
        ResultSet rs = st.executeQuery();
        return rs;
    }

    //atualizar
    public void atualizar(Usuario usuario) throws SQLException {
        PreparedStatement st = conexao.prepareStatement(
                "update usuario set senha = ?, nome = ?, nivel_investimento = ? where email = ?");
        st.setString(1, usuario.getSenha());
        st.setString(2, usuario.getNome());
        st.setString(3, usuario.getNivelInvestimento());
        st.setString(4, usuario.getEmail());
        st.execute();
    }

    //excluir
    public void excluir(Usuario usuario) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("delete from usuario where email = ?");
        st.setString(1, usuario.getEmail());
        st.execute();
    }

    public ResultSet listar() throws SQLException {
        PreparedStatement st = conexao.prepareStatement("select * from usuario");
        ResultSet rs = st.executeQuery();
        return rs;
    }

    public ResultSet listarNome(String nome) throws SQLException {
        nome = nome + "%";
        PreparedStatement st = conexao.prepareStatement("select * from usuario where nome like ?");
        st.setString(1, nome);
        ResultSet rs = st.executeQuery();
        return rs;
    }

    public ResultSet listarEmail(String email) throws SQLException {
        email = email + "%";
        PreparedStatement st = conexao.prepareStatement("select * from usuario where email like ?");
        st.setString(1, email);
        ResultSet rs = st.executeQuery();
        return rs;
    }

    public ResultSet listarNivelConhecimento(String nivelConhecimento) throws SQLException {
        nivelConhecimento = nivelConhecimento + "%";
        PreparedStatement st = conexao.prepareStatement("select * from usuario where nivel_investimento like ?");
        st.setString(1, nivelConhecimento);
        ResultSet rs = st.executeQuery();
        return rs;
    }

    public ResultSet pegarSaldo(String email) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("select saldo from usuario inner join carteira on"
                + " usuario.email = carteira.email where usuario.email = ?");
        st.setString(1, email);
        ResultSet rs = st.executeQuery();
        return rs;
    }

    public void atualizarSaldo(Carteira carteira) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("update carteira set saldo = ? where email = ?");
        st.setFloat(1, carteira.getSaldo());
        st.setString(2, carteira.getEmail());
        st.execute();
    }

    public void atualizarNome(String novoNome, String email) throws SQLException {
        PreparedStatement st = conexao.prepareStatement("update usuario set nome = ? where email = ?");
        st.setString(1, novoNome);
        st.setString(2, email);
        st.execute();
    }
}
