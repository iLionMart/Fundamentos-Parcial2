public class main {
    public static void main(String[] args) {

        int x = 33;
        int y = 2;
        int z = (x / y);
        int r = (x % y);

        if (x%y == 0){
            System.out.println("La division es cerrada dando como resultado " + z);
        }else{
            System.out.println("La disivision no es cerrada dando como resultado " + z + " con un residuo de " + r);
        }
    }
}
