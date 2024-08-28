public class Main {
    public static void main(String[] args) {
        Samsung galaxyS20 = new Samsung("Smartphone","S", "FE", "Preto", .75f, 9.2f, 15.5f );
        Samsung geladeiraFF = new Samsung("Eletrodomestico", "Galaxy Frost", "Turbo", "Preto", 100.2f, 70.2f, 200.50f);

        galaxyS20.setRam(12);
        galaxyS20.setArmazenamento(256);
        galaxyS20.updateModelo("Galaxy S");
        galaxyS20.status();
        galaxyS20.status2();


        geladeiraFF.status();
        geladeiraFF.status2();
    }
}