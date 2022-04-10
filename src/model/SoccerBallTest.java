package model;

import model.players.GamePlayer;
import model.players.Striker;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.net.SocketException;

import static org.junit.jupiter.api.Assertions.*;

class SoccerBallTest {

    @Test
    void moveBall() {
    }

    @Test
    void moveBallY() {
        SoccerBall.getSoccerBall().setPosition(new Point(500,490));
        SoccerBall.getSoccerBall().moveBallY(10);
        assertEquals(480,SoccerBall.getSoccerBall().getPosition().getY());
        SoccerBall.getSoccerBall().setPosition(new Point(550,550));
    }

    @Test
    void resetSoccerBall() {
        SoccerBall.getSoccerBall().setPosition(new Point(100,400));
        SoccerBall.getSoccerBall().resetSoccerBall();
        assertEquals(500,SoccerBall.getSoccerBall().getPosition().getY());
        assertEquals(480,SoccerBall.getSoccerBall().getPosition().getX());
    }

    @Test
    void onGoalkeeperSide() {
        SoccerBall.getSoccerBall().setPosition(new Point(100,100));
        assertTrue(SoccerBall.getSoccerBall().onGoalkeeperSide());

        SoccerBall.getSoccerBall().setPosition(new Point(300,300));
        assertFalse(SoccerBall.getSoccerBall().onGoalkeeperSide());

    }

    @Test
    void inGate() {
        SoccerBall.getSoccerBall().setPosition(new Point(200,30));
        assertTrue(SoccerBall.getSoccerBall().inGate());

        SoccerBall.getSoccerBall().setPosition(new Point(500,70));
        assertFalse(SoccerBall.getSoccerBall().inGate());

    }


    @Test
    void getPosition() {
        SoccerBall.getSoccerBall().setPosition(new Point(500,500));
        assertEquals(new Point(500,500),SoccerBall.getSoccerBall().getPosition());
    }

    @Test
    void setPosition() {
        SoccerBall.getSoccerBall().setPosition(new Point(500,500));
        assertEquals(new Point(500,500),SoccerBall.getSoccerBall().getPosition());
    }

    @Test
    void getColor() {
        assertEquals(Color.white, SoccerBall.getSoccerBall().getColor());
    }
}