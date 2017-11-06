package instructionqueue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriorityLookupArrayTest {
    
    public PriorityLookupArrayTest() {
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
     * Test of getPriority method, of class PriorityLookupArray.
     * 
     */
    
    /* InstructionType Priority
        0 < n < 11 High
        10 < n < 91 Medium
        90 < n < 100 Low 
    */
    @Test
    public void testGetPriority() {
        System.out.println("getPriority");
        int ITypeIndex = 1;
        PriorityLookupArray instance = new PriorityLookupArray();
        PriorityLookupArray.PriorityType expResult = PriorityLookupArray.PriorityType.HIGH;
        PriorityLookupArray.PriorityType result = instance.getPriority(ITypeIndex);
        assertEquals(expResult, result);
        
        ITypeIndex = 11;
        expResult = PriorityLookupArray.PriorityType.MEDIUM;
        result = instance.getPriority(ITypeIndex);
        assertEquals(expResult, result);
        
        ITypeIndex = 91;
        expResult = PriorityLookupArray.PriorityType.LOW;
        result = instance.getPriority(ITypeIndex);
        assertEquals(expResult, result);
    }
    
}
