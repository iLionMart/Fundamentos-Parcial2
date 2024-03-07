public class main {
    public static void main(String[] args) {

        int x = 562;
        int centena = 0;
        int decena = 0;
        int unidad = 0;

        centena = x/100;
        decena = (x/10) - (centena * 10);
        unidad = x%10;

        System.out.println("El numero invertido es: " + unidad + decena + centena);
    }
}
