
import java.util.Scanner;
public class Zadatak1 {

    public static void main(String[] args) {
        System.out.print("What is on your receipt my dude? \nHow much did you spend?\n");
        Scanner sc = new Scanner(System.in);
        int receipt = sc.nextInt();
        System.out.print("How much money you got?\n");
        int money = sc.nextInt();
        CalculationOfChange(money, receipt); //Evo je metoda koja rasporedjuje broj apoena. Mogao se recimo napraviti i
        // neki objekat "novac" pa da on poziva nad sobom metodu ali to bi bilo bas overkill. Metoda se ponasa kao
        // funkcija dva parametra.
        System.exit(0);
    }

    static void CalculationOfChange(int money, int receipt) {
        if(money<receipt){
            System.out.print("I hear the police sirens.");
            return;
        }
        else if (money > 100) {
            System.out.println("You have too much money.");
            return;
        } else if (money < 0) {
            System.out.println("Did you maybe break something?");
            return;
        }

        if (receipt <= 0) {
            System.out.println("You didn't buy anything did you.\n");
            return;
        }
        int Change = money - receipt, counterOfTwenties = 0, counterOfTens = 0, counterOfTwos = 0, counterOfOnes = 0;
        do {
            if (Change >= 20) {
                Change -= 20;
                counterOfTwenties++;
            } else if (Change < 20 && Change >= 10) {
                Change -= 10;
                counterOfTens++;
            } else if (Change >= 2 && Change < 10) {
                Change -= 2;
                counterOfTwos++;
            } else {
                Change -= 1;
                counterOfOnes++;
            }
        } while (Change != 0);
        System.out.println("20 KM = "+counterOfTwenties+
                "\n10 KM = "+counterOfTens+
                "\n2 KM = "+counterOfTwos+
                "\n1 KM = "+counterOfOnes);
    }
}