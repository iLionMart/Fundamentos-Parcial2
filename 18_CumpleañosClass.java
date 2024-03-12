public class main {
    public static void main(String[] args) {

        int dia = 12;
        int mes = 3;
        int N = 1986;

        int diactual = 12;
        int mesactual = 3;
        int Nactual = 2024;

        int diacumple = diactual - dia;
        int mescumple = mesactual - mes;
        int Ncumple = Nactual - N;

        if (diacumple == 0 && mescumple == 0){
            System.out.println("Hoy es tu cumpleaños!!!! felicidades");
        }else{
            Ncumple = Ncumple - 1;
            System.out.println("Faltan " + diacumple + " dias " + mescumple + " meses");
        }

       System.out.println("La edad del usuario es " + Ncumple);
    }
}
