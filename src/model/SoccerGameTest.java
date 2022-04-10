package model;

import model.players.GamePlayer;
import model.players.Goalkeeper;
import model.players.PlayerCollection;

import model.players.PlayerFactory;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class SoccerGameTest {

    @Test
    void getTimeRemaining() {
        SoccerGame game = new SoccerGame();
        assertEquals(60,game.getTimeRemaining());
    }

    @Test
    void setTimeRemaining() {
        SoccerGame game = new SoccerGame();
        game.setTimeRemaining(120);
        assertEquals(120,game.getTimeRemaining());
    }

    @Test
    void getGoal() {
        SoccerGame game = new SoccerGame();
        assertEquals(0,game.getGoal());
    }

    @Test
    void setGoal() {
        SoccerGame game = new SoccerGame();
        game.setGoal(2);
        assertEquals(2,game.getGoal());
    }

    @Test
    void isPaused() {
        SoccerGame game = new SoccerGame();
        assertFalse(game.isPaused());

        game.setPaused(true);
        assertTrue(game.isPaused());
    }

    @Test
    void setPaused() {
        SoccerGame game = new SoccerGame();
        game.setPaused(true);
        assertTrue(game.isPaused());
        game.setPaused(false);
        assertFalse(game.isPaused());
    }

    @Test
    void isOver() {
        SoccerGame game = new SoccerGame();
        assertFalse(game.isOver());

        game.setOver(true);
        assertTrue(game.isOver());
    }

    @Test
    void setOver() {
        SoccerGame game = new SoccerGame();
        game.setOver(true);
        assertTrue(game.isOver());

    }

    @Test
    void getGamePlayers() {
        SoccerGame game = new SoccerGame();
        PlayerCollection playersList = new PlayerCollection();

        PlayerFactory playerFactory = new PlayerFactory();;
        playersList.add(playerFactory.getPlayer("striker"));
        playersList.add(playerFactory.getPlayer("goalkeeper"));

//        assertEquals("striker",game.getGamePlayers().iterator().next().getPlayerName());
       // assertTrue(false);

    }

    @Test
    void automateGoalkeeper() {
        SoccerGame game = new SoccerGame();
        PlayerCollection gamePlayers = game.getGamePlayers();
        Goalkeeper goalkeeper = (Goalkeeper) gamePlayers.get("Goalkeeper");

        SoccerBall.getSoccerBall().setPosition(new Point(100,100));
        game.automateGoalkeeper();
        assertEquals(1,goalkeeper.getPlayerStatistics());

        SoccerBall.getSoccerBall().setPosition(new Point(400,400));
        game.automateGoalkeeper();
        assertEquals(1,goalkeeper.getPlayerStatistics());
    }

    @Test
    void isScored() {
        SoccerGame game = new SoccerGame();
        assertEquals(SoccerBall.getSoccerBall().inGate(), game.isScored());
    }

    @Test
    void getActivePlayer() {
        SoccerGame game = new SoccerGame();
        PlayerCollection playersList = new PlayerCollection();

        PlayerFactory playerFactory = new PlayerFactory();;
        GamePlayer player = playerFactory.getPlayer("Striker");
        playersList.add(player);

        assertEquals("Striker",game.getActivePlayer().getPlayerName());
    }
}