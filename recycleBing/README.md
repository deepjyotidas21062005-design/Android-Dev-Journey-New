# recycleBing — Task 4

A native Android application that renders a dynamic **Friend Request list** using `RecyclerView` and `CardView`, implementing the Adapter & ViewHolder pattern with Kotlin data classes.

---

## Key Features

- **RecyclerView & CardView:** Efficient, scrollable list rendering with elevated card-style items.
- **Custom Adapter Pattern:** `FriendRequestAdapter` with `ViewHolder` for clean, reusable item rendering.
- **Kotlin Data Model:** Simple `FriendRequest(id, name, mutualFriends)` data class.
- **Interactive Buttons:** Each card includes **Confirm** and **Delete** action buttons.
- **20 Sample Items:** Pre-populated list with realistic names and mutual friend counts.

---

## Friend Request Data

| # | Name | Mutual Friends |
| :---: | :--- | :---: |
| 1 | Aarav Sharma | 5 |
| 2 | Ananya Roy | 12 |
| 3 | Rohan Gupta | 3 |
| 4 | Ishita Sen | 8 |
| 5 | Vikramaditya Das | 15 |
| 6 | Meera Mukherjee | 2 |
| 7 | Kabir Bose | 9 |
| 8 | Tanvi Verma | 11 |
| 9 | Aditya Ganguly | 7 |
| 10 | Riya Banerjee | 14 |
| 11 | Devansh Chatterji | 4 |
| 12 | Sneha Chakraborty | 10 |
| 13 | Ayush Nandi | 6 |
| 14 | Puja Dutta | 18 |
| 15 | Abhinav Ghosh | 1 |
| 16 | Kavya Patel | 13 |
| 17 | Pritam Roy | 5 |
| 18 | Diya Mehta | 16 |
| 19 | Rahul Choudhury | 20 |
| 20 | Trisha Sarkar | 8 |

---

## Tech Stack

| Category | Details |
| :--- | :--- |
| Language | Kotlin |
| UI Components | RecyclerView, CardView, LinearLayout, Button, TextView |
| Architecture | Adapter & ViewHolder Pattern |
| Design | Material Design 3 |
| IDE | Android Studio |

---

## Project Structure

```
recycleBing/
├── app/
│   └── src/main/
│       ├── java/com/example/recyclebing/
│       │   ├── FriendRequest.kt           # Data model (data class)
│       │   ├── FriendRequestAdapter.kt    # RecyclerView adapter & ViewHolder
│       │   └── MainActivity.kt            # Data setup & RecyclerView binding
│       └── res/
│           └── layout/
│               ├── activity_main.xml      # Root RecyclerView layout
│               └── item_friend_request.xml # Individual card item layout
└── build.gradle.kts
```

---

## Getting Started

1. Open **Android Studio**.
2. Click **Open** and select the `recycleBing` folder.
3. Let Gradle sync automatically.
4. Press **Run** (`Shift + F10`) to launch on an emulator or physical device.

---

**Status:** ✅ Completed — Task 4
