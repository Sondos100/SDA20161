/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aashgar
 */
public class dbConnection {
    private static dbConnection adbConnection;
    private Connection aConnection;
    private Statement aStatement;
    private dbConnection(){}
    public static dbConnection getdbConnection(){
        if(adbConnection == null)
            adbConnection = new dbConnection();
        return adbConnection;
    }
    
    public Statement getStatement() throws SQLException,Exception{
        Class.forName("com.mysql.jdbc.Driver");
        aConnection = DriverManager.getConnection
        ("jdbc:mysql://localhost:3306/university","root","root");
        aStatement = aConnection.createStatement();
       
        return aStatement;
    }
    
}
