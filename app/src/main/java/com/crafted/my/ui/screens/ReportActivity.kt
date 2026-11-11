package com.crafted.my.ui.screens

// Stand‑in activity for placeholder purpose 
class ReportActivity : android.app.Activity() {
    override fun onCreate(savedInstanceState: android.os.Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(
            android.widget.TextView(this).apply{
                text = "ReportActivity"
                textSize = 20f
                setPadding (48,  ... ...
