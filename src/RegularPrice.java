public class RegularPrice extends Price {
   
    @Override //override the getcharge method to calculate the rental charge for a regular movie
    public double getCharge(int daysRented) {
        double result = 2.0; //start with a base charge of €2.0
        if (daysRented > 2) { // add €1.50 per day for rentals longer that 2 days
            result += (daysRented - 2) * 1.5;
        }
        return result; // return the final rental charge for a regular movie 
    }
}