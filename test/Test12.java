
package src;

/**
 *
 * Test Sniper
 */
public class Test12 {
    
    public static void main(String[] args) {
        
        Player[] players = {new Player(5,4,"Normal"), new Sniper(5, 6, "Sniper")};
        BattleField f = new BattleField(10,10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase4PrintBattleField();
        g.playOneRound();
        
    }
}
