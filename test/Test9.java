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
public class Test9 {
    public static void main(String[] args) {
        BattleField f = new BattleField(10,12);
        Player[] players = {new Player(2,5,"Oak"), new Player(1,9,"Bb"), new Player(3,1,"Cc"), new Player(6,11,"dd")};
        PUBFGame g = new PUBFGame(f, players); 
	g.play(10);
        
    }
    
}
