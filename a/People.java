package HML_projects.a;

//Encapsulation examples, using

public class People {
    private int population; //a non static variable belongs to the objects of the class

    public void setPopulation( int population){   //a setter to allow, non static so each obj has its own
        if (population > 0 ){
            this.population = population;
        }
    }
    public int getPopulation() {
        return population;
    }
    public void increasePopulation(int howMuch){
        setPopulation(getPopulation() + howMuch); //this way utilizes the check done in the setPopulation method
    }
    public void decreasePopulation(int howMuch){
        setPopulation( getPopulation() - howMuch);
    }
}