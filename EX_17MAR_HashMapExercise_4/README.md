EX\_17MAR - HashMap exercise 4

Create a method named processHashMap that takes a HashMap<String, Integer> and an array of String operations, then performs the following actions:

1\. GET Operation

&#x20;   Format: "GET key"

&#x20;   Action:

&#x20;       If the key exists: Print the value

&#x20;       If the key doesn't exist: Print "Not found"

2\. CHECK Operation

&#x20;   Format: "CHECK key"

&#x20;   Action:

&#x20;       If the key exists: Print "Exists"

&#x20;       If the key doesn't exist: Print "Not found"

3\. MODIFY Operation

&#x20;   Format: "MODIFY key targetValue"

&#x20;   Action:

&#x20;       If the key exists AND its current value equals targetValue: Use replace() to update the value to targetValue + 1

&#x20;       If the key exists BUT its current value is different from targetValue: Use remove() to delete the key

&#x20;       If the key doesn't exist: Use put() to add it with targetValue as its value

&#x20;   Note: Do NOT print anything during MODIFY operations

