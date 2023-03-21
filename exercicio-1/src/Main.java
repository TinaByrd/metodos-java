public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3,5);//passa o nome dda classe + metodo + parâmetros
        Calculadora.subtracao(4,2);
        Calculadora.multiplicacao(4,6);
        Calculadora.divisao(8,2);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensgagem(3);
        Mensagem.obterMensgagem(8);
        Mensagem.obterMensgagem(20);
        Mensagem.obterMensgagem(15);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }

}