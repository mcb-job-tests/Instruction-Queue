package instructionqueue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class InstructionQueueTest {
    
    public InstructionQueueTest() {
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

    /**
     * Test of numberOfInstructionMessages method, of class InstructionQueue.
     */
    @Test
    public void testNumberOfInstructionMessages() {
        System.out.println("numberOfInstructionMessages");
        InstructionQueue instance = new InstructionQueue();
        InstructionMessage imessage = new InstructionMessage(1,2,3,4,5);
        int expResult = 0;
        int result = instance.numberOfInstructionMessages();
        assertEquals(expResult, result);
        
        instance.addInstructionMessage(imessage);
        instance.addInstructionMessage(imessage);
        instance.addInstructionMessage(imessage);
        expResult = 3;
        result = instance.numberOfInstructionMessages();
        assertEquals(expResult, result);
    }
        
    /**
     * Test of addInstructionMessage method, of class InstructionQueue.
     */
    @Test
    public void testAddInstructionMessage() {
        System.out.println("addInstructionMessage");
        InstructionMessage iMessage = new InstructionMessage(1,2,3,4,5);
        InstructionQueue instance = new InstructionQueue();
        boolean result = instance.isEmpty();
        boolean expResult = true;
        assertEquals(expResult, result);

        instance.addInstructionMessage(iMessage);
        InstructionMessage iMessage2 = instance.getFirstInstructionMessage();
        assertEquals(iMessage, iMessage2);
    }

    /**
     * Test of removeInstructionMessage method, of class InstructionQueue.
     */
    @Test
    public void testRemoveInstructionMessage() {
        System.out.println("removeInstructionMessage");
        InstructionMessage iMessage = new InstructionMessage(1,2,3,4,5);
        InstructionQueue instance = new InstructionQueue();
        assertTrue(instance.isEmpty());
        instance.addInstructionMessage(iMessage);
        assertFalse(instance.isEmpty());
        instance.removeInstructionMessage(iMessage);
        assertTrue(instance.isEmpty());
    }

    /**
     * Test of getFirstInstructionMessage method, of class InstructionQueue.
     */
    @Test
    public void testGetFirstInstructionMessage() {
        System.out.println("getFirstInstructionMessage");
        InstructionQueue instance = new InstructionQueue();
        InstructionMessage newMessage, expResult;
        expResult = new InstructionMessage(1,11,22,33,44); // high priorty
        newMessage = new InstructionMessage(91,25,25,25,25); // low priority
        
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(expResult);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        
        InstructionMessage result = instance.getFirstInstructionMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInstructionMessage method, of class InstructionQueue.
     */
    @Test
    public void testGetInstructionMessage() {
        System.out.println("getInstructionMessage");
        int index = 4;
        InstructionQueue instance = new InstructionQueue();
        InstructionMessage expResult = new InstructionMessage(40,6,7,8,9);
        instance.addInstructionMessage(expResult);
        InstructionMessage newMessage = new InstructionMessage(95,11,12,13,14);
        instance.addInstructionMessage(newMessage);
        newMessage = new InstructionMessage(7,25,35,45,55);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        instance.addInstructionMessage(newMessage);
        InstructionMessage result = instance.getInstructionMessage(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of isEmpty method, of class InstructionQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        InstructionQueue instance = new InstructionQueue();
        boolean result = instance.isEmpty();
        assertTrue(result);
        InstructionMessage newMessage = new InstructionMessage(1,2,3,4,5);
        instance.addInstructionMessage(newMessage);
        result = instance.isEmpty();
        assertFalse(result);
    }

    /**
     * Test of validateInstructionMessage method, of class InstructionQueue.
     */
    @Test
    public void testValidateInstructionMessage() {
        System.out.println("validateInstructionMessage");
        InstructionQueue instance = new InstructionQueue();
        InstructionMessage imessage1 = new InstructionMessage();
        InstructionMessage imessage2 = new InstructionMessage(1,2,3,4,5);
    
        
        boolean result = instance.validateInstructionMessage(imessage2);
        assertTrue(result);
        
        result = instance.validateInstructionMessage(imessage1);
        
        assertFalse(result);
        imessage1.setInstructionType(5);
        result = instance.validateInstructionMessage(imessage1);
        assertFalse(result);
        
        imessage1.setProductCode(100);
        result = instance.validateInstructionMessage(imessage1);
        assertFalse(result);
        
        imessage1.setQuantity(1500);
        result = instance.validateInstructionMessage(imessage1);
        assertFalse(result);
        
        imessage1.setUOM(250);
        result = instance.validateInstructionMessage(imessage1);
        assertFalse(result);
        
        imessage1.setTimeStamp(25);
        result = instance.validateInstructionMessage(imessage1);
        assertTrue(result);

    }
}
