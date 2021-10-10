package Concrete;

import Abstract.GamerCheckService;
import Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {


    @Override
    public boolean ifCheckRealPerson(Gamer gamer) {
        return true;
    }
}
