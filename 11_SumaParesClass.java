public class main {
    public static void main(String args[]){
        int x = 0;
        int contador = 0;
        int sumador = 2;

        while (contador <=100){
            x= x + sumador;
            sumador= sumador + 2;
            contador= contador + 1;
        }

        System.out.println("El resultado de la suma de pares es: " + x);
    }
}
