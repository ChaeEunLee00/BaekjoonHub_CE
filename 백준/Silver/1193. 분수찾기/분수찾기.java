import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int section = 1;
        while(num > section){
            num = num - section;
            section++;
        }

        int numerator;
        int denominator;
        if(section % 2 == 0){
            numerator = 1;
            denominator = section;

            for(int i = 1; i < num; i++){
                numerator++;
                denominator--;
            }

        }
        else{
            numerator = section;
            denominator = 1;

            for(int i = 1; i < num; i++){
                numerator--;
                denominator++;
            }

        }
        System.out.println(numerator + "/" + denominator);

    }
}