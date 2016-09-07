/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author aashgar
 */
public class StratgeDB {
    
    private Student aStudent;
    
    public StratgeDB(Student aStudent){
         this.aStudent = aStudent;
    }
     
    
    public int ComputGrade(int Mid,int Final){
       
       return this.aStudent.calcGrade(Mid, Final);
        
    }
}
