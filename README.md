# shopping-calculator
A console-based Java application that computes the total cost of a purchase, applying a customer discount and a fixed tax rate, and prints an itemized receipt.

---
 
## Author
 
**Mark Droeid Mendoza**
Bachelor of Science in Information Technology
Batangas State University, JPLPC Malvar Campus
 
- Email: [markdroeidmendoza@gmail.com](mailto:markdroeidmendoza@gmail.com)
- GitHub: [@mendoza-mark](https://github.com/mendoza-mark)
---
 
## Table of Contents
 
1. [About This Project](#about-this-project)
2. [Features](#features)
3. [Sample Output](#sample-output)
4. [Project Structure](#project-structure)
5. [Getting Started](#getting-started)
6. [How the Program Works](#how-the-program-works)
7. [Concepts Demonstrated](#concepts-demonstrated)
8. [Notes and Limitations](#notes-and-limitations)
9. [License](#license)
---
 
## About This Project
 
This project was developed as a practice exercise in handling user input and performing step-by-step calculations in Java. It simulates a simple point-of-sale transaction: the program collects the customer and product details, applies a percentage discount, adds sales tax, and prints a receipt showing every amount involved.
 
The tax rate is stored as a named constant (`TAX_RATE`), so it is defined in one place and can be changed without searching through the calculations.
 
This makes the project a useful starting point for understanding:
 
- How to read different data types (`String`, `double`, `int`) with `Scanner`
- How to break a calculation into clear, named steps
- How constants make code easier to read and maintain
- How to present program output in a structured, receipt-style format
---
 
## Features
 
**Customer and Product Input**
 
- Accepts the customer name and product name as text.
- Accepts the product price, quantity, and discount percentage as numbers.
**Automatic Computation**
 
- Computes the subtotal from price and quantity.
- Computes the discount amount from the discount percentage.
- Computes tax on the discounted amount using a fixed rate of **12%**.
- Computes the final amount due.
**Itemized Receipt**
 
- Displays the customer, product, price, quantity, subtotal, discount, tax, and final amount.
- Amounts are labeled in Philippine Peso (PHP).
---
 
## Sample Output
 
```text
  ----- SHOPPING CALCULATOR -----
Enter customer name: Maria Santos
Enter product name: Wireless Mouse
Enter product price: PHP500
Enter quantity: 2
Enter discount (%): 10
 
        ----- RECEIPT -----
Customer: Maria Santos
Product: Wireless Mouse
Price: PHP500.0
Quantity: 2
Subtotal: PHP1000.0
Discount: PHP100.0
Tax: PHP108.0
-------------------------------------
Final Amount: PHP1008.0
```
 
---
 
## Project Structure
 
```text
shopping-calculator/
├── ShopCalc.java   # Complete source code (constant, input, calculations, receipt)
├── README.md       # Project documentation
└── LICENSE         # MIT License (optional separate file)
```
 
---
 
## Getting Started
 
### Requirements
 
- Java Development Kit (JDK) 8 or later
- No external libraries required
To confirm Java is installed, run:
 
```bash
java -version
javac -version
```
 
### Installation
 
Clone the repository:
 
```bash
git clone https://github.com/mendoza-mark/shopping-calculator.git
cd shopping-calculator
```
 
### Compile and Run
 
Compile the source file:
 
```bash
javac ShopCalc.java
```
 
Run the program:
 
```bash
java ShopCalc
```
 
When the program asks for the product price, enter the number only. The `PHP` label is already printed by the program.
 
---
 
## How the Program Works
 
### Program Flow
 
1. The program prints the title header.
2. The user enters the customer name and product name.
3. The user enters the product price, quantity, and discount percentage.
4. The program performs the five calculations listed below, in order.
5. The program prints the receipt.
### Calculation Steps
 
| Step | Variable | Formula |
| --- | --- | --- |
| 1 | `subtotal` | `price * quantity` |
| 2 | `discount_amount` | `subtotal * discount / 100` |
| 3 | `after_discount` | `subtotal - discount_amount` |
| 4 | `tax` | `after_discount * TAX_RATE` |
| 5 | `final_total` | `after_discount + tax` |
 
Tax is applied **after** the discount, so the customer is taxed only on the amount they actually pay for the goods.
 
### Worked Example
 
Using the sample input (price 500, quantity 2, discount 10%):
 
| Step | Variable | Calculation | Result |
| --- | --- | --- | --- |
| 1 | `subtotal` | 500 x 2 | 1000.00 |
| 2 | `discount_amount` | 1000 x 10 / 100 | 100.00 |
| 3 | `after_discount` | 1000 - 100 | 900.00 |
| 4 | `tax` | 900 x 0.12 | 108.00 |
| 5 | `final_total` | 900 + 108 | 1008.00 |
 
### Tax Constant
 
```java
public static final double TAX_RATE = 0.12;
```
 
The `static final` modifiers make `TAX_RATE` a constant: it belongs to the class and its value cannot be changed while the program runs. To use a different tax rate, edit this single line.
 
---
 
## Concepts Demonstrated
 
| Concept | Where It Appears |
| --- | --- |
| Constants (`static final`) | `TAX_RATE` |
| User input with `Scanner` | `nextLine()`, `nextDouble()`, `nextInt()` |
| Multiple data types | `String`, `double`, `int` |
| Arithmetic operators | Subtotal, discount, tax, and total calculations |
| String concatenation | Receipt output lines |
| Code organization with comments | HEADER, INPUT, CALCULATIONS, and RECEIPT sections |
 
---
 
## Notes and Limitations
 
- This is a learning and practice project and is not intended for production use.
- The tax rate is fixed at **12%** in the code.
- The program handles a single product per transaction.
- Input validation is not included. Entering text instead of a number will cause the program to stop with an `InputMismatchException`, and negative values or discounts above 100 are not rejected.
- Money values are stored as `double`, which can occasionally produce long decimal results (for example, `145.79999999999998`) because of how floating-point numbers work. Production systems typically use `BigDecimal` for currency.
- The entire project is contained in a single `.java` file with no third-party dependencies.
---
 
## License
 
This project is licensed under the MIT License. See below for details.
 
```text
MIT License
 
Copyright (c) 2026 Mark Droeid Mendoza
 
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
 
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
 
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
 
