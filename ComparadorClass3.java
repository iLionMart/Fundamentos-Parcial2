public class Condición_Triple {
    public static void main(String args[]){
        
        int A = 20;
        int B = 15;
        int C = 10;
        
        if  (A!=B && B!=C){
            if (A>B && A>C){
                if  (B>C){
                    System.out.println(A + " Es mayor que " + B + " Y es mayor que " + C);
                }else{
                    System.out.println(A + " Es mayor que " + C + " Y es mayor que " + B);
                }
            }else if (B>A && B>C){
                if  (A>C){
                    System.out.println(B + " Es mayor que " + A + " Y es mayor que " + C);
                }else{
                     System.out.println(B + " Es mayor que " + C + " Y es mayor que " + A);
                }
            }else if (C>B && C>A){
                if (A>B){
                     System.out.println(C + " Es mayor que " + A + " Y es mayor que " + B);
                }else{
                     System.out.println(C + " Es mayor que " + B + " Y es mayor que " + A);
                }
            }
        }
    }
}