package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements SaleService {



    @Override
    public void sale(Gamer gamer, Game game, Campaign campaign) {
        double price = game.getPrice() - ((game.getPrice() * campaign.getDiscount())/100);
        System.out.println(gamer.getFirstName() + " " + gamer.getLastName() +
                " bought game "+ game.getGameName() + " with "+ campaign.getCampaignName()+
                "\nPrice : "+price+"$");
    }




}
