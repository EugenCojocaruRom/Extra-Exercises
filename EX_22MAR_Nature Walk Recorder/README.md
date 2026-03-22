EX\_22MAR - Nature Walk Recorder

Create a function named natureWalkRecorder that receives observations and pattern as its parameters.

Implement this function using a combination of advanced data structures (specifically, a linked list) and control flow concepts.

You'll need to manipulate the array, implement a linked list, and use control flow statements to achieve the desired pattern.

Parameters:

&#x20;- observations (int\[]): An array of integers representing the elements observed during the walk. Each integer corresponds to a natural element (1 = tree, 2 = flower, 3 = bird, 4 = squirrel, 5 = butterfly).

&#x20;- pattern (int): An integer representing the recording pattern (1 = normal order, 2 = reverse order, 3 = alternating order).

The function returns a String array representing the recorded observations based on the given pattern.

Follow these steps to implement the function:

&#x20;- Create a linked list to temporarily store the observations.

&#x20;- Traverse the input array and add each element to the linked list.

&#x20;- Based on the pattern parameter, process the linked list:

&#x09;> If pattern is 1, keep the order as is.

&#x09;> If pattern is 2, reverse the entire linked list.

&#x09;> If pattern is 3, reverse every other element in the linked list.

&#x20;- Convert the processed linked list back to an array, translating the integer codes to descriptive strings.

Use appropriate control flow statements (like break and continue) to handle the different patterns efficiently.

