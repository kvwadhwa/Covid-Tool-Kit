// packages
package com.example.covidtoolkit
// importing library
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_quarantine_general_information.*
// creating class
class VaccineInformationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // creating functions
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccine_information)
        textViewData.movementMethod = LinkMovementMethod()
        textViewData.text = Html.fromHtml("<h3>Provincial and territorial COVID-19 vaccination webpages</h3>\n" +
                "        <ul>\n" +
                "            <li><a href=\"https://www2.gov.bc.ca/gov/content/safety/emergency-preparedness-response-recovery/covid-19-provincial-support/vaccines?\" rel=\"external\">British Columbia</a></li>\n" +
                "            <li><a href=\"https://www.alberta.ca/covid19-vaccine.aspx?\" rel=\"external\">Alberta</a></li>\n" +
                "            <li><a href=\"https://www.saskatchewan.ca/government/health-care-administration-and-provider-resources/treatment-procedures-and-guidelines/emerging-public-health-issues/2019-novel-coronavirus/covid-19-vaccine?\" rel=\"external\">Saskatchewan</a></li>\n" +
                "            <li><a href=\"https://www.gov.mb.ca/covid19/vaccine/index.html?\" rel=\"external\">Manitoba</a></li>\n" +
                "            <li><a href=\"https://covid-19.ontario.ca/covid-19-vaccines-ontario?\" rel=\"external\">Ontario</a></li>\n" +
                "            <li><a href=\"https://www.quebec.ca/en/health/health-issues/a-z/2019-coronavirus/progress-of-the-covid-19-vaccination/?\" rel=\"external\">Quebec</a></li>\n" +
                "            <li><a href=\"https://www.gov.nl.ca/covid-19/vaccine/?\" rel=\"external\">Newfoundland and Labrador</a></li>\n" +
                "            <li><a href=\"https://www2.gnb.ca/content/gnb/en/corporate/promo/covid-19.html\" rel=\"external\">New Brunswick</a></li>\n" +
                "            <li><a href=\"https://novascotia.ca/coronavirus/symptoms-and-testing/?%23vaccine=%23vaccine#vaccine\" rel=\"external\">Nova Scotia</a></li>\n" +
                "            <li><a href=\"https://www.princeedwardisland.ca/en/topic/covid-19-vaccines\" rel=\"external\">Prince Edward Island</a></li>\n" +
                "            <li><a href=\"https://yukon.ca/en/covid-19-vaccine\" rel=\"external\">Yukon</a></li>\n" +
                "            <li><a href=\"https://www.gov.nt.ca/covid-19/en\" rel=\"external\">Northwest Territories</a></li>\n" +
                "            <li><a href=\"https://www.gov.nu.ca/health/information/covid-19-vaccination\" rel=\"external\">Nunavut</a></li>\n" +
                "        </ul>")
    }
}