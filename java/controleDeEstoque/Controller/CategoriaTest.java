/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleDeEstoque.Controller;

import controleDeEstoque.DAO.conexao.Conexao;
import controleDeEstoque.DAO.conexao.conexaoClasse;
import controleDeEstoqueJava.Domonio.Categoria;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author pj
 */
public class CategoriaTest {
    
    public static void main(String[] args) throws SQLException{
        
        String sql = "Select * from categoria";
        
        Conexao conexao = new conexaoClasse();
        
        Categoria categoria = new Categoria(null,"carro","inserção no netbean");
        
        String inserirSQL = "INSERT INTO categoria(nome, descricao) VALUES(?, ?)";
        
        PreparedStatement preparedStatement = conexao.obterConexao().prepareStatement(inserirSQL);
        
        preparedStatement.setString(1, categoria.getNome());
        preparedStatement.setString(2,categoria.getDescricao());
        
        
        int resultadoDoCadastro = preparedStatement.executeUpdate();
        System.out.println(resultadoDoCadastro);
         
        ResultSet result = conexao.obterConexao().prepareStatement(sql).executeQuery();
        
        while(result.next()){
            System.out.println(result.getString("nome"));
            
        }
    }
    
}
