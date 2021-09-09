package mycap;
import java.util.*;
public class MyCap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number of minutes:");
    int minutes = input.nextInt();
    int year = minutes / 525600;
    int remainingMinutes = minutes%525600;
    int day = remainingMinutes / 1440;
    System.out.println(minutes + " minutes is " + year + " years and "  +  day + " days ");
    }   
}
