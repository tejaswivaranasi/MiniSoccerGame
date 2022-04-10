package model.players;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCollectionIteratorTest {
    @Test
    public void hasNext(){
        ArrayList<GamePlayer> gamePlayers = new ArrayList<>();
        GamePlayer striker = new Striker("striker",Color.blue);
        PlayerCollectionIterator itr = new PlayerCollectionIterator(gamePlayers);
        gamePlayers.add(striker);
        assertEquals(true,itr.hasNext());
    }

    @Test
    public void next(){
        ArrayList<GamePlayer> gamePlayers = new ArrayList<>();
        GamePlayer striker = new Striker("striker",Color.blue);
        PlayerCollectionIterator itr = new PlayerCollectionIterator(gamePlayers);
        gamePlayers.add(striker);
        assertEquals(striker.playerName,itr.next().playerName);
    }

    @Test
    public void remove(){
        ArrayList<GamePlayer> gamePlayers = new ArrayList<>();
        GamePlayer striker = new Striker("striker",Color.blue);
        PlayerCollectionIterator itr = new PlayerCollectionIterator(gamePlayers);
        gamePlayers.add(striker);
        itr.remove();
        assertEquals(false,itr.hasNext());
    }

    @Test
    public void forEachRemaining(){

    }
}