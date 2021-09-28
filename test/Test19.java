package src;

/**
 *
 * Test Wanderer
 */
public class Test19 {
    
    public static void main(String[] args) {
        
        Player[] players = {new Wanderer(5, 5, "Wan")};
        BattleField f = new BattleField(10,10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase2PlayersMove();
        g.phase4PrintBattleField();
        
    }
}
