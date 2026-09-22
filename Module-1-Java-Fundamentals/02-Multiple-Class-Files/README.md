# Multiple Classes in a Single Java File

## Overview

This topic demonstrates how Java handles **multiple classes defined inside a single `.java` source file**.

The `TwoClassFiles.java` program included in this directory is a practical example of this concept.

The important idea is:

> One `.java` source file can contain multiple classes, and the Java compiler can generate a separate `.class` file for each top-level class.

---

# 1. Can One Java File Contain Multiple Classes?

Yes.

A single `.java` file can contain multiple **top-level classes**.

For example:

```java
class Account {
}

public class TwoClassFiles {
    public static void main(String[] args) {
        System.out.println("Hello Java");
    }
}