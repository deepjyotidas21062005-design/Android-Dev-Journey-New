# SimpleCalculator — Task 1

A modern, native Android Calculator application built with **Kotlin** and **XML Layouts**.
This task covers basic UI construction, button event handling, and arithmetic logic in Android.

---

## Key Features

- **Arithmetic Operations:** Supports Addition (`+`), Subtraction (`-`), Multiplication (`×`), and Division (`÷`).
- **Clear & Backspace:** Instant clear (`C`) and single-character delete for easy corrections.
- **Input Validation:** Prevents malformed expressions and handles division-by-zero gracefully.
- **Intuitive Grid Layout:** Distinct styling separates digit buttons from operator buttons.

---

## Tech Stack

| Category | Details |
| :--- | :--- |
| Language | Kotlin |
| UI Layout | XML, ConstraintLayout |
| Design | Material Design 3 |
| IDE | Android Studio |

---

## Project Structure

```
SimpleCalculator/
├── app/
│   └── src/main/
│       ├── java/com/example/simplecalculator/
│       │   └── MainActivity.kt        # Calculation logic & button event handling
│       └── res/
│           ├── layout/
│           │   └── activity_main.xml  # Button grid & display layout
│           └── values/
│               ├── colors.xml         # Color palette
│               └── strings.xml        # Text resources
└── build.gradle.kts
```

---

## Getting Started

1. Open **Android Studio**.
2. Click **Open** and select the `SimpleCalculator` folder.
3. Let Gradle sync automatically.
4. Press **Run** (`Shift + F10`) to launch on an emulator or physical device.

---

**Status:** ✅ Completed — Task 1
