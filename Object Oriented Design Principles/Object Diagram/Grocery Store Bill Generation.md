Class Diagram
+-----------------+           +----------------+          +-----------------+
|   Customer      | 1      *  |   Product      |          | BillGenerator   |
+----------------+<>---------+----------------+          +-----------------+
| - name: String |           | - name: String |          |                 |
| - products: List<Product> | | - quantity: float |      | + calculateTotal(customer: Customer): float |
|                 |           | - pricePerUnit: float |   |                 |
+----------------+           +----------------+          +-----------------+


Object Diagram
Customer: Alice
+--------------------------+
| name = "Alice"           |
| products = [Product1, Product2] |
+--------------------------+

Product1: Apples
+------------------------------+
| name = "Apples"              |
| quantity = 2.0 (kg)          |
| pricePerUnit = 3.0 ($ per kg)|
+------------------------------+

Product2: Milk
+------------------------------+
| name = "Milk"                |
| quantity = 1.0 (liter)       |
| pricePerUnit = 2.0 ($ per liter) |
+------------------------------+




Sequence Diagram
Customer         BillGenerator
   |                   |
   |--- checkout() --->|
   |                   |
   |                   |--- calculateTotal(customer) --->|
   |                   |                                |
   |                   |<--- totalAmount ----------------|
   |<-- displayBill(totalAmount) -----------------------|