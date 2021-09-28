/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * Test Player's move method
 */
public class Test2 {
    public static void main(String[] args) {
        int maxX = 5, maxY = 8;
        Player player = new Player(4,3,"Oak");
        System.out.println("Is at (4,3)?: " + player.isAt(4,3));
        player.move(maxX, maxY);
        System.out.println("Is at (4,4)?: " + player.isAt(4,4));
        player.move(maxX, maxY);
        System.out.println("Is at (4,5)?: " + player.isAt(4,5));
        player = new Player(4,7,"Oak");
        System.out.println("Is at (4,7)?: " + player.isAt(4,7));
        player.move(maxX, maxY);
        System.out.println("Is at (4,7)?: " + player.isAt(4,7));
    }
}
