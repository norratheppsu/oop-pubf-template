/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * Test 12

 */
public class Test12 {
    public static void main(String[] args) {
        BattleField f = new BattleField(17,13);
	Player[] players = new Player[4];
	players[0] = new Player(0,0,"Aaron");
	players[1] = new Player(16,10,"Ben");
	players[2] = new Player(5,7,"Carl");
	players[3] = new Player(15,10,"Doug");
        PUBFGame g = new PUBFGame(f, players);
	g.phase4PrintBattleField();
	g.phase1PlayersTakeAction();
	g.phase2PlayersMove();
	g.phase3RemoveInvalidPlayers();
	g.phase4PrintBattleField();
	boolean gameover = g.phase5Gameover();
	while(gameover == false)	gameover = g.playOneRound();
        
    }
    
}
