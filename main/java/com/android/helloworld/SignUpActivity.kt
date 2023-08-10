package com.android.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_signup)

        val et_name = findViewById<EditText>(R.id.et_name)
        val et_newid = findViewById<EditText>(R.id.et_newid)
        val et_newpw = findViewById<EditText>(R.id.et_newpw)

        val btn_signUp = findViewById<Button>(R.id.btn_signup)

        btn_signUp.setOnClickListener{
            if(et_name.text.toString().trim().isEmpty()||et_newid.text.toString().trim().isEmpty()||et_newpw.text.toString().trim().isEmpty())
                Toast.makeText(this, getString(R.string.toast_msg_noinput), Toast.LENGTH_SHORT).show()
                return@setOnClickListener
        }
        finish()

        val intent = Intent(this, SignInActivity::class.java).apply {
            putExtra("id", et_newid.text.toString())
            putExtra("pw", et_newpw.text.toString())
        }

        setResult(RESULT_OK, intent)

        if (!isFinishing) finish()
    }
}