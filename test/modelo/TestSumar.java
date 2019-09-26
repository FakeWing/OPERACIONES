/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestSumar {

    @Test
    public void testSumar() {
        System.out.println("sumar");
        OperacionesBasicas instance = new OperacionesBasicas(1, 3);
        assertTrue(instance.sumar() == 4);
    }

}
