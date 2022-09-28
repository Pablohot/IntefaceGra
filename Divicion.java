package Clase08;

public class Divicion {
    public static void main (String [] args){
        int x=5;
        int y=0;
        try{
            System.out.println(x/y);
        }catch (java.lang.ArithmeticException e){
            System.out.println("No s posible divir entre 0");
        }
    }
}
