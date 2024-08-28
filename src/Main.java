public class Main {
    public static void main(String[] args) {
        Produto galaxyS20 = new Produto("Smartphone","S", "FE", "Preto", .75f, 9.2f, 15.5f );
        Produto geladeiraFF = new Produto("Eletrodomestico", "Galaxy Frost", "Turbo", "Preto", 100.2f, 70.2f, 200.50f);

        galaxyS20.setRam(12);
        galaxyS20.setArmazenamento(256);
        galaxyS20.delete("modelo");

        galaxyS20.status();
        galaxyS20.statusCompleto();
    }
}