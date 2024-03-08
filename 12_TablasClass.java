public class main {
    public static void main(String args[]){
        int numero = 5;
        int multiplicador = 1;
        int resultado = 0;

        while (multiplicador <=10){
            resultado= numero * multiplicador;
            System.out.println(numero + " por " + multiplicador + " es: " + resultado);
            multiplicador= multiplicador + 1;
        }
    }
}
