package fr.lbenoit.billets.codes_sources;

import org.junit.Test;

public class NullPointerExceptionHelpulHolderTest {

    @Test (expected=NullPointerException.class)
    public void testHolder() {
        try {
            StringHolder holder = new StringHolder();
            isVide(holder);
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public boolean isVide(StringHolder holder) {
        return (holder.getChaine().length() > 0);
    }
}