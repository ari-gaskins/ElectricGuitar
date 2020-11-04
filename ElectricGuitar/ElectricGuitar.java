//package ElectricGuitar;

public class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    //accessor -> getter
    String getBrand() {
        return brand;
    }

    //mutator -> setter
    void setBrand(String aBrand) {
        brand = aBrand;
    }

    //accessor -> getter
    int getNumOfPickups() {
        return numOfPickups;
    }

    //mutator -> setter
    void setNumOfPickups(int num) {
        numOfPickups = num;
    }

    //accessor -> getter
    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    //mutator -> stetter
    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}