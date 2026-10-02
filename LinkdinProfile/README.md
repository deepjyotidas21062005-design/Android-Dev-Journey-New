# LinkdinProfile — Task 5

A native Android application that replicates a **LinkedIn Profile Interface**, built with **Kotlin**, **XML Layouts**, **ConstraintLayout**, and **Material Design 3** components.
This task focuses on building complex, multi-section UI layouts with cards, badges, and scrollable content.

---

## Key Features

- **Profile Header & Cover:** Displays a banner image, profile photo, name, title, and organization.
- **Action Buttons:** Quick-access buttons — "Open To", "Add Section", "Enhance Profile", and "Resources".
- **Analytics Section:** Interactive cards showing profile views, post impressions, and search appearances.
- **About & Experience Sections:** Modular card-based layout for bio, work history, and skills.
- **Edge-to-Edge UI:** Fully compatible with modern Android window insets and status bar handling.

---

## Tech Stack

| Category | Details |
| :--- | :--- |
| Language | Kotlin |
| UI Layout | XML, ConstraintLayout, CardView, ScrollView |
| Design | Material Design 3 |
| Build | Gradle (Kotlin DSL) |
| Minimum SDK | API 24+ (Android 7.0) |
| IDE | Android Studio |

---

## Project Structure

```
LinkdinProfile/
├── app/
│   └── src/main/
│       ├── java/com/example/linkdinprofile/
│       │   └── MainActivity.kt        # UI setup & window insets handling
│       ├── AndroidManifest.xml
│       └── res/
│           ├── drawable/              # Profile image, cover image, badge assets
│           ├── layout/
│           │   └── activity_main.xml  # Full profile layout (ScrollView + sections)
│           └── values/
│               ├── colors.xml
│               ├── strings.xml
│               └── themes.xml
├── build.gradle.kts
└── settings.gradle.kts
```

---

## Getting Started

1. Open **Android Studio**.
2. Click **Open** and select the `LinkdinProfile` folder.
3. Let Gradle sync automatically.
4. Press **Run** (`Shift + F10`) to launch on an emulator or physical device.

---

**Status:** ✅ Completed — Task 5
