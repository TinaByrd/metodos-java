//Treinar return;
//Calcular área dos 3 quadriláteros notáveis;
public class Quadrilatero {

    //Quadrado

    public static double area(double lado) {
        return  lado * lado;
    }

    public static double area(double lado1, double lado2) {
        
       return lado1 * lado2;
    }

    public static double area(double baseMenor, double baseMaior, double altura) {
        return ((baseMaior + baseMenor)* altura) / 2;
    }
}
