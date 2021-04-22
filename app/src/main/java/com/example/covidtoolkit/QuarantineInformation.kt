// library
package com.example.covidtoolkit
// importing library
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quarantine_information.*
// creating class quarantine information
class QuarantineInformation : AppCompatActivity() {
    // creating function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quarantine_information)
        // calling set on click listener on button quarantine infromation to make it function
        buttonQuarantineGeneralInformation.setOnClickListener {
             // creating object for val intent and passing quarantine information as parameter
            val intent = Intent(this, QuarantineGeneralInformation::class.java)
            startActivity(intent)
        }
        // calling set on click listener on button HowToQuarantine to make it function
        buttonHowToQuarantine.setOnClickListener {
            // creating object for val intent and passing How to quarantine as parameter
            val intent = Intent(this, HowToQuarantineActivity::class.java)
            startActivity(intent)
        }
        // calling set on click listener on button ReqionalQuarantineInformation to make it function
        buttonRegionalQuarantine.setOnClickListener {
            // creating object for val intent and passing regional quarantine information as parameter
            val intent = Intent(this, ReqionalQuarantineInformationActivity::class.java)
            startActivity(intent)
        }
    }
}