package fr.lbenoit.billets.codes_sources.securite.filtre;

import java.io.ObjectInputFilter;

public class MonFiltre implements ObjectInputFilter {

	@Override
	public Status checkInput(FilterInfo arg0) {
		if (arg0.serialClass() == null) {
			return Status.ALLOWED;
		}
		System.out.println("class : " + arg0.serialClass());
		if (arg0.serialClass().getName().startsWith("fr.lbenoit.billets.codes_sources.securite.deserialisation.filtre.modele")) {
			return Status.ALLOWED;
		} else {
			return Status.REJECTED;
		}
	}

}
