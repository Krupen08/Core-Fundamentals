# Java Compilation & Execution Workflow (`JDK_version.java`)

A clear visual guide and reference documenting how Java source code travels from human-readable text to native machine execution via the Java Virtual Machine (JVM).

---

## 📋 Overview

This repository/document illustrates the core lifecycle of a Java program. Java achieves its platform independence ("Write Once, Run Anywhere") through a two-step process: **Compilation** (into bytecode) and **Interpretation/Just-In-Time (JIT) Compilation** (into machine-specific native code).

---

## 🔄 Execution Workflow Diagram

```text
 ┌─────────────────┐
 │ JDK_version.java│  <- You write this (plain text, human readable)
 └────────┬────────┘
          │
          │  javac (compiler) - checks syntax, converts to bytecode
          ▼
 ┌─────────────────┐
 │ JDK_version.class│ <- Bytecode (binary, machine-independent)
 └────────┬────────┘
          │
          │  java (launches JVM)
          ▼
 ┌─────────────────────────────────────────────────────────────┐
 │                         JVM                       │
 │                                                             │
 │   ┌───────────────┐                                         │
 │   │ Class Loader  │  <- loads .class into JVM     │
 │   └───────┬───────┘                                         │
 │           ▼                                                 │
 │   ┌───────────────┐                                         │
 │   │   Bytecode    │  <- checks safety             │
 │   │   Verifier    │                                         │
 │   └───────┬───────┘                                         │
 │           ▼                                                 │
 │   ┌───────────────────────────────────┐                     │
 │   │        Execution Engine           │                     │
 │   │       (Interpreter + JIT)                     │
 │   └───────────────────┬───────────────┘                     │
 └───────────────────────┼─────────────────────────────────────┘
                         │
                         ▼
 ┌─────────────────────────────────┐
 │       Native Machine Code       │  <- CPU-specific, finally executes
 │       (Windows/Mac/Linux)       │     (Runs on Windows/Mac/Linux)
 └─────────────────────────────────┘
