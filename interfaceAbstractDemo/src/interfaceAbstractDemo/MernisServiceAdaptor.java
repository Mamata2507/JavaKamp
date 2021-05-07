package interfaceAbstractDemo;

import java.util.GregorianCalendar;
import java.util.Date;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

     KPSPublicSoapProxy client = new KPSPublicSoapProxy();
     return client.TCKimlikNoDogrula(customer.getNationalityId(),customer.getFirstName().toUpperCase(),
    		 customer.getLastName().toUpperCase(),customer.getDateofBirth().getTime());
	}

}
