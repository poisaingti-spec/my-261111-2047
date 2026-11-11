package com.crafted.my.ui.screens

// Stand‑in activity for placeholder purposes.
class NoticeDetailActivity : android.app.Activity() {
    override fun onCreate(savedInstanceState: android.os.Bundle) {
        super.onCreate(savedInstanceState)
        setContentView(
            android.widget.TextView(this).apply {
                text = "NoticeDetailActivity"
                textSize = 20f
                setPadding(48, 96, 48, 48)
            }
        )
    }
}
