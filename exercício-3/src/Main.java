public class Main {
    public static void main(String[] args) {
        System.out.println("Exercício quadriláteros");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(6, 8);
        System.out.println("Área de retângulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(4,6,8);
        System.out.println("Área de trapézio: " + areaTrapezio);
    }
}