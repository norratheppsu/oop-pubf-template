package src;

/**
 * Test Warrior
 */
public class Test15 {
    
    
    public static void main(String[] args) {
        
        Player[] players = {new Player(5,4,"Normal"), new Warrior(5, 5, "War")};
        BattleField f = new BattleField(10,10);
        PUBFGame g = new PUBFGame(f, players);
        g.phase4PrintBattleField();
        g.playOneRound();
        
    }
}
