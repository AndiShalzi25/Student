package Models;

public class Grade extends BaseEntity {
    public int Points;
    public int Weight;

    public Grade() {

    }

    public int getPoints() {
        return Points;
    }

    public void setPoints(int points) {
        Points = points;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

}
