package FoodTrucks;

public class FoodTruck {
	
	private static int counter =0;
	private int id;
	private String name;
	private String foodType;
	private double rating;
	
	//no arg constructor since we will be restricted from default const
	public FoodTruck(){
		
	}
	
	//3 arg constructor, autoincraments counter to keep track of Ids
	
	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		id = counter++;
	}
	//generated getters/setters and toString w/cmd+opt+s

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", foodType=" + foodType + ", rating=" + rating + "]";
	}
	
	

}
