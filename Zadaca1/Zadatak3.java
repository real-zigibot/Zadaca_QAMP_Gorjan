//import java.lang.Math;
import java.util.Scanner;
public class Zadatak3 {
    public static void main(String[] args) {
        System.out.print("Unesi svoj broj A (mora biti veci od 10 i manji od 10k, " +
                "a ujedno i djeljiv sa 3): ");
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        System.out.print("Unesi broj B: ");    //program radi i provjeru djeljivosti i sve iz programa broj "4"
        int B=sc.nextInt();
        if(A%B==0)
            System.out.print("A je djeljiv sa B.\n");
        else
            System.out.print("A nije djeljiv sa B.\n");
        if(A>B){
                System.out.print("Sabrani A i B: "+(A+B));
            }
        else if(A==B){
                System.out.print("Pomnozeni: "+(A*B));
            }
        else
                System.out.print("Oduzet B od A: "+(A-B));


        System.exit(0);
    }


}
