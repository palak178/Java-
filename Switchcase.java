package mycap;
import java.util.*;
public class MyCap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your choice:\t 1. Hi!!\t 2. Hey!!\t 3. Hello!!");
    int c = input.nextInt();
    switch (c)
    {
        case 1:System.out.println("You said Hi");
        break;
        case 2:System.out.println("You said Hey");
        break;
        case 3:System.out.println("You said Hello");
        break;
        default:System.out.println("Invalid Input!!3");
        break;
    }
    }   
}
