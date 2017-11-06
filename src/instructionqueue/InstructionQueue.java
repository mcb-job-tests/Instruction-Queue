package instructionqueue;

//import java.util.Arrays;
import java.util.LinkedList;

public class InstructionQueue {
    
    private final LinkedList<InstructionMessage> iQueue = new LinkedList<>();
    public final PriorityLookupArray plookup = new PriorityLookupArray();
        
    public InstructionQueue(){
    }
    
    //Has a method that returns the number of InstructionMessages on it
    public int numberOfInstructionMessages(){
        return this.iQueue.size();
    }
    
    //Has a method for placing InstructionMessages onto the queue
    public void addInstructionMessage(InstructionMessage iMessage) {
        int list_position = 0;
        
        if (validateInstructionMessage(iMessage)){
        
            if (!iQueue.isEmpty()){  // search from end of queue to front for 1st message with same or higher priority.
                int qSize = numberOfInstructionMessages();
            
                for (int i = qSize-1; i >= 0; i--){
                    if (plookup.getPriority(iMessage.getInstructionType()).ordinal()
                        <= plookup.getPriority(this.iQueue.get(i).getInstructionType()).ordinal()){
                        list_position = i+1;
                        break;
                    }
                }
            }
            this.iQueue.add(list_position,iMessage);
        }
    }
    //Has a method for removing InstructionMessages from the queue
    public void removeInstructionMessage(InstructionMessage iMessage){
        this.iQueue.remove(iMessage);
    }
    //Has a method for retrieving the InstructionMessage at the front of the queue
    public InstructionMessage getFirstInstructionMessage(){
        return this.iQueue.peek();
    }
    
    public InstructionMessage getInstructionMessage(int index){
        return this.iQueue.get(index);
    }
    
    //Has a method for determining if the queue is empty
    public boolean isEmpty(){
        return this.iQueue.isEmpty();
    }
    
    
    public boolean validateInstructionMessage(InstructionMessage imessage){
        try { //Throws an InvalidMessageException if an invalid InstructionMessage is placed on it
            imessage.validateInstructionType();
            imessage.validateProductCode();
            imessage.validateQuantity();
            imessage.validateUOM();
            imessage.validateTimeStamp();
            
        }
        catch(InvalidMessageException ex){
//            ex.printStackTrace();
            return false;
        }                    
        return true;
    }
}