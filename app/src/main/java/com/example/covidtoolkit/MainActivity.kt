
// importing packages
package com.example.covidtoolkit
// importing library
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
// class main activity
class MainActivity : AppCompatActivity() {
    // creating fun on create
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // calling set on click listener to function that button
        buttonCovidScreening.setOnClickListener {
            // creating object for val intent and passing covidscreening activity as paramater
            val intent = Intent(this, CovidScreeningActivity::class.java)
            startActivity(intent)
        }
        // calling set on click listener to function that button
        buttonCovidQuaratineInfo.setOnClickListener {
            // creating object for val intent and passing quarantine information  as paramater
            val intent = Intent(this, QuarantineInformation::class.java)
            startActivity(intent)
        }
        // calling set on click listener to function that button
        buttonVaccineElligiblity.setOnClickListener {
            // creating object for val intent and passing vaccine information activity as paramater
            val intent = Intent(this, VaccineInformationActivity::class.java)
            startActivity(intent)
        }
    }
}