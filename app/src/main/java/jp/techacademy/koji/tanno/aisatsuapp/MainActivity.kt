package jp.techacademy.koji.tanno.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.app.TimePickerDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timePickButton.setOnClickListener {
            showTimePickerDialog()
        }

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI_PARTS", "$hour:$minute")
                if (2<=hour && hour<10) {
                    aisatsuTextView.text = "おはよう"
                } else if (10<=hour && hour<18) {
                    aisatsuTextView.text = "こんにちは"
                } else {
                    aisatsuTextView.text = "こんばんは"
                }
            },
            13, 0, true)

        timePickerDialog.show()

    }



}