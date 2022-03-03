import java.util.Scanner;

public class Z1b {

    public static void main(String[] args){
        int total=45;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.println("Molim unesite broj: ");
            total=sc.nextInt();
        }while(total!=-1000);
        System.out.println("Exit number -1000 detected.");
    }
}
