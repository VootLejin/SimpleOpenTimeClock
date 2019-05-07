package com.example.simpleopentimeclock;

import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button punchIn = findViewById(R.id.clockInBtn);
        final Button punchOut = findViewById(R.id.clockOutBtn);

        punchIn.setOnClickListener(PunchInListener);
        punchOut.setOnClickListener(PunchOutListener);
    }

    private final View.OnClickListener PunchInListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // call the punch in method w/ user ID
            TextInputEditText userIdView = (TextInputEditText) findViewById(R.id.UserIDtxt);
            String userID = userIdView.getText().toString();

            TextView outputTxt = findViewById(R.id.outputlbl);
            // TODO: Replace this with calling the data side of things.
            outputTxt.setText(userID);
        }
    };

    private final View.OnClickListener PunchOutListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // call the punch out method w/ user ID
            TextInputEditText userIdView = (TextInputEditText) findViewById(R.id.UserIDtxt);
            String userID = userIdView.getText().toString();

            TextView outputTxt = findViewById(R.id.outputlbl);
            // TODO: Replace this with calling the data side of things.
            outputTxt.setText(userID);
        }
    };
}
