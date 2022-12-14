import java.util.ArrayList;

public class ClonePie {
    public static void main(String[] args) throws Exception {
        ArrayList<Pie> pies = new ArrayList<>();
        pies.add(new Pie(10.0, "Apple"));
        pies.add(new Pie(9.5, "Rhubarb"));
        pies.add(new Pie(3.5, "Blueberry"));
        pies.add(new Pie(6.5, "Pecan"));
        pies.add(new Pie(8.0, "Pecan"));
        system.Out.println(findYummiestPie(input));
        // output [(10.0 "Apple"), (9.5, "Rhubarb"), ..., (10.0, "Appple")]
        
        // yummiestBestOrder(pies);
        /* if you do yummiestBestOrder instead of cloneYummiestPie, 
        you'll output [(10.0 "Apple"), (9.5, "Rhubarb"),
                (3.5, "Blueberry"), (10.0, "Appple"),
                (6.5, "Pecan"), (6.5, "Pecan")]
         */ 
    }

    // inserting a copy of the yummiest pie at the end of the list 
    static void cloneYummiestPie(ArrayList<Pie> pies) {
        /* write your pseudocode here! - Loop through all the pies to see which two have the highest rating. 
           Then, whichever the two highest are (Apple and Rhubarb) you add them to the arrays list and compare them to the initial pies. 
           If when compared they return a higher number of yumminees, add those to the arrays list and return the list. 
        */
    }

public static Pie findYummiestPie(arraylist<Pie> input) {
    Pie ClonePieRating = input.get(0);
    for (int i = 1; i < input.size(); i++) {
        if(input.get(i).yumminess > ClonePieRating.yumminess) {
            ClonePieRating = input.get(i);
        }
    }
    return ClonePieRating;
}


        // give me 2 examples and their output. 

    // inserting the cloned yummiest pie 
    // at an index so that its clone 
    // is evenly spaced away from it. 
    // hint: you can use add(int index, E element)
    static void yummiestBestOrder(ArrayList<Pie> pies) { 
        // write your pseudocode here! 
        // give me 2 examples and their output. 
    }

}

class Pie {
    double yumminess; 
    String type; // Pumpkin, pecan, etc. 

    Pie(double yumminess, String type) {
        this.yumminess = yumminess; 
        this.type = type;
    }
}
