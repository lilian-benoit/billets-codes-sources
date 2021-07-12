package fr.lbenoit.billets.codes_sources.eclipse;

public class Cleanup_3_OrganiseIfExterieur {
    public void maMethode(boolean isValide, boolean isActive) {
        if (isValide) {
            if (isActive) {
                System.out.println("123");
            }
        } else if (isActive) { 
            System.out.println("456");
        }
    }
}
