import static java.lang.Math.*;

public class main {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("¿Que pasa?, no mundo hoy no te voy a saludar");
        System.out.println("*********************************");

        System.out.println("Acontinuacion vamos a operar 2 numeros");
        int Numero1 = 2;
        int Numero2 = 8;
        int resultado = 0;
        System.out.println("Nuestro primer numero sera " + Numero1 + " y el segundo " + Numero2);
        System.out.println("*********************************");

        System.out.println("Bien, una vez introducido los valores comenzaremos a operarlos");
        System.out.println("*********************************");
        System.out.println("Suma");
        resultado = Numero1 + Numero2;
        System.out.println("El resultado de la Suma es " + resultado);
        System.out.println("*********************************");

        System.out.println("Resta");
        resultado = Numero1 - Numero2;
        System.out.println("El resultado de la Resta es " + resultado);
        System.out.println("*********************************");

        System.out.println("Multiplicacion");
        resultado = Numero1 * Numero2;
        System.out.println("El resultado de la Multiplicacion es " + resultado);
        System.out.println("*********************************");

        System.out.println("Division");
        resultado = Numero2 / Numero1;
        System.out.println("El resultado de la Division es " + resultado);
        System.out.println("*********************************");

        System.out.println("Ahora trabajeremos con valores double, nos permiten decimales");
        double Numero3 = 2.5;
        double Numero4 = 8.3;
        double resultado2 = 0;
        double resultado3 = 0;
        System.out.println("Nuestro primer numero sera " + Numero3 + " y el segundo " + Numero4);
        System.out.println("*********************************");

        System.out.println("Raiz");
        resultado2 = Math.sqrt(Numero3);
        resultado3 = Math.sqrt(Numero4);
        System.out.println("El resultado de las Raices es " + resultado2 + " y " + resultado3);
        System.out.println("*********************************");

        System.out.println("Potencia");
        resultado2 = Math.pow(Numero3, Numero4);
        System.out.println("El resultado de las Potencia es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Ahora trabajeremos con operaciones trigonometricas");
        System.out.println("*********************************");

        System.out.println("Seno");
        resultado2 = sin(Numero3);
        System.out.println("El resultado del seno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Coseno");
        resultado2 = cos(Numero3);
        System.out.println("El resultado del coseno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Tangente");
        resultado2 = tan(Numero3);
        System.out.println("El resultado de la tangente es " + resultado2);
        System.out.println("*********************************");

        System.out.println("ArcoSeno");
        resultado2 = asin(Numero3);
        System.out.println("El resultado del arco seno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("ArcoCoseno");
        resultado2 = acos(Numero3);
        System.out.println("El resultado del arco coseno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("ArcTangente");
        resultado2 = atan(Numero3);
        System.out.println("El resultado del arco tangente es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Ahora trabajeremos con funciones hiperbolicas");
        System.out.println("*********************************");

        System.out.println("Seno Hiperbolico");
        resultado2 = sinh(Numero3);
        System.out.println("El resultado del seno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Coseno Hiperbolico");
        resultado2 = cosh(Numero3);
        System.out.println("El resultado del coseno es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Tangente Hiporbolico");
        resultado2 = tanh(Numero3);
        System.out.println("El resultado de la tangente es " + resultado2);
        System.out.println("*********************************");

        System.out.println("Ahora usaremos un generador de numeros aleatorios");
        System.out.println("*********************************");

        System.out.println("Numero aleatorio");
        resultado2 = Math.random();
        System.out.println("El numero aleatorio fue " + resultado2);
        System.out.println("*********************************");
    }
}
