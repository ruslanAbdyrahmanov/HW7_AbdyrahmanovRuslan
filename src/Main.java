public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic(100, 50,  "TELEPORT");
        heroes[1] = new Medic(120, 30,  "HEAL");
        heroes[2] = new Warrior(160, 40,  "CRITICAL DAMAGE");
        for (Hero hero : heroes) {
            hero.applySuperAbility();
        }
    }
}
