/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.test1;



import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import com.tracy.test1.config.AppConfig;
import com.tracy.test1.service.CalcService;
import com.tracy.test1.service.Impl.CalcServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CalcTest {
    
    private static CalcService service;
    
    public CalcTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void assertCalculations()
     {
         //Assertion Message
         Assert.assertEquals(service.add(2,6), 8, "Assertion adding two numbers failed");
         
         //Floating type assertion
         Assert.assertEquals(service.divi(2.5, 0.5), 5.0);
         
         //Integer type assertion
         Assert.assertEquals(service.multi(3, 5), 15);
     }
     
     @Test 
     public void assertObjects()
     {
         //Object Comparisons (equality)
         String msg = "Hello";
         Assert.assertEquals(service.myObject("Hello"), msg );
         
         //Object Comparisons (identity)
         Integer num = 12;
         Assert.assertSame(service.myObject(12), num);
         Assert.assertNotSame(service.myObject(13), num);
         
     }
     
     @Test
     public void assertBool()
     {
         //Asserting Truths
         Assert.assertTrue(service.greater(9, 7), "First parameter is greater");
         
         //Asserting Falsity
         Assert.assertFalse(service.greater(1, 8), "First parameter is greater");
     }
     
     @Test
     public void assertNulls()
     {
         //Asserting Nullness
         Integer number = null;
         Assert.assertNull(service.checkNull(number));
         
         //Asserting Non Nullness
         String word = "Dog";
         Assert.assertNotNull(service.checkNull(word));
     }
     
     

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (CalcService)ctx.getBean("cals");
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
