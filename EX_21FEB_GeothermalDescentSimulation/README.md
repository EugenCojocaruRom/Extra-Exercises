EX\_21FEB - Geothermal Descent Simulation

Create a function named geothermalDescent that receives initialElevation, slopeChanges, and geothermalActivity as its parameters.

Calculating the final elevation and the number of significant geothermal features encountered.

Take into account:

&nbsp;- If the geothermal activity level is above 0.75, skip the next slope change (use continue).

&nbsp;- If the geothermal activity level is above 0.9, it's too dangerous to proceed, and end the process early (use break).

&nbsp;- A significant geothermal feature is counted when the activity level is between 0.5 and 0.75 (inclusive).

Use compound assignment operators (+=, -=) and increment/decrement operators (++, --) to update the elevation. Incorporate Math.sin() to add variability to the slope changes.

Parameters:

&nbsp;- initialElevation (int): The starting elevation in meters.

&nbsp;- slopeChanges (int\[]): An array representing the slope changes (positive for uphill, negative for downhill).

&nbsp;- geothermalActivity (float\[]): An array representing geothermal activity levels at each step.

The function returns an integer array with two elements: the final elevation and the count of significant geothermal features encountered.


