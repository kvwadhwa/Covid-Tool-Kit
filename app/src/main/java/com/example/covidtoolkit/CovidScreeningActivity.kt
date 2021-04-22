// importing packages
package com.example.covidtoolkit
// importing library
import android.os.Bundle
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.quickbirdstudios.surveykit.*
import com.quickbirdstudios.surveykit.steps.CompletionStep
import com.quickbirdstudios.surveykit.steps.InstructionStep
import com.quickbirdstudios.surveykit.steps.QuestionStep
import com.quickbirdstudios.surveykit.survey.SurveyView
// creating class covidScreening activity
class CovidScreeningActivity : AppCompatActivity() {
    private lateinit var survey: SurveyView
    private lateinit var container: ViewGroup
    // creating function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid_screening)

        survey = findViewById(R.id.survey_view)
        container = findViewById(R.id.surveyContainer)
        setupSurvey(survey)
    }

    private fun setupSurvey(survey: SurveyView?) {
        val steps = listOf(
            InstructionStep(
                // entering tittle
                title = "COVID-19 worker and employee screening",
                // text
                text = "You must screen before going to work each day.\n" +
                        "\n" +
                        "The questions in this tool have been defined by the Ministry of Health. Using this specific online tool to answer the questions is optional and is not tracked or enforced. Screening is not required for emergency services or other first responders entering a workplace for emergency purposes.\n" +
                        "\n" +
                        "This screening tool is not applicable to health care settings (including long-term care homes), and some non-health care workplaces (for example, retirement homes, other congregate living settings, schools and child care) where existing screening requirements and tools are already in place.\n" +
                        "\n" +
                        "This screening cannot diagnose you. If you have medical questions, consult a health care provider. Follow the direction of your local public health unit over the advice in this tool.",
                // button text
                buttonText = "Start screening"
            ),
            QuestionStep(
                // question tittle
                title = "Are you currently experiencing any of these symptoms?",
                // text
                text = "Choose any that are new, worsening, and not related to other known causes or conditions you already have.",
                // single output is accepted
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        // list of textchoice we need to choice one
                        TextChoice("Fever and/or chills"),
                        TextChoice("Cough or barking cough "),
                        TextChoice("Shortness of breath"),
                        TextChoice("Sore throat"),
                        TextChoice("Difficulty swallowing"),
                        TextChoice("Runny or stuffy/congested nose"),
                        TextChoice("Decrease or loss of taste or smell"),
                        TextChoice("Pink eye"),
                        TextChoice("Headache"),
                        TextChoice("Digestive issues like nausea/vomiting, diarrhea, stomach pain"),
                        TextChoice("Muscle aches"),
                        TextChoice("Extreme tiredness "),
                        TextChoice("Falling down often"),
                        TextChoice("None of the above")

                    )
                )
            ),
            // question tittle
            QuestionStep(
                title = "Is anyone you live with currently experiencing any new COVID-19 symptoms and/or waiting for test results after experiencing symptoms?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // question tittle
            QuestionStep(
                title = "Is anyone you live with currently experiencing any new COVID-19 symptoms and/or waiting for test results after experiencing symptoms?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // question tittle
            QuestionStep(
                title = "In the last 14 days, have you or anyone you live with travelled outside of Canada?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // question tittle
            QuestionStep(
                title = "In the last 14 days, have you been identified as a “close contact” of someone who currently has COVID-19?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // question tittle
            QuestionStep(
                title = "Has a doctor, health care provider, or public health unit told you that you should currently be isolating (staying at home)?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // question tittle
            QuestionStep(
                title = "In the last 14 days, have you received a COVID Alert exposure notification on your cell phone?",
                text = "",
                // choose single output
                answerFormat = AnswerFormat.SingleChoiceAnswerFormat(
                    textChoices = listOf(
                        TextChoice("Yes"),
                        TextChoice("No")
                    )
                )

            ),
            // completion step go and prints finish as default
            CompletionStep(
                title = "Go",
                text = ""
            ),
            CompletionStep(
                title = "Don't go",
                text = ""
            )
        )
        // creating object
        val task = NavigableOrderedTask(steps = steps)

        task.setNavigationRule(
            steps[1].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "None of the above" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[2].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[3].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[4].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[5].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[6].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
        task.setNavigationRule(
            steps[7].id,
            NavigationRule.ConditionalDirectionStepNavigationRule { input ->
                when (input) {
                    "No" -> null
                    else -> steps.last().id
                }
            })
// setting color
        val configuration = SurveyTheme(
            themeColorDark = ContextCompat.getColor(this, R.color.cyan_normal),
            themeColor = ContextCompat.getColor(this, R.color.red),
            textColor = ContextCompat.getColor(this, R.color.red)
        )

        survey?.start(task, configuration)
    }
}