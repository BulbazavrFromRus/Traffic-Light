package com.example.trafficlights

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val rootLayout: ConstraintLayout = findViewById(R.id.layout_root);

        val textView: TextView = findViewById(R.id.textView);
        val redButton: Button = findViewById(R.id.button_red);
        val yellowButton: Button = findViewById(R.id.button_yellow);
        val greenButton: Button = findViewById(R.id.button_green);

        redButton.setOnClickListener{
            textView.text = "Красный";
            rootLayout.setBackgroundColor(resources.getColor(R.color.redColor))
        }

        yellowButton.setOnClickListener{
            textView.text = "Жёлтый";
            rootLayout.setBackgroundColor(resources.getColor(R.color.yellowColor));
        }

        greenButton.setOnClickListener {
            textView.text = "Зелёный"
            rootLayout.setBackgroundColor(resources.getColor(R.color.greenColor));
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout_root)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}