/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author aashgar
 */
public class dbConnection {
    private static dbConnection adbConnection;
    private Connection acConnection;
    private Statement asStatement;
    private dbConnection(){}
    public static dbConnection getdbConnection(){
      if(adbConnection==null)
          adbConnection = new dbConnection();
      return adbConnection;
    }
    
    public Statement getStatement() throws SQLException, Exception{
        Class.forName("com.mysql.jdbc.Driver");
        this.acConnection = DriverManager.
       getConnection("jdbc:mysql://localhost:3306/university","root","root");
        this.asStatement = this.acConnection.createStatement();
        return this.asStatement;
    }
    
}
