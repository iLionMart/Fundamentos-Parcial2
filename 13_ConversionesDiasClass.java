public class main {
    public static void main(String[] args) {

        int dias = 947;
        int meses = 0;
        int year = 0;

        while (dias >365){
            dias= dias - 365;
            year= year + 1;
        }
        while (dias >31){
            dias= dias - 30;
            meses= meses + 1;
        }

        System.out.println("Tu calendario tiene " + year + " años con " + meses + " meses con " + dias + "dias");
    }
}
