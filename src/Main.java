public class Main {
    public static void main(String[] args) {
        MainCharacter hoboCop = new MainCharacter("Harrier \"Harry\" Du Bois", "Whirling-In-Rags, Martinese, Revachol",
                180, "Hungover", 3, 4, 2, 3, "none", false);

        NPC cafeteriaManager = new NPC("Cafeteria Manager", "Whirling-In-Rags, Martinese, Revachol",
                new double[]{0, 5, 0}, 276, "Tending to the bar",
                true, 4, 2, 1, 4);

        NPC kimKitsuragi = new NPC("Kim Kisaragi", "Whirling-In-Rags, Martinese, Revachol",
                new double[]{-1, -1, 0}, 190, "Accompanying the Hobo Cop", true,
                5, 2, 3, 3);

        KimsGun kimsGun = new KimsGun();

        System.out.print("Characters :\n " + hoboCop + "\n" + cafeteriaManager + "\n" + kimKitsuragi +
                "\n\n" + "Items: \n" + "\n" + kimsGun);

        System.out.print("Select an action using the integer that corresponds with each option: \n 1.) Question the cafeteria manager " +
                "\n 2.) By a drink \n 3.) Dance to disco music\n");

        if (ConversationSelection.getUserInput() == 1) {
            ConversationSelection.questionTheCafeteriaManager(hoboCop);
            ConversationSelection.handleYourDebts(cafeteriaManager, hoboCop, kimsGun);
        } else if (ConversationSelection.getUserInput() == 2) {
            ConversationSelection.buyADrink(hoboCop);
        } else if (ConversationSelection.getUserInput() == 3) {
            ConversationSelection.danceToDisco(hoboCop, kimKitsuragi);
        }
        System.out.println(hoboCop + "\n" + cafeteriaManager + "\n" + kimKitsuragi + "\n" + kimsGun);
    }
}