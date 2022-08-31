# FoodTruckApp.java Week 2 Assignment

##Description

This program is separated into 2 classes. We have our FoodTrucks class and our
FoodTruckApp class. Our FoodTruck class is going to declare our fields (private)
as well as define our no arg constructor FoodTruck() and our 3 arg
FoodTruck(String name, String foodType, double rating). Our 3 arg construstor
will utilize the this. to ensure our parameters are always being applied to our
working object. It also initialized id = counter++; so each time our 3 arg constructor
is instantiated, our id field is incremented. We do not use our no
arg constructor, but we have it in our class for good practice since we no longer
have access to the default constructor. We also have our eclipse generated
getters, setters and toString().

The main focus for me with this FoodTruckApp was readability, method utilization
and the absence of hardcoding. The FoodTruck app begins with initializing a
scanner, as well as an array of FoodTruck objects(ftArr[]) within the class, but outside of
the main, so they wouldn't be restricted by the main's scope, and would be able to
be utilized throughout the class. The main method is only 4 lines of code. It
instantiated our FoodTruck App object, calls our getTruckData(), displayMenu()
and menuOperations();. The getTruckData prompts the user for the FoodTruck name,
foodType and rating. If the user enters "quit" for the truck name, the program will
go to the displayMenu(), so long as the user has entered at least one name. If
the user has not entered at least one name and enters "quit", the program will
crash. Once we have received all of the info from the user, the program
insantiates a new object of the FoodTruck type and assigns it's values to the
appropriate index of the ftArr array. The program then will call the displayMenu()
and prompt the user to make a selection. It will then call the menuOperations()
where it will take the selection the user made, and convert it into methods
using switch statements. We will either display the list of trucks so far, calculate
the average rating of the trucks, determine the highest rating, or quit the
program. If the user user selects from ourside of these choices, the program
will display an error message promting the user to make the correct selection.

The listFoodTrucks() will use a for loop to index through the array of FoodTrucks
and print out each index's toString so long as the value is not null.

the calculateAverage() will also index thorugh a for loop, however so long as the
program doesn't find a null value in an index it will continue to incremennt the
ratings variable which we will use to divide our sum by. Our sum is found by
setting the initial value of sum to 0, and adding the index's rating value (gotten
by using the .getRating() ) to the previous sum as it indexes.

the getHighestRating() sets the initial value of a highestRating variable
initialized with the first index of the array of Foodtruck objects. This will
set a base line for the first value, and allows us to then index through the rest
of the array comparing the current index to the highestRating. If the current
index is the highest, it will then be assigned to highestRating. The highest rating
will be printed out in the end. If the rating is a tie, the object that held
the title first will be shows has having the highestRating




##What I learned a lot over this assignment. I found myself going to
Stackoverflow time and time again to figure out why my code wasn't working, or
how I could make it more readable. The biggest issues I faced was the nextDouble()
skipping over the user input for name. After some research I found out that it was
because nextDouble() looks for the next character, and since \n isn't a character,
it skips over the user input and goes straight to the next. The workaround for that
was putting a .nextLine() after the .nextDouble(); however it did take me a few hours
of messing around with my code before realizing it was something as simple as that.
Tinkering is great for learning, but researching will definitely be my bestfriend when
i hit a brick wall. The other issue I faced was getting a return from a method and
assigning it to a variable. I think in the end that helped my main method look a
lot cleaner because I couldn't break down my methods into much smaller chunks like
I wanted to, but all it all, the code worked how I wanted it to!


##Technologies used
Java, Eclipse, Git, GitHub, Terminal, Zoom, StackOverflow
# FoodTruckProject-
# FoodTruckProject-
