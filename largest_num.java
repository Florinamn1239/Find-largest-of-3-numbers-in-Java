import java.util.Scanner;

class Fibbo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c = sc.nextInt();
        
        if(a > b && a > c) {
            System.out.println(a + ": Is the largest number");
        }
        else if(b > a && b > c) {
            System.out.println(b + ": Is the largest number");
        }
        else if(c > a && c > b) {
            System.out.println(c + ": Is the largest number");
        }
    }
}
