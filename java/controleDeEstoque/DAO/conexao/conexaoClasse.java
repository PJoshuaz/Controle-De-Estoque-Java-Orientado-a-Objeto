/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeEstoque.DAO.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pj
 */
public class conexaoClasse implements Conexao{
    
    private final String USUARIO = "root";
    private final String SENHA = "dgd32133";
    private final String URL = "jdbc:mysql://127.0.0.1:3306/BancoDeDadosControleDeEstoque";
    private Connection conectar;

    @Override
    public Connection obterConexao() throws SQLException {
        
        if(conectar == null){
            conectar = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        return conectar;
    }

    @Override
    public PreparedStatement preparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
