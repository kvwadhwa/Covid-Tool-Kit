// importing packages
package com.example.covidtoolkit
// importing library
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
// creating class
class IntroActivity : AppCompatActivity() {
    // creating function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setting content view
        setContentView(R.layout.activity_introactivity)
        Handler().postDelayed({
            // creating obejct
            val i =  Intent(this, MainActivity::class.java)
            // calling startactivity
            startActivity(i)

        }, 3000)

    }
}