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
public class StratgeApp {
    
    public static void main(String[] args) {
        
        StratgeDB s = new StratgeDB(new ITSutdent());
        StratgeDB s2 = new StratgeDB(new ARTSudent());
        
        
        System.out.println("ITStudent :" +s.ComputGrade(70, 80));
        System.out.println("ARTStudent :"+s2.ComputGrade(70, 80));
    }
}
