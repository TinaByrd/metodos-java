//método para mostrar mensagem conforme a hora do dia
public class Mensagem {

    public static void obterMensgagem (int hora) {

        if(hora >= 5 && hora < 12) {
            mensagemBomDia();
        }else if(hora > 12 && hora <= 18) {
            mensagemBoaTarde();
        }else {
            mensagemBoaNoite();
        }

    }
    private static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }
    private static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");
    }
    private static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }


}
