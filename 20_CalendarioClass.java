public class main {
    public static void main(String[] args) {
        
        int dias = 9;
        int idmeses = 3;
        int años = 2024;
        int diassumados = 15;
        int id= 1;
        String dia= null, diasig= null, diaant= null;
        String mes= null;

        dias= dias + diassumados;
        id= id + diassumados;

        while (id >8) {
            id= id - 7;
        }
    
        while (dias >365){
            dias= dias - 365;
            años= años + 1;
        }
        
        while (dias >31){
            dias= dias - 30;
            idmeses= idmeses + 1;
        }

        if (id == 1){
            dia = "Lunes";
            diasig = "Martes";
            diaant = "Domingo";
        }else if (id == 2) {
            dia = "Martes";
            diasig = "Miercoles";
            diaant = "Lunes";
        }else if (id == 3) {
            dia = "Miercoles";
            diasig = "Jueves";
            diaant = "Martes";
        }else if (id == 4) {
            dia = "Jueves";
            diasig = "Viernes";
            diaant = "Miercoles";
        }else if (id == 5) {
            dia = "Viernes";
            diasig = "Sabado";
            diaant = "Jueves";
        }else if (id == 6) {
            dia = "Sabado";
            diasig = "Domingo";
            diaant = "Viernes";
        }else if (id == 7) {
            dia = "Domingo";
            diasig = "Lunes";
            diaant = "Sabado";
        }

        if (idmeses == 1){
            mes = "Enero";
        }else if (idmeses == 2){
            mes = "Febrero";
        }else if (idmeses == 3){
            mes = "Marzo";
        }
        else if (idmeses == 4){
            mes = "Abril";
        }
        else if (idmeses == 5){
            mes = "Mayo";
        }
        else if (idmeses == 6){
            mes = "Junio";
        }
        else if (idmeses == 7){
            mes = "Julio";
        }
        else if (idmeses == 8){
            mes = "Agosto";
        }
        else if (idmeses == 9){
            mes = "Septiembre";
        }
        else if (idmeses == 10){
            mes = "Octubre";
        }
        else if (idmeses == 11){
            mes = "Noviembre";
        }
        else if (idmeses == 12){
            mes = "Diciembre";
        }
    
    
        System.out.println("Tu calendario es del " + dias + " de " + mes + " del " + años);
        System.out.println("El dia de la semana es " + dia);
        System.out.println("El dia siguiente es " + diasig);
        System.out.println("El dia anterior fue " + diaant);
    }
}
