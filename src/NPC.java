import java.util.Arrays;
import java.util.Objects;

public class NPC {
    protected String givenName;
    protected String locationString;
    protected double[] locationCoordinates;  //each element corresponds with an x, y, z coordinate in that order
    protected String status;
    protected double health = getAbilityPsyche();
    protected boolean isAlive;
    protected double money;
    //Character ability scores
    protected int abilityIntellect;
    protected int abilityPsyche;
    protected int abilityPhysique;
    protected int abilityMotorics;

    //Movement methods
    public void move(double speed, String direction){
        if (isAlive) {
            double[] currentLocation = getLocationCoordinates();
            if (Objects.equals(direction, "north")) {
                currentLocation[0] = currentLocation[0] + speed + abilityMotorics;
            } else if (Objects.equals(direction, "south")) {
                currentLocation[0] = currentLocation[0] - speed + abilityMotorics;
            } else if (Objects.equals(direction, "west")) {
                currentLocation[1] = currentLocation[1] - speed + abilityMotorics;
            } else if (Objects.equals(direction, "east")) {
                currentLocation[1] = currentLocation[1] + speed + abilityMotorics;
            }
        }
    }

    public void punch(NPC target) {
        if (isAlive) {
            target.setHealth(target.getHealth() - 0.25 * getAbilityPhysique());
        }
    }

    public void die(){
        if (health <= 0){
            isAlive = false;
            setStatus("Is dead");
        }
    }

    //Getters for more generic information
    public String getGivenName() { return givenName; }
    public String getLocationString() { return locationString; }
    public double[] getLocationCoordinates() { return locationCoordinates; }
    public String getStatus() { return status; }
    public double getHealth() { return health; }
    public boolean isAlive() { return isAlive; }

    public double getMoney() { return money; }

    //Getters for character ability scores
    public int getAbilityIntellect() { return abilityIntellect; }
    public int getAbilityPsyche() { return abilityPsyche; }
    public int getAbilityPhysique() { return abilityPhysique; }
    public int getAbilityMotorics() { return abilityMotorics; }

    //Setters for more generic information
    public void setGivenName(String givenName) {this.givenName = givenName; }
    public void setLocationString(String locationString) { this.locationString = locationString; }
    public void setLocationCoordinates(double[] locationCoordinates) { this.locationCoordinates = locationCoordinates; }
    public void setStatus(String status) { this.status = status; }
    public void setHealth(double health) { this.health = health; }
    public void setAlive(boolean alive) { isAlive = alive; }

    public void setMoney(double money) { this.money = money; }

    //Setters for character ability scores
    public void setAbilityIntellect(int abilityIntellect) { this.abilityIntellect = abilityIntellect; }
    public void setAbilityPsyche(int abilityPsyche) { this.abilityPsyche = abilityPsyche; }
    public void setAbilityPhysique(int abilityPhysique) { this.abilityPhysique = abilityPhysique; }
    public void setAbilityMotorics(int abilityMotorics) { this.abilityMotorics = abilityMotorics; }

    @Override
    public String toString() {
        return "Main.NPC{" +
                "givenName='" + givenName + '\'' +
                ", locationString='" + locationString + '\'' +
                ", locationCoordinates=" + Arrays.toString(locationCoordinates) +
                ", Health: " + health + '\'' +
                ", status='" + status + '\'' +
                ", isAlive" + isAlive + '\'' +
                ", money: " + money + '\'' +
                ", abilityIntellect=" + abilityIntellect +
                ", abilityPsyche=" + abilityPsyche +
                ", abilityPhysique=" + abilityPhysique +
                ", abilityMotorics=" + abilityMotorics +
                '}';
    }

    NPC(String givenName, String location, double[] locationCoordinates, double money, String status, boolean isAlive, int abilityIntellect, int abilityPsyche,
        int abilityPhysique, int abilityMotorics) {
        this.givenName = givenName;
        this.locationString = location;
        this.money = money;
        this.status = status;
        this.isAlive = isAlive();
        this.abilityIntellect = abilityIntellect;
        this.abilityPsyche = abilityPsyche;
        this.abilityPhysique = abilityPhysique;
        this.abilityMotorics = abilityMotorics;
    }
    public NPC() {
        givenName = "Civillian";
        locationString = "in the same room";
        locationCoordinates = new double[] {0, 0, 0};
        money = 10;
        status = "exists";
        isAlive = true;
        abilityIntellect = 1;
        abilityPsyche = 1;
        abilityPhysique = 1;
        abilityMotorics =1 ;
    }
}
