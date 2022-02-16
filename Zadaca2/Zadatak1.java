import java.util.Arrays;
import java.util.Scanner;
public class Zadatak1 {
    static public void main(String[] args){
        int x=0;
        Input(x);
    }
    public static void Input(int flag){
        System.out.print("Unesi velicinu niza(cijeli broj): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] InputArray=new int[size];
        for(int i=0;i< InputArray.length;++i) {
            System.out.format("Unesi %d. element niza(cijeli broj): ", i + 1);
            InputArray[i] = sc.nextInt();
        }
        System.out.print("Sadrzaj niza je sljedeci: "+ Arrays.toString(InputArray));
    }

}
