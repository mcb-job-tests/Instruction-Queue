package instructionqueue;

class InvalidMessageException extends Exception{
    public InvalidMessageException(String str){
        super(str);
    }
}
public class InstructionMessage {
    private int instructionType; // integer 0 < n < 100 
    private int productCode; //Integer 0 < n 
    private int	quantity; //Integer 0 < n 
    private int	uom; //Integer 0 <= n < 256 
    private int timeStamp; //Integer 0 < n

        
    public static final int ITYPE_MIN_VALUE = 1;
    public static final int ITYPE_MAX_VALUE = 99;
    
    public static final int PCODE_MIN_VALUE = 1;
    public static final int QUANT_MIN_VALUE = 1;
    
    public static final int UOM_MIN_VALUE = 0;
    public static final int UOM_MAX_VALUE = 255;
    
    public static final int TSTAMP_MIN_VALUE = 1;
    
    public static final int DEFAULT_INIT_VALUE = -1;
    
    public InstructionMessage(){ 
        this.instructionType = DEFAULT_INIT_VALUE;
        this.productCode = DEFAULT_INIT_VALUE;
        this.quantity = DEFAULT_INIT_VALUE;
        this.timeStamp = DEFAULT_INIT_VALUE;
        this.uom = DEFAULT_INIT_VALUE;
    }
    
    public InstructionMessage(int iType, int pCode, int quant, int uom, int tStamp){
        setInstructionType(iType);
        setProductCode(pCode);
        setQuantity(quant);
        setUOM(uom);
        setTimeStamp(tStamp);
    }
     
    public int getInstructionType(){
        return this.instructionType;
    }
    
    public int getProductCode(){
        return this.productCode;
    }
    
    public int getQuantity(){
        return this.quantity;
    }
    
    public int getUOM(){
        return this.uom;
    }
    
    public int getTimeStamp(){
        return this.timeStamp;
    }

    
    public final void setInstructionType(int instructionType){
        this.instructionType = instructionType;
    }
   
    // instructionType : integer 0 < n < 100 
    public void validateInstructionType() throws InvalidMessageException{   
        if (this.instructionType < ITYPE_MIN_VALUE){
            throw new InvalidMessageException("instructionType < ITYPE_MIN_VALUE");
        }
        else if (this.instructionType > ITYPE_MAX_VALUE){
            throw new InvalidMessageException("instructionType > ITYPE_MAX_VALUE");
        }
    }
    
    public final void setProductCode(int productCode){
        this.productCode = productCode;
    }
    
    // productCode : //Integer 0 < n 
    public void validateProductCode() throws InvalidMessageException{
        if (this.productCode < PCODE_MIN_VALUE){
            throw new InvalidMessageException("productCode < PCODE_MIN_VALUE");
        }
    }
    
    public final void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    // quantity : //Integer 0 < n 
    public void validateQuantity() throws InvalidMessageException{
        if (this.quantity < QUANT_MIN_VALUE){
            throw new InvalidMessageException("quantity < QUANT_MIN_VALUE");
        }
    }
    
    public final void setUOM(int uom){
        this.uom = uom;
    }
    
     // uom : Integer 0 <= n < 256 
    public void validateUOM() throws InvalidMessageException{        
        if (this.uom < UOM_MIN_VALUE){
            throw new InvalidMessageException("uom < UOM_MIN_VALUE");
        }
        else if (this.uom > UOM_MAX_VALUE){
            throw new InvalidMessageException("uom > UOM_MAX_VALUE");
        }
    }
    
    public final void setTimeStamp(int timeStamp){
        this.timeStamp = timeStamp;
    }
    
    // timeStamp : Integer 0 < n 
    public void validateTimeStamp() throws InvalidMessageException{        
        if (this.timeStamp < TSTAMP_MIN_VALUE){
            throw new InvalidMessageException("timeStamp < TSTAMP_MIN_VALUE");
        }
    }
}