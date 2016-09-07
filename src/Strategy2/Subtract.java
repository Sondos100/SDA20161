/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy2;

/**
 *
 * @author aashgar
 */
public class Subtract implements StrategyIntr {

    @Override
    public int doOperation(int num1 , int num2) {
       return num1 - num2;  
    }
    
}
