EX\_28FEB\_SpecimenAnalysis

Create a function named 'analyzeSpecimens' that receives jars as its parameter.

The function should perform the following operations:

&nbsp;- Calculate the total number of specimens in all jars.

&nbsp;- Find the index of the row (jar set) with the highest number of specimens.

&nbsp;- Reverse the order of specimens in each row.

&nbsp;- Calculate the average number of specimens per jar (rounded down to the nearest integer).

Parameters:

&nbsp;- jars (int\[]\[]): A 2D array where each sub-array represents a set of jars, and each integer represents the number of specimens in a jar.

The function returns a String containing the analysis results in the following format:

"Total specimens: \[total], Highest row: \[row\_index], Reversed data: \[reversed\_2d\_array], Average per jar: \[average]"

Note: The \[reversed\_2d\_array] in the output should be represented as a string version of the 2D array.

