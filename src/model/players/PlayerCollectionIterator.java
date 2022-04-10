package model.players;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

class PlayerCollectionIterator implements Iterator<GamePlayer> {

    private ArrayList<GamePlayer> gamePlayers;
    int count = 0;

    public PlayerCollectionIterator(ArrayList<GamePlayer> gamePlayers) {
        this.gamePlayers = gamePlayers;
    }

    @Override
    public boolean hasNext() {
        return count < gamePlayers.size();
    }

    @Override
    public GamePlayer next() {
        GamePlayer gamePlayer = gamePlayers.get(count);
        count++;
        return gamePlayer;
    }

    @Override
    public void remove() {
        gamePlayers.remove(count);
    }

    @Override
    public void forEachRemaining(Consumer<? super GamePlayer> action) {
        Iterator.super.forEachRemaining(action);
    }
}
