package ru.netology.collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void shouldFirstPlayerStreng(){
        Game game= new Game();
        Player player1= new Player(1,"ALIK",70);
        Player player2= new Player(2,"ALI",50);

        game.register(player1);
        game.register(player2);

        int actual=game.round("ALIK","ALI");
        int expected=1;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldSecondPlayerStreng(){
        Game game= new Game();
        Player player1= new Player(1,"ALIK",70);
        Player player2= new Player(2,"ALI",100);

        game.register(player1);
        game.register(player2);

        int actual=game.round("ALIK","ALI");
        int expected=2;

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldEqualPlayerStreng(){
        Game game= new Game();
        Player player1= new Player(1,"ALIK",70);
        Player player2= new Player(2,"ALI",70);

        game.register(player1);
        game.register(player2);

        int actual = game.round("ALIK", "ALI");
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFirstPlayerStreng() {
        Game game = new Game();
        Player player1 = new Player(1, "ALIK", 70);
        Player player2 = new Player(2, "ALI", 70);

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(RuntimeException.class, () -> game.round("ALIK1", "ALI"));
    }

    @Test
    public void shouldNotSecondPlayerStreng() {
        Game game = new Game();
        Player player1 = new Player(1, "ALIK", 70);
        Player player2 = new Player(2, "ALI", 70);

        game.register(player1);
        game.register(player2);


        Assertions.assertThrows(RuntimeException.class, () -> game.round("ALIK", "ALI2"));
    }

}