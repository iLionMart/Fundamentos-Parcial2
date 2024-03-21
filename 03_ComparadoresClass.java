public class main {
    public static void main(String args[]){
        
        int a = 20;
        int b = 15;
        int c = 10;
        
        if  (a!=b && b!=c){
            if (a>b && a>c){
                if  (b>c){
                    System.out.println(a + " Es mayor que " + b + " Y es mayor que " + c);
                }else{
                    System.out.println(a + " Es mayor que " + c + " Y es mayor que " + b);
                }
            }else if (b>a && b>c){
                if  (a>c){
                    System.out.println(b + " Es mayor que " + a + " Y es mayor que " + c);
                }else{
                     System.out.println(b + " Es mayor que " + c + " Y es mayor que " + a);
                }
            }else if (c>b && c>a){
                if (a>b){
                     System.out.println(c + " Es mayor que " + a + " Y es mayor que " + b);
                }else{
                     System.out.println(c + " Es mayor que " + b + " Y es mayor que " + a);
                }
            }
        }
    }
}
