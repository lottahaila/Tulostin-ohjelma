public class App {
    public static void main(String[] args) {
                System.out.println("Hei olen Tulostin-ohjelma");
        System.out.println("Ohjelman tekija: ");
        String tekija = "Lotta";
        System.out.println(tekija);
        double luku1 = 5;
        double luku2 = 2;
        System.out.println(luku1);
        System.out.println(luku2);
        System.out.println("Luku1-muuttujan arvo on: " + luku1);
        System.out.println("Luku2-muuttujan arvo on: " + luku2);
        final double tulo = luku1 * luku2;
        System.out.println("Tulo on: " + tulo);
        double erotus = luku1 - luku2;
        double summa = luku1 + luku2;
        double jako = luku1 / luku2;
        System.out.println("Erotus on: " + erotus);
        System.out.println("Summa on: " + summa);
        System.out.println("Jako on: " +jako);
    }
}
