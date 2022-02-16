import java.util.Arrays;
import java.util.List;

public class Invert {
    static public void main(String[] args){ //zadatak za onaj ispis izvrnutih elemenata "svakog" tipa

        String[] arrayTwo = {"First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh",
                "Eighth", "Ninth", "Tenth", "Eleventh", "Twelfth", "Thirteenth", "Fourteenth", "Fifteenth"};
        Integer[] arrayOne = new Integer[]{1,2,4,5,6};
        Double [] arrayThree=new  Double[]{3.6,6.7,5.2,7.9};
        InvertAnyArray(Arrays.asList(arrayOne));
        InvertAnyArray(Arrays.asList(arrayTwo));
        InvertAnyArray(Arrays.asList(arrayThree));
        System.exit(0);
    }
    public static <T> void InvertAnyArray(List<T> array){   //mali "hack" 
        System.out.println("Elementi niza su: "+array );
        System.out.print("Izvrnuti niz je: ");
        for(int i=array.size()-1;i>=0;i--)
            System.out.print(array.get(i)+" ");
        System.out.print("\n");
    }
}
