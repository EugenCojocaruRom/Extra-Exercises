EX_29MAR - Warehouse Management
Create a method named 'manageWarehouse' that takes two arguments:
 - A HashMap named warehouse where:
        Keys represent product names (String).
        Values represent quantities (Integer).
 - A list of operations (String[] operations) where each string follows one of these formats:
  > "ADD product quantity" → Adds the given quantity to the existing product (or creates it if not present).
  > "REMOVE product quantity" → Decreases the quantity of the product. If quantity becomes 0 or negative, remove the product.
  > "CHECK product" → Prints true if the product exists, otherwise false.
  > "PRINT" → Prints all products and their quantities in the format:
	Product: Laptop, Quantity: 10
	Product: Mouse, Quantity: 50
To convert a String into an Integer, we use:
	String quantityString = "25";  
	int quantity = Integer.valueOf(quantityString);  
	System.out.println(quantity + 5); // Output: 30
Integer.valueOf() ensures we get an integer that we can use in calculations.

