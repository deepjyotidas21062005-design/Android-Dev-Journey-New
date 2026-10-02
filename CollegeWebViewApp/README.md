# CollegeWebViewApp — Task 2

A native Android application that embeds a **WebView** to load and navigate the official **Panskura Banamali College** portal directly within the app — no external browser required.

---

## Key Features

- **Embedded WebView:** Loads web content inside the app using `android.webkit.WebView`.
- **In-App Navigation:** Overrides default URL loading so all links open within the app.
- **Back Button Support:** Hardware back button navigates through the browser history stack.
- **Internet Permission:** Properly configured with `INTERNET` and `ACCESS_NETWORK_STATE` permissions.
- **Custom Header UI:** Styled header bar with badge tags and action buttons.

---

## Tech Stack

| Category | Details |
| :--- | :--- |
| Language | Kotlin |
| Component | WebView, WebViewClient |
| Permissions | INTERNET, ACCESS_NETWORK_STATE |
| Design | Material Design, Custom Vector Drawables |
| IDE | Android Studio |

---

## Project Structure

```
CollegeWebViewApp/
├── app/
│   └── src/main/
│       ├── java/com/example/mywebapp/
│       │   └── MainActivity.kt        # WebView setup & back navigation logic
│       ├── AndroidManifest.xml        # Internet permission declaration
│       └── res/
│           ├── layout/
│           │   └── activity_main.xml  # WebView + header bar layout
│           └── drawable/              # Gradient backgrounds & badge styling
└── build.gradle.kts
```

---

## Getting Started

1. Open **Android Studio**.
2. Click **Open** and select the `CollegeWebViewApp` folder.
3. Make sure the emulator or device has an active internet connection.
4. Press **Run** (`Shift + F10`) to build and launch the app.

---

**Status:** ✅ Completed — Task 2
