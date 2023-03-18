/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.Cliente;

/**
 *
 * @author gusta
 */
public class ClienteDAO {
    private Connection connection;
    
    public ClienteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Cliente cliente) {
        String sql = "INSERT INTO cliente(cli_nome)VALUES (?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,cliente.getNome());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
