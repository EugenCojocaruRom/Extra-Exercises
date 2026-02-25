EX\_25FEB - Aid distribution efficiency

Create a function named 'distributeAid' that receives 'needs', 'inventory', and 'maxDistance' as its parameters.

This function aims to determine the most efficient way to distribute aid supplies to communities in need, minimizing the total distance traveled while ensuring each community receives the required supplies.

&nbsp;- The 'needs' parameter represents the needs of each community, where each row corresponds to a community and each column represents a specific type of supply. The values indicate the quantity of each supply needed by the respective community.

&nbsp;- The 'inventory' parameter represents the available supplies at the distribution center, where each row represents a type of supply and each column represents a different storage location. The values indicate the quantity of each supply available at each location.

&nbsp;- The 'maxDistance' parameter represents the maximum distance a delivery truck can travel in a single trip.

To solve this problem, implement an algorithm that efficiently allocates the available supplies to the communities based on their needs while respecting the maximum distance constraint. The function should determine the optimal delivery plan, specifying the quantity of each type of supply to be delivered to each community on each trip.

The function should return a 2D integer array distributionPlan, where each row represents a delivery trip and each column represents a community. The values indicate the quantity of each type of supply delivered to each community on that trip.

Parameters:

 - needs (int\[]\[]): A 2D integer array representing the needs of each community, where each row represents a community and each column represents a specific type of supply. The values indicate the quantity of each supply needed.

 - inventory (int\[]\[]): A 2D integer array representing the available supplies at the distribution center, where each row represents a type of supply and each column represents a different storage location. The values indicate the quantity of each supply available at each location.

 - maxDistance (int): An integer representing the maximum distance a delivery truck can travel in a single trip.

The function returns a 2D integer array 'distributionPlan', where each row represents a delivery trip and each column represents a community. The values indicate the quantity of each type of supply delivered to each community on that trip.

