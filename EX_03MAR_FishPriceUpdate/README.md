EX\_03MAR - Fish price update

Create a function named 'updateFishPrices' that receives 'fishWeights' and 'basePricePerKg' as its parameters.

Create a function that calculates the new prices based on the weight of each fish and a base price per kilogram.

Use nested loops to process the 2D array of fish weights and calculate their new prices according to the following rules:

&nbsp;- For fish weighing less than 500 grams: base price per kg

&nbsp;- For fish weighing 500 grams or more but less than 1000 grams: base price per kg + 10% premium

&nbsp;- For fish weighing 1000 grams or more: base price per kg + 20% premium

Parameters:

&nbsp;- fishWeights (int\[]\[]): A 2D array where each element represents the weight of a fish in grams.

&nbsp;- basePricePerKg (int): The base price per kilogram of coalfish in cents.

The function returns a 2D integer array with the same dimensions as the input, where each element represents the updated price of the corresponding fish in cents.

Note: Round down any fractional cents to the nearest integer.

