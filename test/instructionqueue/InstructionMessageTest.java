package instructionqueue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

public class InstructionMessageTest {
    
    public InstructionMessageTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    public ExpectedException thrown = ExpectedException.none();
    
    /**
     * Test of getInstructionType method, of class InstructionMessage.
     */
    @Test
    public void testGetInstructionType() {
        System.out.println("getInstructionType");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 11;
        instance.setInstructionType(expResult);
        int result = instance.getInstructionType();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProductCode method, of class InstructionMessage.
     */
    @Test
    public void testGetProductCode() {
        System.out.println("getProductCode");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 22;
        instance.setProductCode(expResult);
        int result = instance.getProductCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getQuantity method, of class InstructionMessage.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 33;
        instance.setQuantity(expResult);
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of getUOM method, of class InstructionMessage.
     */
    @Test
    public void testGetUOM() {
        System.out.println("getUOM");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 44;
        instance.setUOM(expResult);
        int result = instance.getUOM();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTimeStamp method, of class InstructionMessage.
     */
    @Test
    public void testGetTimeStamp() {
        System.out.println("getTimeStamp");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 55;
        instance.setTimeStamp(expResult);
        int result = instance.getTimeStamp();
        assertEquals(expResult, result);
    }

    /**
     * Test of setInstructionType method, of class InstructionMessage.
     */
    @Test
    public void testSetInstructionType() {
        System.out.println("setInstructionType");
        int expResult = 11;
        InstructionMessage instance = new InstructionMessage();
        instance.setInstructionType(expResult);
        int result = instance.getInstructionType();
        assertEquals(expResult, result);
    }

    /**
     * Test of validInstructionType method, of class InstructionMessage.
     */
    @Test//(expected = Exception.class)
    public void testValidateInstructionType(){
        System.out.println("validInstructionType");
        InstructionMessage instance = new InstructionMessage();
        instance.setInstructionType(0);
        try{
            instance.validateInstructionType();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("instructionType < ITYPE_MIN_VALUE");
        }
        instance.setInstructionType(100);
        try{
            instance.validateInstructionType();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("instructionType > ITYPE_MAX_VALUE");
        }
    }

    /**
     * Test of setProductCode method, of class InstructionMessage.
     */
    @Test
    public void testSetProductCode() {
        System.out.println("setProductCode");
        int productCode = 22;
        InstructionMessage instance = new InstructionMessage();
        instance.setProductCode(productCode);
    }

    /**
     * Test of validateProductCode method, of class InstructionMessage.
     */
    @Test//(expected = Exception.class)
    public void testValidateProductCode(){
        System.out.println("validProductCode");
        InstructionMessage instance = new InstructionMessage();
        instance.setProductCode(0);
        try{
            instance.validateProductCode();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("productCode < PCODE_MIN_VALUE");
        }
    }

    /**
     * Test of setQuantity method, of class InstructionMessage.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int expResult = 33;
        InstructionMessage instance = new InstructionMessage();
        instance.setQuantity(expResult);
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of validQuantity method, of class InstructionMessage.
     */

    @Test//(expected = Exception.class)
    public void testValidateQuantity(){
        System.out.println("validQuantity");
        InstructionMessage instance = new InstructionMessage();
        instance.setQuantity(0);
        try {
            instance.validateQuantity();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("quantity < QUANT_MIN_VALUE");
        }
    }

    /**
     * Test of setUOM method, of class InstructionMessage.
     */
    @Test
    public void testSetUOM() {
        System.out.println("setUOM");
        int expResult = 44;
        InstructionMessage instance = new InstructionMessage();
        instance.setUOM(expResult);
        int result = instance.getUOM();
        assertEquals(expResult, result);
    }

    /**
     * Test of validateUOM method, of class InstructionMessage.
     */
    @Test
    public void testValidateUOM(){
        System.out.println("validateUOM");
        InstructionMessage instance = new InstructionMessage();
        instance.setUOM(0);
        try{
            instance.validateUOM();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("UOM < QUANT_MIN_VALUE");    
        }
        instance.setUOM(256);
        try{
            instance.validateUOM();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("UOM > QUANT_MIN_VALUE");    
        }
    }

    /**
     * Test of setTimeStamp method, of class InstructionMessage.
     */
    @Test
    public void testSetTimeStamp() {
        System.out.println("setTimeStamp");
        InstructionMessage instance = new InstructionMessage();
        int expResult = 55;
        instance.setTimeStamp(expResult);
        int result = instance.getTimeStamp();
        assertEquals(expResult, result);
    }

    /**
     * Test of validTimeStamp method, of class InstructionMessage.
     */
    @Test
    public void testValidateTimeStamp() {
        System.out.println("validTimeStamp");
        InstructionMessage instance = new InstructionMessage();
        instance.setTimeStamp(0);
        try{
            instance.validateTimeStamp();
        }
        catch(InvalidMessageException ex){
            thrown.expect(InvalidMessageException.class);
            thrown.expectMessage("timeStamp < TSTAMP_MIN_VALUE");   
        }
    }
    
}
