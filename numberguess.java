import java.util.Random;
import java.util.*;
public class Main{
    static int ran()
    {
        Random rand = new Random();
        int start=1;
        int end=100;
        int randomno = rand.nextInt(start,end);
        return randomno;
    }
    static void guessno()
    {
        int round=0;
        int attempt=0;
        while(true)
        {
        round++;
        System.out.println("Current Round: " + round);
        Scanner sc=new Scanner(System.in);
        int x=ran();
        int limit=10;
        while(limit>1)
        {
            attempt++;
            System.out.print("Enter a number: ");
            int y=sc.nextInt();
            if(y==x)
            {
                System.out.println("Correct guess");
                break;
            }
            else if(y<x)
            {
                System.out.println("Too Low.");
            }
            else{
                System.out.println("To High.");
            }
            limit--;
        }
        System.out.println("Do you want to play again? (y/n): ");
        String opt=sc.next();
        if(!opt.equals("y"))
        {
            break;
        }
    }
    System.out.println("Game over!!!!");
    System.out.println("Total Round Taken: "+round);
    System.out.println("Total Attempt: "+attempt);  
}
    public static void numberguess(String[] args)
    {
        guessno();
    }
}
