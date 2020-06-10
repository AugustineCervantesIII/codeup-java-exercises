public class DishTest {
    public static void main(String[] args){

        //for public
//        Dish dish1 = new Dish();
//        dish1.costInCents = 5;
//        dish1.nameOfDish = "Best Damn Blueberry Pancakes";
//        dish1.wouldRecommend = true;
//        dish1.printSummary();


//        System.out.println(one.costInCents);
//        System.out.println(one.nameOfDish);
//        System.out.println(one.wouldRecommend);

        //for private
        Dish dish1 = new Dish();
        dish1.setCostInCents(5);
        dish1.setNameOfDish("blueberry Pancakes");
        dish1.setWouldRecommend(false);

        DishTools.analyzeDishCost(dish1);
        DishTools.shoutDishName(dish1);
        DishTools.flipRecommendation(dish1);
        dish1.printSummary();

    }
}

//PART 1
//Refactor your Dish and DishTest classes...
//1) Change all properties in the Dish class to private visibility
// (printSummary should remain public)

//2) Add getters and setters for these properties (write them manually
// then erase them and use IntelliJ to write them quickly)

//3) Refactor code as needed in DishTest to access and modify dish object property values
//4) Add a constructor method to Dish that will assign all properties

//5) Refactor DishTest again to use the constructor to set all property values rather than setter methods

//PART 2
//Create a class of static fields (properties and methods) called DishTools
//- AVERAGE_COST_OF_DISH_IN_CENTS - an integer constant set to 13000

//- shoutDishName() - that takes in a Dish object and prints out the name in all caps

//- analyzeDishCost() - that takes in a Dish object and will print out either

// "More expensive than average" or "Less expensive than average", depending on the
// value of the dish costInCents compared to AVERAGE_COST_OF_DISH_IN_CENTS

//- flipRecommendation() - that takes in a Dish object and reverses the wouldRecommend boolean value
