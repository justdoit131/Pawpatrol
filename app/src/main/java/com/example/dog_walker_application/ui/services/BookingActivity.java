package com.example.dog_walker_application.ui.services;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.example.dog_walker_application.R;

public class BookingActivity extends AppCompatActivity {

    private EditText dogCountEditText;
    private EditText durationEditText;
    private EditText walkerEditText;
    private EditText dateTimeEditText;
    private Button bookNowButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        // Initialize EditText fields and Button
        dogCountEditText = findViewById(R.id.dogCountEditText);
        durationEditText = findViewById(R.id.durationEditText);
        walkerEditText = findViewById(R.id.walkerEditText);
        dateTimeEditText = findViewById(R.id.dateTimeEditText);
        bookNowButton = findViewById(R.id.bookNowButton);

        bookNowButton.setOnClickListener(v -> {
            // Get the values entered by the user
            String dogCount = dogCountEditText.getText().toString();
            String duration = durationEditText.getText().toString();
            String walker = walkerEditText.getText().toString();
            String dateTime = dateTimeEditText.getText().toString();

            // For now, just show the booking details in the log
            String bookingDetails = "Booking confirmed:\n" +
                    "Number of dogs: " + dogCount + "\n" +
                    "Duration: " + duration + " minutes\n" +
                    "Walker: " + walker + "\n" +
                    "Date and Time: " + dateTime;

            // Display the booking details (you can replace this with your logic)
            System.out.println(bookingDetails);
        });
    }
}
