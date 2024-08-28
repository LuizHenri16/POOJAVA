public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    private boolean tampada;


    public Caneta (String cor, String modelo, float ponta ) {
            this.modelo = modelo;
            this.cor = cor;
            this.ponta = ponta;
    }

    public void tampar() {
        tampada = true;
        System.out.println("Tampando");
    }

    public void destampar() {
        System.out.println("destampando tampada");
        tampada = false;
    }

    public void status() {
        if (tampada == true) {
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("A caneta está destampada");
        };

        System.out.println("A cor da caneta é " + cor);
        System.out.println("A caneta tem ponta " + ponta);
        System.out.println("Está com carga de " + carga + "%");
    }
 }
