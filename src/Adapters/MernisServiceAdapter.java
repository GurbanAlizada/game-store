package Adapters;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.LNQKPSPublicSoap;

public class MernisServiceAdapter implements GamerCheckService {


    LNQKPSPublicSoap client = new LNQKPSPublicSoap();

    @Override
    public boolean ifCheckRealPerson(Gamer gamer) {
        try {
            return client.TCKimlikNoDogrula(Long.valueOf(gamer.getNationalityId()), gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false ;
    }



}
