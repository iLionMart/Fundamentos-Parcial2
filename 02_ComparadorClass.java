public class main {
    public static void  main(String args[]) {
     
        int a = 5;
        int b = 8;
        int x = 0;
        
        if (a==b){
            System.out.println("Ambos numeros son iguales");
        }else if (a>b){
            System.out.println(a + " es mayor a " + b);
            x = a - b;
            System.out.println("El resultado de la resta es " + x);
        }else if (b>a){
            System.out.println(b + " es mayor a " + a);
            x = a + b;
            System.out.println("El resultado de la suma es " + x);
        }
    }
}
