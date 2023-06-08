/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package controleDeEstoque.DAO.conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pj
 */
public interface Conexao {
    
    /**
     *
     * @return
     * @throws SQLException
     */
    public Connection obterConexao() throws SQLException;

    public PreparedStatement preparedStatement(String sql);
        
    
}
