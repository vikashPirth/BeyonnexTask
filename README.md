
# Anagram Checker and Finder

## Overview

This project is a simple interactive program written in Kotlin that provides two main features:
1. **Check if two texts are anagrams**.
2. **Provide all anagrams for a given string from previous inputs**.

## Features

1. **Anagram Check**:
    - Takes two strings as input.
    - Normalizes and cleans the strings (removing whitespace, converting to lowercase).
    - Sorts the characters and compares them to check if the strings are anagrams.

2. **Anagram Finder**:
    - After checking strings with the anagram check feature, the program can return a list of all anagrams of a given string from previous inputs.

## Tech Stack

- **Language**: Kotlin
- **Tools**: Standard Kotlin development environment (e.g., IntelliJ IDEA)

## Dependencies

This project uses the following dependencies for testing:

```gradle
dependencies {
    // JUnit 5 for testing
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}
```

## Important Files

- **Main.kt**: This is the main entry point of the application where the CLI interface is handled.
- **AnagramHelperTest.kt**: Contains the unit tests for the `AnagramHelper` class using JUnit 5.
- **build.gradle**: The Gradle build script that manages project dependencies, compilation, and testing.
- **README.md**: Project documentation providing an overview, setup instructions, and usage examples.


## How to Run the Program

### Prerequisites

- **Kotlin**: Ensure you have Kotlin
- **IDE**: Use any Kotlin-compatible IDE.

### Steps

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/vikashPirth/BeyonnexTask.git
   cd Anagram


