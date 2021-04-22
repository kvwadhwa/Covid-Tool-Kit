// importing packages
package com.example.covidtoolkit
// importing library
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_quarantine_general_information.*
// creating class
class ReqionalQuarantineInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reqional_quarantine_information)
        // entering html code for displaying data for regional quaratine
        textViewData.movementMethod = ScrollingMovementMethod()
        textViewData.text = Html.fromHtml(" <h2 id=\"pha\">Public health authorities</h2>" +
                "<h2>British Columbia</h2>Phone: 811<br>Website: www.bccdc.ca/covid19<hr>\n" +
                "<h2>Alberta</h2>Phone: 811<br>Website: www.myhealth.alberta.ca<hr>\n" +
                "<h2>Saskatchewan</h2>Phone: 811<br>Website: www.saskhealthauthority.ca<hr>\n" +
                "<h2>Manitoba</h2>Phone: 1-866-626-4862<br>Website: https://manitoba.ca/covid19/restartmb/prs/orders/index.html#current<hr>\n" +
                "<h2>Ontario</h2>Phone: 1-866-797-0000<br>Website: www.ontario.ca/coronavirus<hr>\n" +
                "<h2>Quebec</h2>Phone: 1-877-644-4545<br>Website: www.quebec.ca/en/coronavirus<hr>\n" +
                "<h2>New Brunswick</h2>Phone: 811<br>Website: www.gnb.ca/publichealth<hr>\n" +
                "<h2>Nova Scotia</h2>Phone: 811<br>Website: www.novascotia.ca/coronavirus/<hr>\n" +
                "<h2>Prince Edward Island</h2>Phone: 811<br>Website: www.princeedwardisland.ca/covid19<hr>\n" +
                "<h2>Newfoundland and Labrador</h2>Phone: 811 or 1-888-709-2929<br>Website: www.gov.nl.ca/covid-19<hr>\n" +
                "<h2>Nunavut</h2>Phone: 1-867-975-5772<br>Website: www.gov.nu.ca/health<hr>\n" +
                "<h2>Northwest Territories</h2>Phone: 811<br>Website: www.gov.nt.ca/covid-19<hr>\n" +
                "<h2>Yukon</h2>Phone: 811<br>Website: www.yukon.ca/covid-19<hr>")
    }
}