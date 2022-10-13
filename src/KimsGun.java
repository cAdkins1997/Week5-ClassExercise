import java.util.Arrays;

public class KimsGun extends Item {
    private static int ammoInGun;

    public static void shoot(NPC target, NPC owner) {
        if (owner.getAbilityMotorics() > 2) {
            if (ammoInGun > 0) {
                ammoInGun--;
                target.setHealth(target.getHealth() - 2);
            }
        }
    }

    public int getAmmoInGun() {
        return ammoInGun;
    }
    public void setAmmoInGun(int ammoInGun) {
        KimsGun.ammoInGun = ammoInGun;
    }

    @Override
    public String toString() {
        return "Main.kimsGun{" +
                "ammoInGun=" + ammoInGun +
                ", ownersName='" + ownersName + '\'' +
                ", locationString='" + locationString + '\'' +
                ", locationCoordinates=" + Arrays.toString(locationCoordinates) +
                ", daysOwned=" + daysOwned +
                ", weight=" + weight +
                ", stolen=" + stolen +
                ", cost=" + cost +
                '}';
    }

    KimsGun() {
        ownersName = "Kim Kitsuragi";
        locationString = "In Kim's gun holster";
        locationCoordinates = new double[]{0, 0, 0};
        daysOwned = 367;
        weight = 3;
        stolen = false;
        cost = 159;
        ammoInGun = 10;
    }

    public KimsGun(String ownersName, int daysOwned, String locationString, double[] locationCoordinates, long weight, boolean stolen, float cost, int ammoInGun) {
        this.ownersName = ownersName;
        this.locationString = locationString;
        this.locationCoordinates = locationCoordinates;
        this.daysOwned = daysOwned;
        this.weight = weight;
        this.stolen = stolen;
        this.cost = cost;
        this.ammoInGun = ammoInGun;
    }
}