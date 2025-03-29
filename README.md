# Vector Utilities

A Java utility class for performing vector operations with proper error handling.

## Features

- **Dot Product Calculation**:
  - Computes the scalar (dot) product of two vectors
  - Validates input vectors (null checks and length matching)
  - Returns `Integer` to allow for error case (null return)

## Class Structure

### VectorUtils Class

```java
public class VectorUtils {
    /**
     * Computes the dot product of two vectors
     * @param a First vector (must not be null)
     * @param b Second vector (must not be null)
     * @return The dot product, or null if vectors are invalid
     */
    public static Integer dotProduct(int[] a, int[] b) {
        // Implementation
    }
}
```


## Usage Example
```java
public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{6, -4, 2, -8, 6};
        
        Integer result = VectorUtils.dotProduct(a, b);
        if (result != null) {
            System.out.println("Dot product: " + result);
        } else {
            System.out.println("Invalid vectors provided");
        }
    }
}
```

## Expected Output
For the given example vectors:
```java
Dot product: 2
```

## Error Handling
The method handles these error cases:
- Either vector is `null`
- Vectors have different lengths  
- Empty vectors (length 0 is considered valid)

In error cases:
- Prints an error message to console
- Returns `null`

## Mathematical Background
The dot product is calculated as:
```
a·b = Σ(a_i * b_i) for i from 0 to n-1
```
where n is the length of the vectors.

## Requirements
- Java 8 or higher
- No external dependencies

## How to Run
1. Compile both files:
```bash
javac VectorUtils.java Main.java
```
1. Run the Main class:
```bash
java Main
```

## Possible Extensions
1. **Vector operations**:
   - Addition/subtraction
   - Cross product (3D)
   - Magnitude/normalization
2. **Matrix operations**:
   - Multiplication
   - Determinants
   - Transposition
3. **Precision**:
   - Double/float support
   - BigDecimal for exact math
4. **Geometry**:
   - Angle between vectors
   - Projections
5. **Performance**:
   - SIMD optimizations
   - Parallel processing
6. **Visualization**:
   - Plotting vectors
   - 3D rendering
