


import java.util.Scanner;
public class Z1a {
    //int a=0,b=0;

    public static int Add(int a, int b){
        int Sum=a+b;
        return Sum;
    }

    public static int Subtract(int a, int b){
        int Sum=a-b;
        return Sum;
    }

    public static int Divide(int a, int b){
        int Divided=a/b;
        return Divided;
    }

    public static int Multiply(int a, int b){
     int Multiplied=a*b;
        return Multiplied;
    }





    public static void main(String[] args){
        int a=10,b=90;
        System.out.println("Ovo su rezultati nasih fja, redom(sabiranje, oduzimanje, dijeljenje, mnozenje): "+Add(a,b)+" "+Subtract(a,b)+" "+Divide(a,b)+" "+Multiply(a,b));
        System.exit(0);
    }

}