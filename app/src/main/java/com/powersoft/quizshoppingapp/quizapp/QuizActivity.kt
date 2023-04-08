package com.powersoft.quizshoppingapp.quizapp

import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.powersoft.quizshoppingapp.databinding.ActivityQuizBinding
import java.text.SimpleDateFormat
import java.util.*

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Quiz"

        binding.btnReset.setOnClickListener { reset() }
        binding.btnSubmit.setOnClickListener { submit() }
    }

    private fun reset() {
        binding.chkOption1.isChecked = false
        binding.chkOption2.isChecked = false
        binding.chkOption3.isChecked = false

        binding.rbOption1.isChecked = false
        binding.rbOption1.isChecked = false
        binding.rbOption1.isChecked = false
    }

    private fun submit() {
        var point = 0
        if (binding.rbOption2.isChecked) point += 50
        if (binding.chkOption1.isChecked && binding.chkOption2.isChecked) point += 50

        val message =
            if (point == 0) "Oops!! You score 0 points" else "Congratulations! You submitted on ${getCurrentDateAndTime()}, Your achieved $point%"

        showAlertDialog(message)
    }

    private fun showAlertDialog(message: String) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Result")
        builder.setMessage(message)

        builder.setPositiveButton(android.R.string.ok) { dialog, _ -> dialog.dismiss() }

        builder.show()
    }

    private fun getCurrentDateAndTime(): String {
        val date = Calendar.getInstance().time
        val formatter = SimpleDateFormat("dd/MM/yyyy hh:mm", Locale.getDefault())
        return formatter.format(date)
    }
}