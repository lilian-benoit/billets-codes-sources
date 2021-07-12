package fr.lbenoit.billets.codes_sources.eclipse;

public class Cleanup_4_UnSeulBlocIf {
	public void maMethode(int nombre) {
        if (nombre == 0) {
           System.out.println("123");
           return;
        }
        if (nombre == 1) {
           System.out.println("123");
           return;
        }
        System.out.println("456");
    }
}
