
import java.util.Arrays;
public class Palindrom {


    static public void main(String[] args){

        String QAMP="QAMP raja je najbolja raja.";
        //String Year="22/02/2022"; Da li dodati support za datume?? Hmm
        String car="racecar";
        Palindrom(car);
    }

    public static void Palindrom(String array){   //mali "hack"
        System.out.println("String glasi: "+array );
        char[] charArray=array.toCharArray(),copy=array.toCharArray(),invertedArray=new char[array.length()];
        //System.out.print("Izvrnuti niz je: ");
        int j=0;
        for(int i=array.length()-1;i>=0;i--) {
            invertedArray[j]=charArray[i];
            System.out.print(invertedArray[j] + " ");
            j++;
        }
        //invertedArray[array.length()]='\0';
        if(Arrays.equals(copy,invertedArray))
            System.out.println("\nRijec je palindrom");
        else
            System.out.println("\nRijec nije palindrom");
        //System.out.print("\n");
    }

}
