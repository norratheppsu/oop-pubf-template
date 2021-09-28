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
public class Test10 {
    public static void main(String[] args) {
        BattleField f = new BattleField(10,12);
	Player[] players = new Player[10];
	for(int i=0; i<10; i++) {
		String name = ""+((char)(97+i))+'a';
		players[i] = new Player(i,i, name);
	}
        PUBFGame g = new PUBFGame(f, players); 
	g.play(100);
        
    }
    
}
