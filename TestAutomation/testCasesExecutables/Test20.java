package org.openmrs;

import org.openmrs.util.ProviderByPersonNameComparator;
import org.openmrs.User;
import org.openmrs.Provider;

public class Test20 {
	
	public static void main(String[] args) {
		ProviderByPersonNameComparator n = new ProviderByPersonNameComparator();
//		Provider provider1 = new Provider(1);
//		Provider provider2 = new Provider(1);

		Provider provider1 = new Provider(Integer.parseInt(args[0]));
		Provider provider2 = new Provider(Integer.parseInt(args[1]));
		
		System.out.println(n.compare(provider1, provider2));
	}
}
