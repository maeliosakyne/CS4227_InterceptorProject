public class Movie {
    
    public static final int REGULAR = 0; //define the price code for a regular movie as a constant

    private final String title; //declare a final field to store the movie title
    private final int priceCode; //declare a final field to store the movie price code

    public Movie(String title, int priceCode) { // constructor for Movie class with two parameters, title and pricecode
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title; //return movie title
    }

    public int getPriceCode() {
        return priceCode; //return pricecode
    }
}