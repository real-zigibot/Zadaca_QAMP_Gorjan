//import java.lang.Math;
import java.util.Scanner;
public class Zadatak3 {
    public static void main(String[] args) {
        int A=0;
        Scanner sc;
        do {
            System.out.print("Unesi svoj broj A (mora biti veci od 10 i manji od 10k, " +
                    "a ujedno i djeljiv sa 3): ");
            sc = new Scanner(System.in);
            A = sc.nextInt();
        }while(A%3!=0||A<10||A>10000);
        System.out.print("Unesi broj B: ");    //program radi i provjeru djeljivosti i sve iz programa broj "4"
        int B=sc.nextInt(),X=0;
        if(A%B==0)
            System.out.print("A je djeljiv sa B.\n");
        else
            System.out.print("A nije djeljiv sa B.\n");
        if(A>B){
            X=A+B;
                System.out.print("Sabrani A i B: "+X);
            }
        else if(A==B){
            X=A*B;
                System.out.print("Pomnozeni: "+X);
            }
        else {
            System.out.print("Oduzet B od A: " + X);
            X=A-B;
        }
    if(((2*X+6)/2-X)%2==0)
        System.out.print("Izraz je djeljiv sa 2.\n");

    System.exit(0);
    }


}
