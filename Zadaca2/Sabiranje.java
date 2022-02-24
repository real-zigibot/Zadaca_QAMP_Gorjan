import java.util.Arrays;
import java.util.Scanner;

public class Sabiranje {

    static public void main(String[] args){
        int [] firstArray=Input(0);
        int [] secondArray=Input(0);
        MergeAndAdd(firstArray,secondArray);
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
    static public void MergeAndAdd(int []firstArray, int []secondArray ){

        if(firstArray.length>secondArray.length) {
            int size=firstArray.length;
            int [] Merged=new int[size];
            for (int i = 0; i < secondArray.length; ++i)
                Merged[i] = firstArray[i]+secondArray[i];
            for (int i = secondArray.length; i < size; ++i)
                Merged[i] = firstArray[i];
            System.out.println("Sadrzaj spojenog niza je sljedeci: " + Arrays.toString(Merged));

        }
        else{
            int size=secondArray.length;
            int [] Merged=new int[size];
            for (int i = 0; i < firstArray.length; ++i)
                Merged[i] = firstArray[i]+secondArray[i];
            for (int i = firstArray.length; i < size; ++i)
                Merged[i] = secondArray[i];
            System.out.println("Sadrzaj spojenog niza je sljedeci: " + Arrays.toString(Merged));
        }


    }
}
