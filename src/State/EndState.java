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
public class EndState implements GameState{

    @Override
    public void addState(Player player) {
        player.setState(this);
        System.out.println("Player in End State");
    }

    @Override
    public void view() {
        System.out.println("End State..");
    }
    
}
