import java.util.Scanner;
import java.util.Random;
class task_01
{
    static Scanner sc=new Scanner(System.in);
    static String[] ch={"rock","paper","scissor"};
    static void game()
    {
        Random random=new Random();
        int x = random.nextInt(3);
        String ai = ch[x];
        while (true)
        {
            System.out.print("guess your choice(Rock/Paper/Scissor)= ");
            String n= sc.next();
            n= n.toLowerCase();
            System.out.println("Robot's choice= "+ai);
            if (n.equals("rock") && ai.equals("scissor") ||  
            n.equals("scissor") && ai.equals("paper") || 
            n.equals("paper") && ai.equals("rock"))
            {
                System.out.println("You Win");
                break;
            }
            else if (n.equals(ai))
            {
                System.out.println("It's a Tie");
                break;
            }
            else
            {
                System.out.println("You Lost");
                break;
            }
        }
        System.out.print("Do you want to play again? (Yes/No)= ");
        String a= sc.next();
        a= a.toLowerCase();
        if(a.equals("yes"))
        {
            game();
        }
        else if(a.equals("no"))
        {
            System.out.println("Game Over...");
            System.exit(0);
        }
        else
        {
            System.out.println("Invalid Input...");
            System.out.println("Quiting...");
            System.exit(0);
        }
    }
    public static void main(String args[])
    {
        System.out.println("**ROCK**PAPER**SCISSOR**");
        System.out.print("Do you accept the challenge? (Yes/No)=");
        String accept= sc.nextLine();
        accept= accept.toLowerCase();
        while (true)
        {
            if(accept.equals("yes"))
            {
                System.out.println("Lets Start");
                game();
            }
            else if(accept.equals("no"))
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Invalid Input...");
            }
        }
    }
}