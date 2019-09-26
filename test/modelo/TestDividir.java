/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Fake Wings
 */
public class TestDividir {

    @Test
    public void testDividir() {
        System.out.println("dividir");
        OperacionesBasicas instance = new OperacionesBasicas(8, 0);
        assertTrue(instance.dividir() == 0);

    }
}
