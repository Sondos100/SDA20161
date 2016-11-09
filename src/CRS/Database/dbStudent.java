/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRS.Database;


import CRS.Applogic.Student;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aashgar
 */
public class dbStudent {
    private Statement aStatement;
    public void addStudent(Student aStudent){
        dbConnection adbConnection =
                dbConnection.getdbConnection();
        String sql = "Insert into students(name,major,grade) values('"+
                aStudent.getName()+"','"+
                aStudent.getMajor()+"',"+
                aStudent.getGrade()+")";
        try {
            aStatement = adbConnection.getStatement();
            aStatement.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(dbStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
