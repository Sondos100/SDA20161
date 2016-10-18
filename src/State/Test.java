/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author aashgar
 */
public class Test {
    public static void main(String[] args) {
        Player player = new Player ();
        
        StartState start = new StartState ();
        start.addState(player);
        
        player.getState().view();
        
        WaitState wait = new WaitState ();
        wait.addState(player);
        
        player.getState().view();
    }
}
