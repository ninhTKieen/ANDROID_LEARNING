package com.example.dialogforalert;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickedButton = findViewById(R.id.alert_button);
        clickedButton.setOnClickListener(this::onClickShowAlert);
    }

    public void onClickShowAlert(View view) {
        AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(MainActivity.this);
        //Set the dialog title and msg
        myAlertBuilder.setTitle("Alert");
        myAlertBuilder.setMessage("Click OK to continue, or cancel to stop");

        myAlertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
            }
        });

        myAlertBuilder.setNegativeButton("Cancel", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Pressed Cancel",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        // Create and show the AlertDialog.
        myAlertBuilder.show();
    }
}