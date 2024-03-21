public class main {
    public static void main(String[] args) {

        int x = 456;

        if (x>=0 && x<=9){
            System.out.println("El numero tiene 1 digito");
        }else if (x>=10 && x<=99){
            System.out.println("El numero tiene 2 digitos");
        }else if (x>=100 && x<=999){
            System.out.println("El numero tiene 3 digitos");
        }else if (x>=1000 && x<=9999){
            System.out.println("El numero tiene 4 digitos");
        }else if (x>=10000 && x<=99999){
            System.out.println("El numero tiene 5 digitos");
        }else if (x>=100000 && x<=99999){
            System.out.println("El numero tiene 6 digitos");
        }else if (x>=1000000 && x<=999999){
            System.out.println("El numero tiene 7 digitos");
        }else if (x>=10000000 && x<=9999999){
            System.out.println("El numero tiene 8 digitos");
        }else if (x>=100000000 && x<=99999999){
            System.out.println("El numero tiene 9 digitos");
        }else if (x>=1000000000){
            System.out.println("El numero tiene un chingo de digitos");
        }
    }
}
