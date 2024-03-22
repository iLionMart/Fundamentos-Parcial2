public class main {
    public static void main(String[] args) {

        int ca1= 9, ca2= 6, ca3= 5, ca4= 10;
        int promedio, caal, caba;
        
        promedio= (ca1 + ca2 + ca3 + ca4)/4;
        caal= Math.max( Math.max(ca1, ca2), Math.max(ca3, ca4) );
        caba= Math.min( Math.min(ca1, ca2), Math.min(ca3, ca4) );

        System.out.println("El promedio de las calificaciones  " + promedio);
        System.out.println("La calificaciones mas alta es " + caal);
        System.out.println("La calificaciones mas baja es " + caba);
    }
}
