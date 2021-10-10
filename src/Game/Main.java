package Game;

import Adapters.MernisServiceAdapter;
import Concrete.*;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer( "Engin" , "Demiroğ" , "dsdsdsds@gmail.com","12345" ,34, LocalDate.of(1985 , 1 , 6) , 28861499108L );
        Game game = new Game(1 ,"FIFA 21" , 120 , LocalDate.of(2022 , 1 , 3));
        Campaign campaign = new Campaign(1 , "New Year Campaign" , LocalDate.of(2021,12 , 25) ,LocalDate.of(2022,1 , 3) , 10);

        GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
        gamerManager.register(gamer);

        GameManager gameManager = new GameManager();
        gameManager.add(game);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);

        SaleManager saleManager = new SaleManager();
        saleManager.sale(gamer , game , campaign);


    }
}
