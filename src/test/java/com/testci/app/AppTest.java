package com.testci.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    App a_test_object = new App();
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

   @Test
    public void retSum(){
        assertEquals(a_test_object.basicSum(1,3),4);
   }
    @Test
    public void test_3(){
        assertEquals(a_test_object.basicSum(1,2),3);
    }
    @Test
    public void test_4(){
        assertEquals(a_test_object.basicSum(1,1),2);
    }
}
