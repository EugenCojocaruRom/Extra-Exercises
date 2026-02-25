import java.util.ArrayList;
import java.util.List;

class DistributeAid {

    //Method for determining the distribution plan
    public static int[][] distributeAid(int[][] needs, int[][] inventory, int maxDistance, int[] distances) {
        //Handle the case when the needs array is empty or null
        if (needs == null || needs.length == 0) {
            return new int[0][0];
        }

        //Declare variables of type int
        int numCommunities = needs.length; // -> number of rows
        int numSupplies = needs[0].length; // -> number of columns

        //Convert the 2D 'inventory' array into a single 1D array
        int[] totalStock = new int[numSupplies];
        for (int i = 0; i < inventory.length; i++) {
            for (int j = 0; j < inventory[i].length; j++) {
                totalStock[i] += inventory[i][j];
            }
        }

        //Declare list of type int that will hold the allocations for the communities
        List<int[]> distributionPlan = new ArrayList<>();

        //Distribute supplies by community --> based on the expected output, each row is a community's fulfilled supplies delivery
        //Loop from i = 0 to value of 'numCommunities', incrementing i by 1
        for (int i = 0; i < numCommunities; i++) {
            //Skip this community if it is too far away
            if (distances != null && i < distances.length && distances[i] > maxDistance) {
                continue;
            }
            //Declare variable of type int to track what each community will receive
            int[] currentTripSupplies = new int[numSupplies];
            //Declare variable of type boolean (to be used as a flag) and set it to false
            boolean deliveredAnything = false;
            //Loop from j = 0 to value of 'numSupplies', incrementing j by 1
            for (int j = 0; j < numSupplies; j++) {
                //Declare variable of type int that will receive the value from 'needs' (what the community needs)
                int amountNeeded = needs[i][j];
                //Declare variable of type int that will receive the value from 'totalStock' (what is available)
                int amountAvailable = totalStock[j];
                //Declare variable of type int that will receive the value calculated as the lesser of what the community needs and what's actually available
                int toGive = Math.min(amountNeeded, amountAvailable);
                //Set condition for checking if the value of 'toGive' is bigger than 0
                if (toGive > 0) {
                    //Record the amount if the condition is satisfied
                    currentTripSupplies[j] = toGive;
                    //Decrease the totalStock by the amount given
                    totalStock[j] -= toGive;
                    //Set the flag to true
                    deliveredAnything = true;
                }
            }
            //Add community to the plan if at least one supply was delivered
            if (deliveredAnything) {
                distributionPlan.add(currentTripSupplies);
            }
        }

        //Convert the 'distributionPlan' List to a 2D array
        return distributionPlan.toArray(new int[distributionPlan.size()][]);
    }
}
