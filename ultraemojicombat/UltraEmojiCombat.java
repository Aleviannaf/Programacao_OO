package ultraemojicombat;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Alexandre", "Brasileiro", 22, 1.69f, 62.5f, 10, 3, 1);
        l[1] = new Lutador("Matheus", "Brasileiro", 20, 1.77f, 62.5f, 9, 2, 2);
        l[2] = new Lutador("ieda", "Cubanoo", 18, 1.50f, 81.2f, 11, 3, 4);
        l[3] = new Lutador("Alex", "Mexico", 24, 1.60f, 80.2f, 9, 4, 2);
        l[4] = new Lutador("Edwin", "Argentino", 26, 1.75f, 90.5f, 5, 3, 1);
        l[5] = new Lutador("David", "Peruano", 24, 1.60f, 91.5f, 9, 4, 2);

        Luta UEC01= new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar(); 
       
    }
}
