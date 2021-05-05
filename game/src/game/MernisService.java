package game;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisService implements PlayerCheckService  {

	@Override
	public boolean chechIfRealPerson(Player player) {
		KPSPublicSoap kpsPublicSoap=new KPSPublicSoapProxy();
		try {
			System.out.println(			kpsPublicSoap.TCKimlikNoDogrula(123456, player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getYear()));

		} catch (Exception e) {
			System.out.println("Not a valid person");
			
		}
		
		return false ;	
	}

}
