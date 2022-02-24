import java.util.Arrays;
import java.util.Scanner;

public class Range {
    static public void main(String[] args) {
        EvenInRange();
    }

    public static int[] Input(int x) {
        System.out.print("Unesi donju granicu niza(cijeli broj): ");
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        //Integer[] InputArray = new Integer[size];
        System.out.print("Unesi gornju granicu niza(cijeli broj): ");
        int upper = sc.nextInt();
        //System.out.println("Sadrzaj niza je sljedeci: "+ Arrays.toString(InputArray));
        int[] upperLower = {lower, upper};
        return upperLower;
    }

    public static void EvenInRange() {
        int[] Boundaries = Input(0);
        int lower = Boundaries[0], upper = Boundaries[1];
        int Array[] = new int[upper - lower];
        int j = 0;
        for (int i = lower + 1; i < upper; i++) {
            if (i % 2 == 0) {
                Array[j++] = i;
            }
        }
        System.out.format("Even numbers for range %d and %d are: ", lower, upper);
        String separator = "";
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0) {
                System.out.print(separator + Array[i]);
                separator = ",";
            }
        }

    }

}
