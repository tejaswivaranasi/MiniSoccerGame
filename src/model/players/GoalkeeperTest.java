package model.players;

import model.SoccerBall;
import model.SoccerGame;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class GoalkeeperTest {

    @Test
    void moveLeft() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        double x = Goalkeeper.getPlayerPosition().getX();
        Goalkeeper.moveLeft();
        assertEquals(Goalkeeper.getPlayerPosition().getX(),Goalkeeper.getPlayerPosition().getX());
    }

    @Test
    void moveRight() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        double x = Goalkeeper.getPlayerPosition().getX();
        Goalkeeper.moveRight();
        assertEquals(Goalkeeper.getPlayerPosition().getX(),Goalkeeper.getPlayerPosition().getX());
    }

    @Test
    void moveUp() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        double y = Goalkeeper.getPlayerPosition().getY();
        Goalkeeper.moveUp();
        assertEquals((y-5.0),Goalkeeper.getPlayerPosition().getY());

    }

    @Test
    void moveDown() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        double y = Goalkeeper.getPlayerPosition().getY();
        Goalkeeper.moveUp();
        Goalkeeper.moveDown();
        assertEquals(y,Goalkeeper.getPlayerPosition().getY());
    }
    @Test
    void shootBall() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        SoccerBall ball = SoccerBall.getSoccerBall();
        Point initialPosition = ball.getPosition();
        Goalkeeper.shootBall();
        Point finalPosition = ball.getPosition();
        assertNotEquals(initialPosition.getY(),finalPosition.getY());
    }

    @Test
    void moveRandomly() {




    }

    @Test
    void setInitialPosition() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        Point initialPosition = new Point(280, 70);
        assertEquals(initialPosition,Goalkeeper.getPlayerPosition());
    }

    @Test
    void testToString() {
        GamePlayer Goalkeeper = new Goalkeeper("goalkeeper", Color.yellow);
        assertEquals("goalkeeper caught 0 balls",Goalkeeper.toString());
        
    }
}