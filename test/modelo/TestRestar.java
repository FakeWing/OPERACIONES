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
public class TestRestar {
    
    
    @Test
    public void testRestar() {
        System.out.println("restar");
        OperacionesBasicas instance = new OperacionesBasicas(1,9);
        assertTrue( instance.restar()==0);
  
    }
}
