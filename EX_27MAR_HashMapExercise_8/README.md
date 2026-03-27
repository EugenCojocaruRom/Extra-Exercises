EX_27MAR - HashMap exercise 8
Create a method named 'printNestedInventory' that takes a nested HashMap called inventory as input. In this inventory:
 - Keys are categories (e.g., "Electronics", "Furniture").
 - Values are inner HashMaps where keys are product names and values are their prices.
Your method should print the inventory in the following format:
 - For each category, print Category: <name>
 - If the category has products, print each one as Product: <name>, Price: <price> (with 2 spaces of indentation)
 - If the category has no products, print (No products) (with 2 spaces of indentation)
Example output:
Category: Electronics
  Product: Laptop, Price: 1200
  Product: Smartphone, Price: 800
Category: Furniture
  Product: Chair, Price: 50
  Product: Table, Price: 150
Category: EmptyCategory
  (No products)

