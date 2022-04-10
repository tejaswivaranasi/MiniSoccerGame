package model.players;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PlayerCollectionTest {

    @Test
    public void get(){

        PlayerCollection collection = new PlayerCollection();

        GamePlayer Striker = new Striker("Striker", Color.RED);
        collection.add(Striker);
        assertEquals(collection.get("Striker").playerName, Striker.playerName);

        GamePlayer Goalkeeper = new Goalkeeper("Goalkeeper", Color.BLACK);
        collection.add(Goalkeeper);
        assertEquals(collection.get("Goalkeeper").playerName, Goalkeeper.playerName);

        assertEquals(collection.get(""), null);

    }

    @Test
    public void iterator(){
    /*    PlayerCollection collection = new PlayerCollection();

        GamePlayer Striker = new Striker("Striker", Color.RED);
        collection.add(Striker);

        GamePlayer Goalkeeper = new Goalkeeper("Goalkeeper", Color.BLACK);
        collection.add(Goalkeeper);

        Collection<GamePlayer> list = new ArrayList<>();
        list.add(Striker);
        list.add(Goalkeeper);

        PlayerCollectionIterator iteratePlayerCollection1 = new PlayerCollectionIterator((ArrayList<GamePlayer>) list);
*/
    }

}