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
public class Test15 {
    public static void main(String[] args) {
        BattleField f = new BattleField(17,13);
	Player[] players = new Player[26];
	for(int i=0; i<26; i++) {
		String name = ""+((char)(65+i))+"_test";
		players[i] = new Player((i*i+18)%17,(i*i+5)%13, name);
	}

        PUBFGame g = new PUBFGame(f, players);
	g.play(1000);
    }
    
}
