package fr.lbenoit.billets.codes_sources.eclipse;

public class Cleanup_12_RemplacerProprietesParConstante {
    public void maMethode() {
    	String s = System.getProperty("file.separator");
    	String t = System.getProperty("line.separator");
    	String u = System.getProperty("file.encoding");
    	String v = System.getProperty("path.separator");
    	Boolean x = Boolean.parseBoolean(System.getProperty("ma.propriete"));
    }
}
