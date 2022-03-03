import java.util.Scanner;
public class Z1aa {

    public static void main(String[] args){
        int total=45;
        Scanner sc= new Scanner(System.in);
        while(total>0){
            System.out.println("Molim unesite pozitivan broj: ");
            total=sc.nextInt();
        }
        System.out.println("E bgm program se zatvara. Zao nam je.");
    }

}
