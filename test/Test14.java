/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * Private testcase
 */
public class Test14 {
    public static void main(String[] args) {
        BattleField f = new BattleField(17,13);
	Player[] players = new Player[4];
	players[0] = new Player(0,0,"Aaron");
	players[1] = new Player(16,10,"Ben");
	players[2] = new Player(5,7,"Carl");
	players[3] = new Player(15,10,"Doug");
        PUBFGame g = new PUBFGame(f, players);
	g.play(1000000);
    }
    
}
