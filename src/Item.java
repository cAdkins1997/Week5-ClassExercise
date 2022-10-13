import java.util.Arrays;

public class Item {
    protected String ownersName;
    protected String locationString;
    protected double[] locationCoordinates;
    protected int daysOwned;
    protected long weight;
    protected boolean stolen;
    protected float cost;

    public String getOwnersName() {
        return ownersName;
    }
    public String getLocationString() {
        return locationString;
    }
    public double[] getLocationCoordinates() { return locationCoordinates;}
    public int getDaysOwned() {
        return daysOwned;
    }
    public float getWeight() {
        return weight;
    }
    public boolean isStolen() {
        return stolen;
    }
    public float getCost() {
        return cost;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }
    public void setLocationString(String locationString) {
        this.locationString = locationString;
    }
    public void setLocationCoordinates(double[] locationCoordinates) { this.locationCoordinates = locationCoordinates; }
    public void setDaysOwned(int daysOwned) {
        this.daysOwned = daysOwned;
    }
    public void setWeight(long weight) {
        this.weight = weight;
    }
    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Main.Item{" +
                "ownersName='" + ownersName + '\'' +
                ", locationString='" + locationString + '\'' +
                ", locationCoordinates=" + Arrays.toString(locationCoordinates) +
                ", daysOwned=" + daysOwned +
                ", weight=" + weight +
                ", stolen=" + stolen +
                ", cost=" + cost +
                '}';
    }

    Item() {
        ownersName = "no one";
        locationString = "Somewhere";
        locationCoordinates = new double[] {0, 0, 0};
        daysOwned = 0;
        weight = 0;
        stolen = false;
        cost = 0;
    }

    public Item(String ownersName, int daysOwned, String locationString, double[] locationCoordinates, long weight, boolean stolen, float cost) {
        this.ownersName = ownersName;
        this.locationString = locationString;
        this.locationCoordinates = locationCoordinates;
        this.daysOwned = daysOwned;
        this.weight = weight;
        this.stolen = stolen;
        this.cost = cost;
    }
}