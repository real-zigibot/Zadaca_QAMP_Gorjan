import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class Zadatak2 {

    static public void main(String[] args){ //zadatak za onaj ispis liste elemenata
        int x=0;
      Input(x);

        System.exit(0);
    }

   static public void Output(Integer[] InputArray,int size) {
       String[] EnumerationString = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh",
               "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
       for (int i =size-1; i >= 0; --i) {
               System.out.format("%s number in array: %d\n", EnumerationString[i], InputArray[i]);
       }

   }
    static public void Input(int x) {
        System.out.print("Unesi velicinu niza(cijeli broj): ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] InputArray = new Integer[size];
        for (int i = 0; i < InputArray.length; ++i) {
            System.out.format("Unesi %d. element niza(cijeli broj): ", i + 1);
            InputArray[i] = sc.nextInt();
        }
        System.out.println("Sadrzaj niza je sljedeci: "+ Arrays.toString(InputArray));
       Output(InputArray,size);
    }


}
