package model.players;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class PlayerFactoryTest {

    @Test
    void getPlayer() {
        String Striker = "striker";
        String Goalkeeper = "goalkeeper";
        GamePlayer playerS = new Striker(Striker, Color.blue);
        GamePlayer playerG = new Striker(Goalkeeper, Color.yellow);

        PlayerFactory Factory = new PlayerFactory();

        assertEquals(Factory.getPlayer(Striker).getPlayerName().toLowerCase(),playerS.getPlayerName().toLowerCase());
        assertEquals(Factory.getPlayer(Goalkeeper).getPlayerName().toLowerCase(),playerG.getPlayerName().toLowerCase());





    }
}