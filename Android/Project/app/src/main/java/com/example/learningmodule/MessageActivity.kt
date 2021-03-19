package com.example.learningmodule

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        // TODO: Implement onCreate
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                this.finish()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    companion object {
        private const val KEY_SEND_MESSAGE = "key_send_message"
        fun newIntent(context: Context, message: String): Intent {
            return Intent(context, MessageActivity::class.java).apply {
                putExtra(KEY_SEND_MESSAGE, message)
            }
        }
    }
}