
import java.util.Scanner;
public class Zadatak5{
    public  static void main(String[] args) {
        System.out.print("Idemo na testiranje logike sa A,B,C,D.\n");
        int A=0,B=0,C=0,D=0;
        do {
            System.out.print("Unesi broj A (mora biti veci od 0): \n");
            Scanner sc = new Scanner(System.in);
            A = sc.nextInt();
            System.out.print("Unesi broj B (mora biti veci od 0): \n");
            B=sc.nextInt();
            System.out.print("Unesi broj C (mora biti veci od 0): \n");
            C=sc.nextInt();
            System.out.print("Unesi broj C (mora biti veci od 0): \n");
            D=sc.nextInt();
        } while (A<=0 || B <=0||C<=0||D<=0);
        LogicTest(A,B,C,D);
        System.exit(0);
    }
    static void LogicTest(int A,int B,int C,int D) {
        int SummedNumbers=A+B+C+D;
        if(SummedNumbers>100){
                if (SummedNumbers % 2 == 0) {
                    SummedNumbers /= 2;
                    System.out.print("The number is divisible by 2.");
                }
                else {
                    System.out.print("The number is not divisible by 2 in the first iteration of our calculation.\n");
                    SummedNumbers--;
                    if(SummedNumbers%2==0){
                        SummedNumbers/=2;
                    }
                    else
                        System.out.print("The number is still not divisible by 2.");
                }
        }
        else System.out.print("Your number is smaller than 100. No calculations for you friend.\n");
        return;
    }
}
