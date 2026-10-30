package com.example.mobilenusaindotech

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mobilenusaindotech.databinding.ActivityDaftarPersetujuanSupervisorBinding

class DaftarPersetujuanActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDaftarPersetujuanSupervisorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDaftarPersetujuanSupervisorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.mainDaftarPersetujuan) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, 0)
            insets
        }

        binding.btnBack.setOnClickListener {
            finish()
        }

        binding.cardItem1.setOnClickListener {
            val intent = android.content.Intent(this, DetailPersetujuanActivity::class.java)
            startActivity(intent)
        }
    }
}
