/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory;



/**
 *
 * @author Fatec
 */
public class TestaConexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConnectionFactory connectionTest = new ConnectionFactory();
        connectionTest.getConnection();
        System.out.println("Conexão Aberta");
        
    }
    
}

