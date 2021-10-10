package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

    private GamerCheckService gamerCheckService ;

    public GamerManager(GamerCheckService gamerCheckService) {
        this.gamerCheckService = gamerCheckService;
    }

    @Override
    public void register(Gamer gamer) {

        if(this.gamerCheckService.ifCheckRealPerson(gamer)){
            System.out.println("User added : "+gamer.getFirstName() + " " + gamer.getLastName());
        }else{
            System.out.println("Not a valid person");
        }
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println("User updated : "+gamer.getFirstName());
    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println("User deleted : "+gamer.getFirstName());
    }
}
