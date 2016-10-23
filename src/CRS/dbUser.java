/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class dbUser {
    private Statement aStatement;
    public boolean verifyUser(String userName, String password){
        boolean isFound= false;
        dbConnection adbConnection= dbConnection.getdbConnection();
        try {
            this.aStatement = adbConnection.getStatement();
            ResultSet rs = this.aStatement.
           executeQuery("Select * from users where userName='"+userName +
                   "' and password='"+password+"'");
            if(rs.next())
                isFound = true;
        } catch (Exception ex) {
            Logger.getLogger(dbUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isFound;
    }
    
}
