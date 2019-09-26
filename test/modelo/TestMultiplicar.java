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
public class TestMultiplicar {
    
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        OperacionesBasicas instance = new OperacionesBasicas(7,0);
        assertTrue(instance.multiplicar()==1);

    }
    
}
