//Treinar sobrecarga. Mantem o nome do metodo e altera seus parâmetros
//Calcular área dos 3 quadriláteros notáveis
public class Quadrilatero {

    //Quadrado

    public static void area(double lado) {
        System.out.println("Área do Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do Retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMenor, double baseMaior, double altura) {
        System.out.println("Área do Trapézio: " + ((baseMaior + baseMenor)* altura)/2);
    }
}
