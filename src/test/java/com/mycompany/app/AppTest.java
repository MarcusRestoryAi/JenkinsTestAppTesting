package com.mycompany.app;

import org.example.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testAppConstructor() {
        Main app1 = new Main();
        Main app2 = new Main();
        assertEquals(app1.getMessage(), app2.getMessage());
    }

    @Test
    public void testAppMessage()
    {
        Main app = new Main();
        assertEquals("Hello World!", app.getMessage());
    }
}
