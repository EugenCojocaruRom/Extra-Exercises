EX\_19MAR - Zoo Animal Descriptions Formatter

Create a function named formatAnimalDescriptions that receives descriptions as its parameter.

This function aims to format and rearrange animal descriptions.

The descriptions parameter is an array where each string represents a scrambled description of an animal. Each description is a semi-colon separated string containing the zoo section number, animal count, and a brief description, but the sections might be in a scrambled order.

To solve this challenge, follow these steps:

&#x20;- Reverse the order of the descriptions array to start the descriptions from the last section.

&#x20;- For each description string:

&#x20;  > Split the string by semi-colon to separate the section number, animal count, and description.

&#x20;  > Extract the section number and convert it to an integer.

&#x20;  > Extract the animal count, increment it by 1 if the section number is even, or decrement it by 1 if the section number is odd.

&#x20;  > Construct the formatted description string in the format: "In Section X, there are Y animals: \[description]", where X is the section number and Y is the updated animal count.

&#x20;- Return the formatted descriptions as a new array.

Parameters:

&#x20;- descriptions (String\[]): An array where each string represents a scrambled description of an animal.

The function returns a String\[] where each string is a neatly formatted description of the animal. Each description should start with the formatted zoo section, followed by the formatted animal count, and end with the description.

