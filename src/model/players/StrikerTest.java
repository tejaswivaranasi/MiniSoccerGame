package model.players;

import model.SoccerBall;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;
import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class StrikerTest {

    @Test
    void moveLeft() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        double x = Striker.getPlayerPosition().getX();
        Striker.moveLeft();
        assertEquals((x-5.0),Striker.getPlayerPosition().getX());
    }

    @Test
    void moveRight() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        double x = Striker.getPlayerPosition().getX();
        Striker.moveRight();
        assertEquals((x+5.0),Striker.getPlayerPosition().getX());
    }

    @Test
    void moveUp() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        double y = Striker.getPlayerPosition().getY();
        Striker.moveUp();
        assertEquals((y-5.0),Striker.getPlayerPosition().getY());

    }

    @Test
    void moveDown() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        double y = Striker.getPlayerPosition().getY();
        Striker.moveUp();
        Striker.moveDown();
        assertEquals(y,Striker.getPlayerPosition().getY());
    }

    @Test
    void shootBall() {GamePlayer Striker = new Striker("striker", Color.yellow);
        SoccerBall ball = SoccerBall.getSoccerBall();
        Point initialPosition = ball.getPosition();
        Striker.shootBall();
        Point finalPosition = ball.getPosition();
        assertEquals(initialPosition.getY(),finalPosition.getY());  // why equals ??
    }

    @Test
    void setInitialPosition() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        Point initialPosition = new Point(500, 450);
        assertEquals(initialPosition,Striker.getPlayerPosition());

    }

    @Test
    void testToString() {
        GamePlayer Striker = new Striker("striker", Color.blue);
        assertEquals("striker scored 0 goals",Striker.toString());
    }
}