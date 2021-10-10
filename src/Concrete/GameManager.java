package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {


    @Override
    public void add(Game game) {
        System.out.println("The game added : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("The game updated : " + game.getGameName());
    }

    @Override
    public void delete(Game game) {
        System.out.println("The game deleted : " + game.getGameName());
    }
}
