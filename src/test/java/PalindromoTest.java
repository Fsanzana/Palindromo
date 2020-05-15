import static org.junit.Assert.*;

public class PalindromoTest {
    Palindromo p;
    @org.junit.Before
    public void setUp() throws Exception {
        p = new Palindromo();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void esPalindromo() {
        assertTrue(p.esPalindromo("Anita lava la tina"));
        assertFalse(p.esPalindromo("gatito"));
        assertTrue(p.esPalindromo("alli ves a sevilla"));
        assertFalse(p.esPalindromo("anita no lava la tina"));
        assertTrue(p.esPalindromo("anita lava la tína"));
        assertFalse(p.esPalindromo("200"));
        assertTrue(p.esPalindromo("1 anita lava la tina 1"));
        assertTrue(p.esPalindromo("añita lava la tiña"));
        assertFalse(p.esPalindromo("anita, lava, la, tina"));
        assertTrue(p.esPalindromo(""));
        assertTrue(p.esPalindromo("°|!#$%&/()=?'¡¿´¨+*~}]`{[^,;.:-__-:.;,^[{`]}~*+¨´¿¡'?=)(/&%$#!|°"));
    }
}