public abstract class Price {
    //declares an abstract method that calculates the rental charge for a given number of days
    public abstract double getCharge(int daysRented);

    //provides a default implementation of method that calculates frequent rental points 
    public int getFrequentRenterPoints(int daysRented) {
        return 1; //return 1 frequent rental point for each movie rental 
    }
}
