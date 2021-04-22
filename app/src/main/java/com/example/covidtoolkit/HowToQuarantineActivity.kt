// importing packages
package com.example.covidtoolkit
// importing library
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.ScrollingMovementMethod
import kotlinx.android.synthetic.main.activity_quarantine_general_information.*
// creating class how to quarantine
class HowToQuarantineActivity : AppCompatActivity() {
    // creating function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_to_quarantine)
        textViewData.movementMethod = ScrollingMovementMethod()
        // entering data html data to dsiplay and update the information
        textViewData.text = Html.fromHtml(" <h2>Referrals to designated quarantine facilities</h2>\n" +
                "    <p>You must follow the directions of a quarantine officer and enter a quarantine facility or other suitable place if:</p>\n" +
                "    <ul>\n" +
                "      <li>you do not take a test when required</li>\n" +
                "      <li>you do not have a suitable quarantine plan</li>\n" +
                "      <li>you show signs and symptoms of COVID-19 while at&nbsp;the&nbsp;government-authorized accommodation</li>\n" +
                "      <li>your on-arrival test is positive for COVID-19</li>\n" +
                "    </ul>\n" +
                "    <p>You must have a suitable place to quarantine where you:</p>\n" +
                "    <ul>\n" +
                "      <li><strong>can stay for 14 days</strong><strong> </strong>or possibly longer</li>\n" +
                "      <li><strong>will not have</strong> contact with people who:</li>\n" +
                "      <ul>\n" +
                "        <li>are 65 years or older</li>\n" +
                "        <li>have underlying medical conditions</li>\n" +
                "        <li>have compromised immune systems</li>\n" +
                "        <li>work or assist in a facility, home or workplace that includes at-risk populations, including:</li>\n" +
                "        <ul>\n" +
                "          <li>nurses, doctors, other healthcare professionals, personal support workers, social workers</li>\n" +
                "          <li>first responders, such as paramedics</li>\n" +
                "          <li>cleaning and maintenance staff, receptionists and administrative staff, food services staff, volunteers, essential visitors to those living in long-term care facilities</li>\n" +
                "        </ul>\n" +
                "      </ul>\n" +
                "      <li><strong>can avoid</strong> contact with others who did not travel with you</li>\n" +
                "      <li><strong>can have</strong> a separate bedroom from others who did not travel with you</li>\n" +
                "      <li><strong>have access</strong> to the necessities of life, including water, food, medication and heat without leaving quarantine</li>\n" +
                "      <li><strong>will not stay</strong> in group living environment.</li>\n" +
                "      <li>Some examples of group living environments include:\n" +
                "        <ul>\n" +
                "          <li>a shelter, group home, group residence, hostels, industrial camps, construction trailers or other group setting</li>\n" +
                "          <li>a student residence (unless you've received prior authorization)</li>\n" +
                "          <li>a small apartment you share with others</li>\n" +
                "          <li>a shared household with a large family or families or many people</li>\n" +
                "          <li>shared living spaces with housemates who haven't travelled with you that you cannot avoid interacting with</li>\n" +
                "        </ul>\n" +
                "      </li>\n" +
                "    </ul>\n" +
                "    <h2>While in quarantine</h2>\n" +
                "    <ul>\n" +
                "      <li><strong>respond</strong> to calls or visits from screening officers or law enforcement.&nbsp; The call will be from GOV-GOUV Canada or 1-888-336-7735 on your call display. Screening officer and law enforcement will identify themselves, must show their identification, and will ask for you by name.</li>\n" +
                "      <li><strong>do not</strong> leave your place of quarantine unless it is for a life threatening emergency, an essential medical service or treatment, to obtain a COVID-19 molecular test, or it is pre-authorized by a quarantine officer</li>\n" +
                "      <li><strong>use only</strong> private outdoor spaces (i.e. balcony)</li>\n" +
                "      <li><strong>undergo</strong> any health assessments that the quarantine officer requires</li>\n" +
                "      <li><strong>do not</strong> have any visits from family, friends, or other guests; inside or outside.&nbsp; Food, groceries, or other necessities, should be left at your door for contactless delivery.</li>\n" +
                "      <li><strong>do not</strong> use shared spaces such as lobbies, courtyards, restaurants, gyms or pools if you are staying in a condo, apartment building, or hotel.</li>\n" +
                "    </ul>\n" +
                "    <h2>You must monitor your health for 14 days</h2>\n" +
                "    <p><strong>The following symptoms are associated with COVID-19:</strong></p>\n" +
                "    <ul>\n" +
                "      <li>new or worsening cough</li>\n" +
                "      <li>shortness of breath/difficulty breathing</li>\n" +
                "      <li>feeling feverish, chills, or temperature equal to<br>\n" +
                "        or over 38°C</li>\n" +
                "      <li>skin changes or rashes (in children)</li>\n" +
                "      <li>muscle or body aches, fatigue, weakness, or feeling very&nbsp;unwell</li>\n" +
                "      <li>new loss of smell or taste</li>\n" +
                "      <li>headache</li>\n" +
                "      <li>gastrointestinal symptoms like abdominal pain, diarrhea, or&nbsp;vomiting</li>\n" +
                "    </ul>\n" +
                "    <p>If you start having symptoms of COVID-19,&nbsp;<strong>or</strong>&nbsp;you receive a&nbsp;positive COVID-19 molecular test, you&nbsp;<strong>must</strong>:</p>\n" +
                "    <ul>\n" +
                "      <li>isolate yourself from others immediately for a period of 14 days that begins the day you have a COVID-19 test or developed symptoms.</li>\n" +
                "      <li>follow the COVID-19 instructions of the local public health authority (see below)</li>\n" +
                "    </ul>\n" +
                "    <p><strong>Your compliance with these requirements is subject to verification and enforcement.</strong></p>\n" +
                "    <p>You will be called from 1-888-336-7735 and may be visited by a screening officer or law enforcement to verify your compliance during your 14-day quarantine. You will receive calls with a pre-recorded messages and email reminders&nbsp;of&nbsp;your obligations.</p>\n" +
                "    <p>Those in violation may be transferred to a quarantine facility, face fines, and/or imprisonment.</p>\n" +
                "    <ul>\n" +
                "      <li>Note that you may also be contacted by provincial or territorial authorities throughout the 14-day period.</li>\n" +
                "      <li>If federal and provincial or territorial guidelines differ, you should follow the strictest requirements.</li>\n" +
                "    </ul>")
    }
}