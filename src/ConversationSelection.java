import java.util.Scanner;

public class ConversationSelection {
    public static int getUserInput() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static void questionTheCafeteriaManager(NPC player) {
        System.out.println("After questioning the cafeteria manager as you attempt to leave the establishment he blurts out: " +
                "\" Not so fast. You owe me 130 real.\n");
        if (player.getAbilityPsyche() > 3) {
            System.out.println("No one is saying the multi-patterned necktie you found tied to the cieling fan can *talk*. No on. It must be merely *imagination*, but...\n");
            System.out.println("Horrific Necktie - \"Let's bail! time to push the EJECT button. Sounds like a " +
                    "*responsibility*. You don't like those.");
        }
    }

    public static void handleYourDebts(NPC target, NPC player, Item firearm) {
        System.out.println("1. to bail and start running\n2. to confront your mistakes you ol HoboCop you\n3. to resort to violence");
        if (getUserInput() == 1) {
            tryToRun(player);
        }
        else if (getUserInput() == 2) {
            payYourDebts(player);
        }
        else if (getUserInput() == 3) {
            resortToViolence(target, player, firearm);
        }
    }

    public static void tryToRun(NPC player) {
        if (player.abilityMotorics > 3) {
            System.out.println("You seem to consistently manage to avoid your greater responsibilities in life");
            return;
        } else {
            player.setHealth(player.getHealth() - 1);
            System.out.println("In your attempt to avoid the consequences of your actions you seem to of knocked " +
                    "yourself into a bystander and injured yourself");
        }
    }

    public static void payYourDebts(NPC player) {
        player.setMoney(player.getMoney() - 130);
        System.out.println("You give 130 real to the cafeteria manager and pay your dues to him leaving you with" +
                player.getMoney() + "real.");
    }

    public static void resortToViolence(NPC target, NPC player, Item firearm){
        KimsGun.shoot(target, player);
        firearm.setOwnersName(player.getGivenName());
        firearm.setLocationString("In the Hobo-Cop's hands");
        firearm.setLocationCoordinates(player.getLocationCoordinates());
        firearm.setStolen(true);
        target.die();
        System.out.println("You shoot the cafeteria manager, murdering him in cold blood. You will never be able to" +
                " to return back to the station now. You are a wanted man.");
    }
    public static void buyADrink(NPC player){
        player.setMoney(player.getMoney() - 10);
        if (player.getAbilityPsyche() < 3) {
            player.setHealth(player.getHealth() - 1);
        }
        System.out.println("You buy drink for 10 real");
    }

    public static void danceToDisco(NPC player, NPC partner){
        if (player.getAbilityMotorics() > 3){
            player.setHealth(player.getHealth() + 1);
            System.out.println("You dance to disco fantastically");
        }
        else if (player.getAbilityMotorics() == 3){
            System.out.println("You dance to disco averagely");
        }
        else if (player.getAbilityMotorics() < 3){
            player.setHealth(player.getHealth() - 1);
            player.punch(partner);
            System.out.println("You fumble about like a fool and accidentally bump into Kim, punching him in the face and" +
                    "injury you both");
        }
    }
}