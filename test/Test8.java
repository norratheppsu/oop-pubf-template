/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * Test simple play()
 */
public class Test8 {
    public static void main(String[] args) {
        Player[] players = {};
        BattleField f = new BattleField(10,12);
        PUBFGame g = new PUBFGame(f, players); 
	g.play(10);

        Player[] players2 = {new Player(9,6,"Bb"), new Player(6,11,"dd")};
	g = new PUBFGame(f, players2); 
	g.play(10);
        
    }
    
}
