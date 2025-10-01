import java.util.Scanner;

public class Ej04{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println ("Introduce el primer numero entero");
        int num1 = sc.nextInt();   
        System.out.println ("Introduce el segundo numero entero");
        int num2 = sc.nextInt();
        System.out.println ( " la suma de numero es " + (num1 + num2)+"");
    }

}
