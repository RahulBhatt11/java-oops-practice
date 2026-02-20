# Constructors in Java

A **constructor** is a special method in Java that is automatically called when an object of a class is created.

Its main purpose is to **initialize object attributes (variables)** at the time of object creation.

---

## ✅ Key Characteristics

- Constructor name must be the **same as the class name**
- It does **not have a return type** (not even `void`)
- It is executed automatically when an object is created using `new`
- Used to assign initial values to object attributes

---

## ✅ Syntax

```java
class ClassName {

    ClassName() {
        // initialization code
    }
}