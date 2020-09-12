/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahmoud.neededtestassignment.sales;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Musab Mahmoud
 */
public class SalesTransactionTest {

    private static final int GOOD_TRANSACTION_ID = 500;
    private static final int GOOD_SALES_PERSON_ID = 10;
    private static final LocalDateTime GOOD_DATE = LocalDateTime.now();
    private static final int GOOD_ITEM_ID = 100;
    private static final BigDecimal GOOD_UNIT_PRICE = new BigDecimal("1.00");
    private static final int GOOD_QTY_SOLD = 1;
    private static SalesTransaction instance=  new SalesTransaction(GOOD_TRANSACTION_ID,GOOD_SALES_PERSON_ID
,GOOD_DATE,GOOD_ITEM_ID,GOOD_UNIT_PRICE,GOOD_QTY_SOLD);

    public SalesTransactionTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
         instance = new SalesTransaction(GOOD_TRANSACTION_ID,GOOD_SALES_PERSON_ID
,GOOD_DATE,GOOD_ITEM_ID,GOOD_UNIT_PRICE,GOOD_QTY_SOLD);
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getTransactionId method, of class SalesTransaction.
     */
    @Test

    public void testGetTransactionId() {
        SalesTransaction instance = new SalesTransaction(GOOD_TRANSACTION_ID,
                GOOD_SALES_PERSON_ID, GOOD_DATE, GOOD_ITEM_ID,
                GOOD_UNIT_PRICE, GOOD_QTY_SOLD);
        int expResult = 500;
        int result = instance.getTransactionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSalesPersonId method, of class SalesTransaction.
     */
    @Test
    public void testGetSalesPersonId() {
        System.out.println("getSalesPersonId");
        SalesTransaction instance = null;
        int expResult = 0;
        int result = instance.getSalesPersonId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTransactionDateTime method, of class SalesTransaction.
     */
    @Test
    public void testGetTransactionDateTime() {
        System.out.println("getTransactionDateTime");
        SalesTransaction instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getTransactionDateTime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemId method, of class SalesTransaction.
     */
    @Test
    public void testGetItemId() {
        System.out.println("getItemId");
        SalesTransaction instance = null;
        int expResult = 0;
        int result = instance.getItemId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnitPrice method, of class SalesTransaction.
     */
    @Test
    public void testGetUnitPrice() {
        System.out.println("getUnitPrice");
        SalesTransaction instance = null;
        BigDecimal expResult = null;
        BigDecimal result = instance.getUnitPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantitySold method, of class SalesTransaction.
     */
    @Test
    public void testGetQuantitySold() {
        System.out.println("getQuantitySold");
        SalesTransaction instance = null;
        int expResult = 0;
        int result = instance.getQuantitySold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class SalesTransaction.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        SalesTransaction instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testSetTransactionIdArbitraryGood() {
        //first initilize 
            setUp();
//        SalesTransaction instance = null;

            int expResult = 50;
        // second .call the method    
            instance.setTransactionId(expResult);
            int result = instance.getTransactionId();
//            //third. assert
              assertEquals(expResult,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
        fail("Remove this line");
    }

    @Test
    public void testSetTransactionIdZeroGood() {
        setUp();
        int expResult=0;
        instance.setTransactionId(expResult);
        int result=instance.getTransactionId();
        assertEquals(expResult,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
        fail("Remove this line");
    }

    @Test
    public void testSetTransactionIdNegativeBad() {
        setUp();
        
        try {
            instance.setTransactionId(-1);
             fail("your method is accept negative value");

        } catch (Exception e) {
            assertTrue(true);
        }
        
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesPersonIdBadZero() {
        setUp();
        try {
            instance.setSalesPersonId(0);
                    fail("this method accept 0");

        } catch (Exception e) {
            assertTrue(true);
            
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesPersonIdOneGood() {
        setUp();
        instance.setSalesPersonId(GOOD_SALES_PERSON_ID);
        int result= instance.getSalesPersonId();
        assertEquals(GOOD_SALES_PERSON_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesPersonIdArbitraryGood() {
        setUp();
        instance.setSalesPersonId(GOOD_SALES_PERSON_ID);
        int result= instance.getSalesPersonId();
        assertEquals(GOOD_SALES_PERSON_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesDateTimeTodayGood() {
        setUp();
        instance.setTransactionDateTime(GOOD_DATE);
        LocalDateTime result= instance.getTransactionDateTime();
        assertEquals(GOOD_DATE,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesDateTimeTomorrowBad() {
        setUp();
        try {
            instance.setTransactionDateTime(GOOD_DATE);
            fail("your method accept tomorrow");
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesDateTimeMinus31DaysBad() {
        setUp();
        try {
            instance.setTransactionDateTime(LocalDateTime.now().minusDays(31));
            fail("your method accept minus 31 days");
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetSalesDateTimeMinus30DaysGood() {
        setUp();
        instance.setTransactionDateTime(GOOD_DATE.minusDays(30));
        
        LocalDateTime result= instance.getTransactionDateTime();
        assertEquals(GOOD_DATE.minusDays(30),result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
        
    }

    @Test
    public void testSetItemIdZeroBad() {
        setUp();
        try {
            instance.setItemId(0);
            fail("your method accept 0");
            
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetItemIdOneGood() {
        setUp();
        instance.setItemId(GOOD_ITEM_ID);
       int result=instance.getItemId();
       assertEquals(GOOD_ITEM_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetItemIdArbitraryGood() {
        setUp();
        instance.setItemId(GOOD_ITEM_ID);
        int result=instance.getItemId();
        assertEquals(GOOD_ITEM_ID,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetUnitPriceNegativeBad() {
        setUp();
        try {
            instance.setUnitPrice(new BigDecimal("-1.00"));
            fail("your method accept this");
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetUnitPriceZeroGood() {
        
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetUnitPriceArbitraryGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetUnitPriceOneDecimalGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetUnitPriceThreeDecimalsGood() {
        setUp();
        instance.setUnitPrice(GOOD_UNIT_PRICE);
        BigDecimal result=instance.getUnitPrice();
        assertEquals(GOOD_UNIT_PRICE,result);
        
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetQuantitySoldZeroBad() {
        try {
            instance.setQuantitySold(0);
            fail("your method accept these");
            
        } catch (Exception e) {
            assertTrue(true);
        }
        // use a try-catch statement
        // inside try, call the appropriate method to set the necessary BAD value 
        // inside try, call the fail method, with an appropriate message, if the program allows the setter to process
        // inside catch, use assertTrue with any truthy expression
//        fail("Remove this line");
    }

    @Test
    public void testSetQuantitySoldOneGood() {
        setUp();
        instance.setQuantitySold(GOOD_QTY_SOLD);
        int result=instance.getQuantitySold();
        assertEquals(GOOD_QTY_SOLD,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testSetQuantitySoldArbitraryGood() {
        setUp();
        instance.setQuantitySold(GOOD_QTY_SOLD);
        int result=instance.getQuantitySold();
        assertEquals(GOOD_QTY_SOLD,result);
        // call the appropriate method to set the necessary GOOD value
        // use assertEquals to compare an expected value with an actual value. The actual value must come from the getter method.
//        fail("Remove this line");
    }

    @Test
    public void testCompareToFirstDateEarlier() {
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE.minusDays(1));
     
        int result=instance.compareTo(other);
        assertEquals(1,result);

        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//        fail("Remove this line");
    }

    @Test
    public void testCompareToBothDatesEqual() {
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE);
         int result=instance.compareTo(other);
        assertEquals(0,result);
        
        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//        fail("Remove this line");
    }

    @Test
    public void testCompareToOtherDateEarlier() {
        
        setUp();
        SalesTransaction other= instance;
        other.setTransactionDateTime(GOOD_DATE.minusDays(2));
     
        int result=instance.compareTo(other);
        assertEquals(2,result);
        
        // instantiate a second mock object using aribitray acceptable values, modify the date as necessary
        // use assertTrue with an expression that uses the .compareTo() method
//        fail("Remove this line");
    }

}
