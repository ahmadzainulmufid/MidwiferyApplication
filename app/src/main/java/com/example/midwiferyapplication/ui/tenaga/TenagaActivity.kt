package com.example.midwiferyapplication.ui.tenaga

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.midwiferyapplication.R
import android.widget.ImageButton

class TenagaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenaga)
        // Find the back button by its ID
        val btnBack: ImageButton = findViewById(R.id.btn_back)

        // Set an OnClickListener to handle the back button press
        btnBack.setOnClickListener {
            // Handle the back button press
            onBackPressed() // This will navigate back to the previous activity
        }
    }
}