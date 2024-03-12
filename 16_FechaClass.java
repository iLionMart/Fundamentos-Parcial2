public class main {
    public static void main(String [] args){

        int n = 2024;
        int mes = 26;
        int dia = 42;

        dia= dia + 1;

        if (dia>= 32){
            mes= mes + 1;
            dia= dia - 31;
        }

        if (mes>= 13){
            n= n + 1;
            mes= mes - 12;
        }

        System.out.println("La nueva fecha tras el dia es " + dia + " del " + mes + " mes " + " del " + n);

    }
}
