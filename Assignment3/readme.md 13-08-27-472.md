# Assignment 3 – Exception Handling in Java

Is folder mein 7 questions ki compiled `.class` files hain.

| File | Topic |
|---|---|
| `Problem1.class` | Multiple catch blocks (`ArithmeticException`, `NullPointerException`, `ArrayIndexOutOfBoundsException`, `NumberFormatException`) aur `finally` |
| `Problem2.class` | Nested try-catch (array index out of bounds) |
| `Problem3.class` | Calculator with custom exception (`myException1`) for invalid operator |
| `problem4.class` | Marks validation (0–100) with custom exception (`myException`) aur grading |
| `problem5.class` | Bank account deposit/withdraw with custom exceptions (`InvalidAmountException`, `InsufficientBalanceException`, `AccountNotFoundException`) |
| `Problem6.class` | Login system with custom exceptions (invalid username/password, account locked) |
| `Problem7.class` | Exception hierarchy for an order/payment/product system (checked exceptions) |

## Kaise chalayein

Folder ke andar se:

```
java Problem1
```

Problem3, problem4, problem5 aur Problem6 keyboard se input maangte hain.

## Note

- Ye programs custom exception classes (jaise `myException`, `InvalidAmountException`) use karte hain. Unki `.class` files is folder mein nahi hain, to `NoClassDefFoundError` aa sakta hai. Source `.java` files se dobara compile karne par ye ban jaati hain.
- `problem5` aur `Problem7` dono mein `Account` class hai, isliye dono ek hi folder mein compile karne par ek doosre ko overwrite kar dete hain.
