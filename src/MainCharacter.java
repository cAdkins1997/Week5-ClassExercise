import java.util.Arrays;

public class MainCharacter extends NPC {
    private String chosenName;
    private boolean knowsGivenName = false;

    //getters related to whether the MC knows their real and if they have chosen another name for themselves
    public String getChosenName() {
        return chosenName;
    }
    public boolean isKnowsGivenName() {
        return knowsGivenName;
    }

    //setters for the same information as above
    public void setChosenName(String chosenName) {
        this.chosenName = chosenName;
    }
    public void setKnowsGivenName(boolean knowsGivenName) {
        this.knowsGivenName = knowsGivenName;
    }

    @Override
    public String toString() {
        return "MainCharacter{" +
                "chosenName='" + chosenName + '\'' +
                ", knowsGivenName=" + knowsGivenName +
                ", givenName='" + givenName + '\'' +
                ", locationString='" + locationString + '\'' +
                ", locationCoordinates=" + Arrays.toString(locationCoordinates) +
                ", Health: " + health + '\'' +
                ", isAlive" + isAlive + '\'' +
                ", status='" + status + '\'' +
                ", money: " + money + '\'' +
                ", abilityIntellect=" + abilityIntellect +
                ", abilityPsyche=" + abilityPsyche +
                ", abilityPhysique=" + abilityPhysique +
                ", abilityMotorics=" + abilityMotorics +
                '}';
    }

    MainCharacter(){
        givenName = "Civilian";
        locationString = "Someplace";
        locationCoordinates = new double[] {0, 0, 0};
        status = "exists";
        abilityIntellect = 1;
        abilityPsyche = 1;
        abilityPhysique = 1;
        abilityMotorics =1 ;
        chosenName = "none";
        knowsGivenName = false;
    }

    public MainCharacter(String givenName, String locationString, double money, String status, int abilityIntellect, int abilityPsyche,
                         int abilityPhysique, int abilityMotorics, String chosenName, boolean knowsGivenName) {
        this.givenName = givenName;
        this.locationString = locationString;
        this.status = status;
        this.money = money;
        this.abilityIntellect = abilityIntellect;
        this.abilityPsyche = abilityPsyche;
        this.abilityPhysique = abilityPhysique;
        this.abilityMotorics = abilityMotorics;
        this.knowsGivenName = knowsGivenName;
        this.chosenName = chosenName;
    }
}
