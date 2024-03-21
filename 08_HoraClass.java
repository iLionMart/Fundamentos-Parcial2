public class main {
    public static void main(String[] args) {

        int seg = 83;
        int min = 42;
        int hora = 21;
        seg= seg + 1;

        if (seg>=60){
            min= min + 1;
            seg= seg - 60;
        }
        if (min >=60){
            hora= hora + 1;
            min= min - 60;
        }
        if (hora >=24){
            hora= 0;
        }

        System.out.println("La nueva hora tras es el segundo es: " + hora + " horas con " + min + " minutos " + " con " + seg + " segundos");
    }
}
