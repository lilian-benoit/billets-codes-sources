package fr.lbenoit.billets.codes_sources.securite.filtre;

import java.io.ObjectInputFilter;

public class LoggerFiltre implements ObjectInputFilter {

	@Override
	public Status checkInput(FilterInfo arg0) {
		if (arg0.serialClass() == null) {
			return Status.ALLOWED;
		}
		System.err.println(arg0.serialClass().getName());
		return Status.ALLOWED;
	}

}
