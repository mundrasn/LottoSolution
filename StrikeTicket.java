
/**
 * Write a description of class StrikeTicket here.
 *
 * Snigdha Mundra
 * 18/03/2021
 */
public class StrikeTicket
{
    // instance variables - replace the example below with your own
    private int[] line; 
    private final int MAXSTRIKESIZE = 4;
    private final int MAXNUM = 40; 
    private final int MINNUM = 1;
    
    /**
     * Constructer for object of class StrikeLine
     * Populate the line with four random numbers
     */
    public StrikeTicket(){
        fillArray();
    }
    
    public void fillArray(){
        //initialize the with 4 ints
        line = new int[MAXSTRIKESIZE];
        int num;
        
        for (int idx = 0; idx < MAXSTRIKESIZE; idx++){
            do{
               num = (int)(MINNUM + Math.random() * MAXNUM);
            } while (contains(line, num)); //check the number doesn't exist
            line[idx] = num;
        }
    }
    
    /**
     * Checks an array if a value exists
     * @param an int array and an int value
     * @return boolean true if exists else false
     */
    public boolean contains(int[] array, int v){
        for (int num : array) { // enhanced for loop to loop thru array
            if (num == v){
                return true;
            }
        }
        return false;
    } 
   
   /**
    * Return the ticketLine array
    */
   public int[] getLine(){
       return line;
    }
}

