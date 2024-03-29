import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        while(a !=  0 && b != 0 && c != 0){
            int max = a;
            int remainders = b + c;
            if(b > max) {
                max = b;
                remainders = a + c;
            }
            if(c > max) {
                max = c;
                remainders = a + b;
            }

            if(max >= remainders) System.out.println("Invalid");
            else if( a == b && b == c && c == a) System.out.println("Equilateral");
            else if( a == b || b == c || c == a) System.out.println("Isosceles");
            else System.out.println("Scalene");

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}