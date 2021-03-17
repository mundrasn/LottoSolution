
/**
 * Write a description of class Person here.
 *
 * Snigdha Mundra
 * 18/03/2021
 */
public class Person
{
    // instance variables - replace the example below with your own
    private StrikeTicket strikeTicket;
    private LottoDraw newDraw;
    private final int STRIKESIZE = 4;
    
    /**
     * Constructer for obejcts of class Person
     */
    public Person(){
    }
    
    /**
     * One draw to check against 
     */
    public int[] watchDraw(){
        newDraw = new LottoDraw();
        return newDraw.getLine();
    }
    
    /**
     * Check Strike Ticket
     */
    public int checkStrikeTicket(int[] array1, int[] array2){
        int counter = 0;
        
        for (int i = 0; i < STRIKESIZE; i++){
            if (array1[i] == array2[i]){
                System.out.println("Match pos" + (i + 1));
                counter++;
            }
        }
        
        return counter; //search up later why
    }
    
    /**
     * Main routine
     */
    public static void main(String[] args){
        Person p = new Person();
        int[] draw; 
        
        draw = p.watchDraw();
        int matches = 0;
        long counter = 0L;
        
        //Check the ticket
        do {
            StrikeTicket ticketLine = new StrikeTicket(); // Create new ticket obj
            
            matches = p.checkStrikeTicket(ticketLine.getLine(), draw);
            counter++; //Track the number of tickets
            System.out.println("Ticket: " + counter + "Matches: " + matches);
            
            ticketLine = null; //Reset the object
            System.gc(); //Garbage Collecter
        } while (matches != p.STRIKESIZE); //Keep going until there is 4 matches (Strike)
    }
}
