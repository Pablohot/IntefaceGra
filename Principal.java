package Clase08;

public class Principal {
    public static void main (String[] args){
        int[] numeros= {1,2,3};

        System.out.print("Valor ");
        try {
            System.out.println(numeros[3]);
        } catch (Exception e) {
           System.out.print("Hay un error en el codigo: "+ e.getMessage());
        }
        System.out.println("Final");

    }
}
