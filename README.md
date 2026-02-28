# Class without generics(Generics Introduction)

Educational Java project to understand the need for **generics** by first implementing a non-generic version.

## Objective

- Create a simple class that stores three elements of the **same type**
- Allow passing arguments in any order to the constructor
- Compare this rigid approach with what generics will offer later
- Serve as a baseline to highlight the limitations solved by generics

## Statement Summary

Create a class `NoGenericMethods` that:

- Stores three arguments of the **same type** (any type, but all three identical)
- Has a constructor that accepts the three values (in any order)
- Provides getter methods: `getElement1()`, `getElement2()`, `getElement3()`

Demonstrate that the constructor accepts the arguments regardless of their order.

## Project Structure
```text 
genericsWithDiverseParameters/
├── pom.xml
└── src/
├── main/java/
│   └── NoGenericMethods.java
│   └── Main.java
└── test/java/
└── NoGenericMethodsTest.java           
```
## How to Run

```bash
# Maven
mvn test
```

### Example Usage & Output

```Java
NoGenericMethods<String> strings = new NoGenericMethods<>("A", "B", "C");
System.out.println(strings.getElement1());  // A
System.out.println(strings.getElement2());  // B
System.out.println(strings.getElement3());  // C

NoGenericMethods<Integer> numbers = new NoGenericMethods<>(10, 20, 30);
// Works fine, but cannot mix types (e.g., String + Integer)
```