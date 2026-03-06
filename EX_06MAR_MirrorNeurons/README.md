EX\_06MAR - Mirror neurons

Create a function named 'mirrorNeurons' that receives 'grid' and 'actions' as its parameters.

The grid parameter is a 2D array of neurons, where each cell contains an integer representing the neuron’s activity level.

The actions parameter is a list of strings, where each string represents a specific movement observed (e.g., "smile", "frown", "wave").

For each action in the actions list, the function should:

&nbsp;- Reverse the rows in the grid to simulate the mirroring effect of observing an action.

&nbsp;- Increase the activity level of all neurons in the grid by 1.

Parameters:

&nbsp;- grid (int\[]\[]): A 2D integer array representing the initial activity levels of the neurons. Dimensions: 1x1 to 10x10. Each integer: 1 to 100.

&nbsp;- actions (String\[]): An array of strings, where each string represents a specific movement observed. Each action is a non-empty string of lowercase letters.

The function should return a 2D integer array representing the final neuron activity levels after processing all the observed actions.

