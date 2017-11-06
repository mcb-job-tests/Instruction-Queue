package instructionqueue;

/* Creates 1,000 'Random' Instruction Messages, adds them to Instruction Queue in Priority, and then prints Queue data to console */

public class TestInstructionQueue {
    public static InstructionQueue queue = new InstructionQueue();
    
    public static void main(String[] args){
        InstructionMessage instr;
    
        for (int i = 1; i <= 1000; i++) {
            instr = new InstructionMessage();
            instr.setInstructionType( (int)(Math.random()*InstructionMessage.ITYPE_MAX_VALUE)+1);
            instr.setProductCode( (int)(Math.random()*1000000));
            instr.setQuantity((int)(Math.random()*10000));
            instr.setUOM((int)(Math.random()*InstructionMessage.UOM_MAX_VALUE+1));
            instr.setTimeStamp((int)(Math.random()*100000));

            queue.addInstructionMessage(instr);
        }
        
        System.out.println("the queue size is: " + queue.numberOfInstructionMessages());
        int itype;
        for (int i = 0; i < queue.numberOfInstructionMessages(); i++){
            itype = queue.getInstructionMessage(i).getInstructionType();
            System.out.print(i + ": ");
            System.out.print(itype + " ");
            System.out.print(queue.getInstructionMessage(i).getProductCode()+ " ");
            System.out.print(queue.getInstructionMessage(i).getQuantity()+ " ");
            System.out.print(queue.getInstructionMessage(i).getUOM()+ " ");            
            System.out.print(queue.getInstructionMessage(i).getTimeStamp() + " [");
            System.out.println(queue.plookup.getPriority(itype) + "]\n");
        }
    }
}