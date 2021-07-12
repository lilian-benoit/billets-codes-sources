package fr.lbenoit.billets.codes_sources.eclipse;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Cleanup_9_UtilisationComparateurImplicite {
    public void maMethode(List<Date> listeAtrier) {
    	Collections.sort(listeAtrier, new Comparator<Date>() {

			@Override
			public int compare(Date arg0, Date arg1) {
				return arg0.compareTo(arg1);
			}
		});
    }
}
