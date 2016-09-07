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
public class ARTSudent implements Student{

    @Override
    public int calcGrade(int Mid, int Final) {
        
        return Mid*30/100 + Final*70/100;
    }
    
}
