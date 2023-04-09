import java.util.Scanner;

public class GetInputFromUser {
    int a;
    String b;
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter the roll number");
        int a = sc.nextInt();
        System.out.println("RollNo : "+a);
        System.out.println("Enter the name");
        String b = sc.next();
        System.out.println("Name : "+b);
    }
    }
}
