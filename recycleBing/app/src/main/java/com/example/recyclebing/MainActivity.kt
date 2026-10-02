package com.example.recyclebing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewRequests: RecyclerView
    private lateinit var adapter: FriendRequestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
        setupRecyclerView()
    }

    private fun initViews() {
        recyclerViewRequests = findViewById(R.id.recyclerViewRequests)
    }

    private fun setupRecyclerView() {
        // Using an Array (arrayOf) with 20 random friend requests for vertical scrolling (UI only)
        val friendArray = arrayOf(
            FriendRequest(1, "Aarav Sharma", 5),
            FriendRequest(2, "Ananya Roy", 12),
            FriendRequest(3, "Rohan Gupta", 3),
            FriendRequest(4, "Ishita Sen", 8),
            FriendRequest(5, "Vikramaditya Das", 15),
            FriendRequest(6, "Meera Mukherjee", 2),
            FriendRequest(7, "Kabir Bose", 9),
            FriendRequest(8, "Tanvi Verma", 11),
            FriendRequest(9, "Aditya Ganguly", 7),
            FriendRequest(10, "Riya Banerjee", 14),
            FriendRequest(11, "Devansh Chatterji", 4),
            FriendRequest(12, "Sneha Chakraborty", 10),
            FriendRequest(13, "Ayush Nandi", 6),
            FriendRequest(14, "Puja Dutta", 18),
            FriendRequest(15, "Abhinav Ghosh", 1),
            FriendRequest(16, "Kavya Patel", 13),
            FriendRequest(17, "Pritam Roy", 5),
            FriendRequest(18, "Diya Mehta", 16),
            FriendRequest(19, "Rahul Choudhury", 20),
            FriendRequest(20, "Trisha Sarkar", 8)
        )

        adapter = FriendRequestAdapter(friendArray)

        recyclerViewRequests.layoutManager = LinearLayoutManager(this)
        recyclerViewRequests.adapter = adapter
    }
}
