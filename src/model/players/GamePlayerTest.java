package model.players;

import model.SoccerBall;
import model.SoccerGame;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class GamePlayerTest {

    @Test
    void isPlayerHasBall() {
        boolean playerHasBall = false;
        SoccerGame game = new SoccerGame();
        SoccerBall ball = SoccerBall.getSoccerBall();
        Point playerPosition = game.getActivePlayer().getPlayerPosition();
        Point ballPosition = ball.getPosition();
        if((Math.abs((playerPosition.getX()+15) - ballPosition.getX()) < 55) && (Math.abs((playerPosition.getY() + 30)- ballPosition.getY()) < 55)) {
            playerHasBall = true;
        }
        assertTrue(playerHasBall);
    }

    @Test
    void grabsBall() {


    }

    @Test
    void getPlayerName() {
        GamePlayer striker = new Striker("striker", Color.blue);
        assertEquals("striker",striker.getPlayerName());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        assertEquals("goalkeeper",Goalkeeper.getPlayerName());

    }

    @Test
    void getPlayerColor() {
        GamePlayer striker = new Striker("striker", Color.blue);
        assertEquals(Color.blue,striker.getPlayerColor());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        assertEquals(Color.yellow,Goalkeeper.getPlayerColor());
    }

    @Test
    void getPlayerPosition() {
        GamePlayer striker = new Striker("striker", Color.blue);
        assertEquals(new Point(500,450),striker.getPlayerPosition());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        assertEquals(new Point(280,70),Goalkeeper.getPlayerPosition());


    }

    @Test
    void setInitialPosition() {
        GamePlayer striker = new Striker("striker", Color.blue);
        striker.setInitialPosition();
        assertEquals(new Point(500,450),striker.getPlayerPosition());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        Goalkeeper.setInitialPosition();
        assertEquals(new Point(280,70),Goalkeeper.getPlayerPosition());
    }

    @Test
    void setPlayerPosition() {
        GamePlayer striker = new Striker("striker", Color.blue);
        striker.setPlayerPosition(new Point(300,300));
        assertEquals(new Point(300,300),striker.getPlayerPosition());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        Goalkeeper.setPlayerPosition(new Point(100,100));
        assertEquals(new Point(100,100),Goalkeeper.getPlayerPosition());
    }

    @Test
    void getPlayerStatistics() {
        GamePlayer striker = new Striker("striker", Color.blue);
        assertEquals(0,striker.getPlayerStatistics());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        assertEquals(0,Goalkeeper.getPlayerStatistics());
    }

    @Test
    void setPlayerStatistics() {
        GamePlayer striker = new Striker("striker", Color.blue);
        striker.setPlayerStatistics(3);
        assertEquals(3,striker.getPlayerStatistics());

        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        Goalkeeper.setPlayerStatistics(2);
        assertEquals(2,Goalkeeper.getPlayerStatistics());

    }

    @Test
    void compareTo() {
        GamePlayer striker1 = new Striker("striker1", Color.blue);
        striker1.setPlayerStatistics(3);

        GamePlayer striker2 = new Striker("striker2", Color.red);
        striker2.setPlayerStatistics(1);

        assertEquals(1,striker1.compareTo(striker2));
        assertEquals(-1,striker2.compareTo(striker1));
    }

}