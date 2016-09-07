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
public class Test {
 
    public static void main(String[] args) {
        Context context = new Context(new Addition());
       Context context2 = new Context(new Multiplay());

        System.out.println("10 + 5 = "+context.Execute(10, 5));
        System.out.println("10 * 5 = "+context2.Execute(10, 5));

        
    }
}
