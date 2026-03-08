EX\_08MAR - 3D Game Board Tracker

Create a 3D game board tracker that simulates multiple levels of a game grid.

Method: create3DGameBoard takes three parameters:

&nbsp;   levels - number of game levels (depth)

&nbsp;   rows - number of rows per level

&nbsp;   cols - number of columns per level

Returns: A formatted string representing the 3D array.

Cell Value Calculation:

Each cell's value is calculated as follows:

&nbsp;   Base value: Add the 1-based position indices:

&nbsp;   (level index + 1) + (row index + 1) + (col index + 1) This is the starting value before applying any edge rules. Examples:

&nbsp;       Cell at \[0]\[0]\[0]: base value = 1 + 1 + 1 = 3

&nbsp;       Cell at \[1]\[2]\[3]: base value = 2 + 3 + 4 = 9

&nbsp;   Edge multiplier: Multiply the base value by 10 if the cell is on the outer boundary:

&nbsp;       Level is the first (0) or last (levels-1), OR

&nbsp;       Row is the first (0) or last (rows-1), OR

&nbsp;       Column is the first (0) or last (cols-1)

&nbsp;   This rule is applied AFTER calculating the base value. Examples:

&nbsp;       Cell \[0]\[0]\[0]: base = 3, on boundary (first level, first row, first col) → 3 × 10 = 30

&nbsp;       Cell \[0]\[1]\[1]: base = 5, on boundary (first level) → 5 × 10 = 50

&nbsp;       Cell \[1]\[1]\[1] (in a 3×3×3 board): base = 6, NOT on any boundary → stays 6 (no multiplier)

Your task: Implement the logic to fill the 3D array with the correct calculated values.

