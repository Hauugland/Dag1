package no.kristiania;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Oppgave1 {
    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", toRoman(1));
    }

    private int toRoman(int i) {
        return i;
    }
}
