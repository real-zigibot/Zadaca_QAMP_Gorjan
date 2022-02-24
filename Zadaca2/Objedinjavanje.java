import java.util.Arrays;
import java.util.Scanner;

public class Objedinjavanje {

    static public void main(String[] args){
        int [] firstArray=Input(0);
        int [] secondArray=Input(0);
        Merge(firstArray,secondArray);
        System.exit(0);
    }
    static public int[] Input(int x) {
        System.out.print("Unesi velicinu niza(cijeli broj): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] InputArray = new int[size];
        for (int i = 0; i < InputArray.length; ++i) {
            System.out.format("Unesi %d. element niza(cijeli broj): ", i + 1);
            InputArray[i] = sc.nextInt();
        }
       System.out.println("Sadrzaj niza je sljedeci: "+ Arrays.toString(InputArray));
        return InputArray;
    }
    static public void Merge(int []firstArray, int []secondArray ){
        int size=firstArray.length+secondArray.length;
        int [] Merged=new int[size];
        for(int i=0;i<firstArray.length;++i)
            Merged[i]=firstArray[i];
        for(int i=0;i<secondArray.length;++i)
            Merged[firstArray.length+i]=secondArray[i];
        System.out.println("Sadrzaj spojenog niza je sljedeci: "+ Arrays.toString(Merged));
    }

}
