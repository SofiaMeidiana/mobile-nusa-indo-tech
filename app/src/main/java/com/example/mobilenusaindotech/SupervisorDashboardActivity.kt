package com.example.mobilenusaindotech

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobilenusaindotech.databinding.ActivitySupervisorDashboardBinding

class SupervisorDashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySupervisorDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySupervisorDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.mainSupervisorDashboard) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.btnDetailPersetujuan.setOnClickListener {
            val intent = Intent(this, DaftarPersetujuanActivity::class.java)
            startActivity(intent)
        }

        binding.cardCekProgres.setOnClickListener {
            val intent = Intent(this, CekProgresTugasActivity::class.java)
            startActivity(intent)
        }
    }
}
