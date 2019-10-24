package fr.lbenoit.billets.codes_sources;

import org.junit.Test;

public class NullPointerExceptionHelpulSimpleTest {

    @Test (expected=NullPointerException.class)
    public void testSimple() {
        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Test (expected=NullPointerException.class)
    public void testException() {
        try {
            throw null;
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw e;
        }
    }
}