package fr.lbenoit.billets.codes_sources.eclipse;

public class Cleanup_7_UtilisationTypePrimitif {
    public int maMethode(Double nombre) {
    	Double variableInitialise = new Double("0");
    	
    	if (variableInitialise.doubleValue() > 0.0) {
    		System.out.println(variableInitialise.toString() + 1);
    	}
    	
    	return variableInitialise.compareTo(nombre);
    }
}
