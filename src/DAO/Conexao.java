/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author bruno
 */
public class Conexao {
     public static Connection getConn(){
        
       //Connection factory
        Connection conn=null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Cidade ", "brunofs", "bino56");
        } catch (SQLException ex) {
            System.out.println("Não foi possivel estabelecer a conexão com o Banco");
        } catch (ClassNotFoundException ex) {
            System.out.println("Não foi encontrada a classe do driver");
        }
        
        
        
        return conn;
    
    }
}
