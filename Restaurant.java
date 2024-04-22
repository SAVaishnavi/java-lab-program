package activity;
public class Restaurant {
   
    private String name;
    private String cuisine;
    private int rating;
    public Restaurant(String name, String cuisine, int rating) {
        this.name = name;
        this.cuisine = cuisine;
        this.rating = rating;
    }

    public void displayInfo() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Rating: " + rating);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public static void main(String[] args) {
        Restaurant myRestaurant = new Restaurant("Vaishnavi", "French", 4);
        System.out.println("Initial Info:");
        myRestaurant.displayInfo();

        myRestaurant.setName("Akanksha");
        myRestaurant.setRating(5);

        System.out.println("\nModified Info:");
        myRestaurant.displayInfo();
    }
}
