import java.util.Arrays;
import java.util.Scanner;
public class Zadatak1 {
    static public void main(String[] args){
        int x=0;
        Input(x);
    }
    public static void Output(int[] InputArray,int size){
        for(int i=0;i<size;++i){
            if(InputArray[i]%2==0){
                System.out.format("%d. element je %d. Paran je ",i+1,InputArray[i]);
            }
            else
                System.out.format("%d. element je %d. Nije paran",i+1,InputArray[i]);
            if(InputArray[i]>10)
                System.out.print(" i veci je od 10.\n");
            else
                System.out.print(" i nije veci od 10.\n");
        }
    }
    public static void Input(int flag){
        System.out.print("Unesi velicinu niza(cijeli broj): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] InputArray=new int[size];
        for(int i=0;i<InputArray.length;++i) {
            System.out.format("Unesi %d. element niza(cijeli broj): ", i + 1);
            InputArray[i] = sc.nextInt();
        }
        Output(InputArray,size);
        System.out.print("Sadrzaj niza je sljedeci: "+ Arrays.toString(InputArray));
    }

}
