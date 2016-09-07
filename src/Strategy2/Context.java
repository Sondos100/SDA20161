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
public class Context {
    
    private StrategyIntr strategy;
    
    public Context(StrategyIntr st){
        this.strategy =st;
        
    }
    
   public int Execute(int num1 , int num2){
       return this.strategy.doOperation(num1, num2);
   }
}
