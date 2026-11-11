package com.crafted.myapp.ui.screens

// Stand-in created automatically: the manifest names this class but the project had no code for it.
class NoticeActivity : android.app.Activity() {
    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(
            android.widget.TextView(this).apply {
                text = "NoticeActivity"
                textSize = 20f
                setPadding(48, 96, 48, 48)
            },
        )
    }
}
