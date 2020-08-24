package com.lithial.amazingtranslator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void checkDatabases() throws Exception {
        assert(LanguageDatabase.getTranslation(3,0).equals("three"));
    }
    @Test
    public void checkInput() throws Exception {
        InputCollector input = new InputCollector();
        assert(input.GetNumber("22") == 22);
    }

}
