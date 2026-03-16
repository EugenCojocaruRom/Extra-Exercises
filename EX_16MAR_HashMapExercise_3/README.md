EX\_16MAR - HashMap exercise 3

Write a method named modifyMap that modifies a given HashMap based on specific conditions.



&#x20;   Takes a HashMap named data where:

&#x20;       Keys are of type String.

&#x20;       Values are of type Integer.

&#x20;   Takes a String key.

&#x20;   Takes an Integer newValue.



The method should return the updated HashMap by following:



&#x20;   If the key exists in data and has the same value as newValue, use replace() but increase the value by 1.

&#x20;   If the key exists but has a different value, remove it.

&#x20;   If the key does not exist, add it with newValue.

