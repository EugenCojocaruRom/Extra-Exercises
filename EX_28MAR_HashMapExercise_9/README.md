EX_28MAR - HashMap exercise 9
Create a method named 'printMostExpensiveProducts' that takes a HashMap<String, HashMap<String, Integer>> (where:
 - Outer keys represent categories (e.g., "Electronics", "Furniture").
 - Inner keys represent product names.
 - Inner values represent product prices.
Your method should:
 - Iterate over each category and find the most expensive product in that category.
 - Print each category along with its most expensive product in the following format:
   > Category: Electronics
	Most Expensive Product: Laptop, Price: 1200
   > Category: Furniture
	Most Expensive Product: Table, Price: 150
 - If a category has no products, print:
   > Category: EmptyCategory
	No products available.
 - If the entire inventory is empty, print:
	No categories in inventory.

