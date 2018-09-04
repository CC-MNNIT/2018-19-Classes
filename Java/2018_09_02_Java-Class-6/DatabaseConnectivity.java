/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rohan
 */
public class DatabaseConnectivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/sample";
        Connection connection = DriverManager.getConnection(url, "root", "root");
        String query1 = "INSERT INTO STUDENT VALUES (?, ?, ?)";
        PreparedStatement preStat = connection.prepareStatement(query1);
        preStat.setString(1, "Ravi Verman");
        preStat.setInt(2, 20154001);
        preStat.setString(3, "CSE");
        preStat.executeUpdate();
        
        String query2 = "SELECT * FROM STUDENT;";
        preStat = connection.prepareStatement(query2);
        ResultSet result = preStat.executeQuery();
        while(result.next()) {
            int regno = result.getInt("regno");
            String name = result.getString("name");
            String branch = result.getString("branch");
            System.out.println("Name - " + name);
            System.out.println("Branch - " + branch);
            System.out.println("Registration number - " + regno);
        }
    }
    
}
