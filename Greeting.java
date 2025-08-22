import java.util.*;
public class Greeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String Name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("Hello "+ Name + " are you really "+age + "years old?!");
    }

}
