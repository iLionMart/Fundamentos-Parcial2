public class main {
    public static void main(String args[]){
        
        int hora_reloj = 11;
        int horas_sumadas = 20;
        int hora_final = 0;
        int vueltas = 0;

        hora_final= hora_reloj + horas_sumadas;

        while (hora_final >12){ 
            hora_final= hora_final - 12;
            vueltas= vueltas + 1;
        }
            System.out.println("La nueva hora del reloj es: " + hora_final + " con " + vueltas + " vueltas dadas");
        }
    }
