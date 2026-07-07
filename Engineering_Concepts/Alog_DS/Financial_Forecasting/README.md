# Exercise 7: Financial Forecasting

## Scenario

You are developing a financial forecasting tool that predicts future values based on past data.

---

## 1. Understand Recursive Algorithms

### What is Recursion?

Recursion is a programming technique in which a method calls itself to solve a smaller version of the same problem until a base condition is reached.

### Components of Recursion

1. **Base Case** – Stops the recursive calls.
2. **Recursive Case** – Calls the same function with smaller input.

### Advantages of Recursion

- Simplifies complex problems.
- Makes code shorter and easier to understand.
- Useful for divide-and-conquer algorithms.

### Disadvantages of Recursion

- Uses extra memory for function calls.
- Can cause stack overflow for large inputs.
- May perform redundant computations.

---

## 2. Setup

### Project Structure

```text
FinancialForecastingSystem
│
└── FinancialForecast.java
```

---

## 3. Implementation

### Future Value Formula

```text
Future Value = Previous Value × (1 + Growth Rate)
```

### FinancialForecast.java

```java
public class FinancialForecast {

    static double futureValue(double amount,
                              double growthRate,
                              int years) {

        // Base Case
        if (years == 0) {
            return amount;
        }

        // Recursive Case
        return futureValue(
                amount,
                growthRate,
                years - 1
        ) * (1 + growthRate);
    }

    public static void main(String args[]) {

        double initialAmount = 10000;
        double growthRate = 0.10;
        int years = 5;

        double result = futureValue(
                initialAmount,
                growthRate,
                years
        );

        System.out.println(
                "Future Value after "
                + years +
                " years = ₹"
                + result
        );
    }
}
```

### Sample Output

```text
Future Value after 5 years = ₹16105.1
```

---

## 4. Analysis

### Time Complexity

The recursive function makes one recursive call for each year.

```text
T(n) = T(n-1) + O(1)
```

**Time Complexity:** `O(n)`

### Space Complexity

Each recursive call is stored in the call stack.

**Space Complexity:** `O(n)`

---

## Optimizations

### 1. Memoization

Store previously computed values to avoid repeated calculations.

```java
HashMap<Integer, Double> memo =
        new HashMap<>();
```

### 2. Iterative Approach

```java
double amount = 10000;

for (int i = 1; i <= years; i++) {
    amount *= (1 + growthRate);
}
```

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

### 3. Mathematical Formula

```text
FV = P × (1 + r)^n
```

Where:

- `P` = Principal Amount
- `r` = Growth Rate
- `n` = Number of Years

Java implementation:

```java
double futureValue =
        principal * Math.pow(1 + rate, years);
```

Time Complexity: `O(1)`

---

## Conclusion

The recursive approach provides a simple and elegant solution for financial forecasting with **O(n)** time and **O(n)** space complexity. However, iterative methods or the direct mathematical formula are more efficient for large inputs because they reduce memory usage and computation time.