package fr.lbenoit.billets.codes_sources;

import org.junit.Test;

public class NullPointerExceptionHelpulTableauTest {

    @Test (expected=NullPointerException.class)
    public void testTableau() {
        try {
            int[][][] tab = new int[5][][];
            
            int i = 1;
            int j = 2;
            int k = 4;
            tab[i] = new int[5][];

            tab[i][j][k] = 25;
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
    }

 
}