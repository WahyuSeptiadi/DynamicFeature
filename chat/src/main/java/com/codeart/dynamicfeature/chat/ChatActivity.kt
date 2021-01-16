package com.codeart.dynamicfeature.chat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.codeart.core.SessionManager
import com.codeart.core.UserRepository

class ChatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat)

        val tvChat = findViewById<TextView>(R.id.tv_chat)
        val sesi = SessionManager(this)
        val userRepository = UserRepository.getInstance(sesi)
        "Hello ${userRepository.getUser()}! \n Welcome to Chat Feature".also { tvChat.text = it }

    }
}