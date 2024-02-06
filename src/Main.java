public class Main {
    public static void main(String[] args) {

        Player player = new Player("Ninja", 100, "Sword");
//        player.name = "Ninja";
//        player.health = 100;
//        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());


        player.loseHealth(110);
        System.out.println("Remaining health = " + player.healthRemaining());


    }
}