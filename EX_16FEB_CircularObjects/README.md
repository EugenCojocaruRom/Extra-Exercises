EX\_16FEB - Circular objects counter

Create a function named 'countCircularObjects' that receives action, objectType, and count as parameters.

This function manages counts of circular objects (balls, coins, lenses). It starts with zero counts for all objects. 

Based on the action ('add' or 'remove') and objectType, it updates the count. 

If 'remove' is requested and there are not enough objects, it returns an error message. 

The function returns a message indicating the current counts of all objects after the operation.

Parameters:

&nbsp;- action (String): 'add' or 'remove'.

 - objectType (String): 'ball', 'coin', or 'lens'.

 - count (int): Number of items to add or remove (positive integer).

The function returns a String message indicating the current counts of all objects after each operation.

