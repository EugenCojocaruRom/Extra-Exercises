EX\_12FEB - Simplify clothes names

Simplify the name of a clothing item based on its full name and length.

Steps to simplify the clothing name:

\* Determine the prefix based on the length:

&nbsp;- If length is less than 30 cm, use "Mini-"

&nbsp;- If length is between 30 cm and 50 cm (inclusive), use "Midi-"

&nbsp;- If length is greater than 50 cm, use "Long-"

\* Remove all spaces from the full name

\* Keep only the first 10 characters of the name (after removing spaces)

\* Convert the entire simplified name (prefix + modified name) to lowercase

Parameters:

&nbsp;- fullName (String): The original name of the clothing item. It will only contain alphabetic characters and spaces.

&nbsp;- length (int): The length of the clothing item in centimeters. It will be a positive integer.

The function returns a string representing the simplified name of the clothing item.

