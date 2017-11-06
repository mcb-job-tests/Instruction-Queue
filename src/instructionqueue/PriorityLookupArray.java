package instructionqueue;

//Prioritises InstructionMessages according to the table below;
    
/* InstructionType Priority
    0 < n < 11 High
    10 < n < 91 Medium
    90 < n < 100 Low 
*/

public class PriorityLookupArray {
    public enum PriorityType {LOW, MEDIUM, HIGH};
    
    private static final int HIGH_PRIORITY_MIN_VALUE = 1;
    private static final int HIGH_PRIORITY_MAX_VALUE = 10;
    
    private static final int MEDIUM_PRIORITY_MIN_VALUE = 11;
    private static final int MEDIUM_PRIORITY_MAX_VALUE = 90;
    
    private static final int LOW_PRIORITY_MIN_VALUE = 91;
    private static final int LOW_PRIORITY_MAX_VALUE = 99;
    
    private static final PriorityType[] priorityArray = new PriorityType[InstructionMessage.ITYPE_MAX_VALUE];
    private static final int indexOffset = InstructionMessage.ITYPE_MIN_VALUE;
    
    PriorityLookupArray(){
        setPartialLookUpArray(PriorityType.HIGH, HIGH_PRIORITY_MIN_VALUE, HIGH_PRIORITY_MAX_VALUE);
        setPartialLookUpArray(PriorityType.MEDIUM, MEDIUM_PRIORITY_MIN_VALUE, MEDIUM_PRIORITY_MAX_VALUE);
        setPartialLookUpArray(PriorityType.LOW, LOW_PRIORITY_MIN_VALUE, LOW_PRIORITY_MAX_VALUE);
    }
    
   private void setPartialLookUpArray(PriorityType priority, int  min, int max){
        for (int i = min; i <= max; i++){
            priorityArray[i - indexOffset] = priority;
        }
    }
   
   public PriorityType getPriority(int index){
        return (priorityArray[index - indexOffset]);
    }
   
}
