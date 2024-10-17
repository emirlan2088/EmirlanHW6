public class Main {
    public static void main(String[] args) {
        Weapon sword = new Weapon(Weapon.WeaponType.SWORD, "Excalibur");
        Skeleton skeleton1 = new Skeleton("Skeleton Warrior", 100, sword, 30);
        Skeleton skeleton2 = new Skeleton("Skeleton Archer", 80, new Weapon(Weapon.WeaponType.BOW, "Bow of Shadows"), 50);

        skeleton1.printInfo();
        System.out.println();
        skeleton2.printInfo();
    }
}