package test;

import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertTrue;

public class AccountSystemTest {
    @Test
    public void name() {
        assertTrue(true);
    }

    @Test
    public void age() {
        assertTrue(true);
    }

    @Ignore("not ready yet") @Test
    public void address() {
        assertTrue(true);
    }
}
