package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickedButton = findViewById(R.id.button_show_date);
        clickedButton.setOnClickListener(this::showDatePicker);
    }

    public void showDatePicker(View view) {
        DialogFragment dialogFragment = new DatePickerFragment();
        //getSupportFragmentManager to manage the Fragment automatically
        dialogFragment.show(getSupportFragmentManager(), getString(R.string.date_picker));
    }

    public void showDatePickerResult(int year, int month ,int day) {
        String sYeah = Integer.toString(year);
        String sMonth = Integer.toString(month);
        String sDay = Integer.toString(day);

        String dateMessage = (sMonth + "/" + sDay + "/" + sYeah);
        Toast.makeText(this, "Date: " + dateMessage, Toast.LENGTH_SHORT).show();
    }
}