package sg.edu.rp.c346.id21045028.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
 // Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton toggleOn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Step 2 : Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.EditTextInput);
        toggleOn = findViewById(R.id.toggleButtonEnabled);
        rgGender = findViewById(R.id.Gender);


        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);

            }
        });

        toggleOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Add your code for the action
                if(toggleOn.isChecked() == true){
                    etInput.setEnabled(true);
                }
                else if(toggleOn.isChecked() == false){
                    etInput.setEnabled(false);
                }


            }
        });

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String stringResponse = etInput.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                String male = "He says ";
                String female = "She says ";
                if(checkedRadioId == R.id.radiobuttonGenderMale){
                    // Write the code when male selected
                    stringResponse = male + stringResponse;
                }
                else{
                    // Write the code when female selected
                    stringResponse = female + stringResponse;

                }
                tvDisplay.setText(stringResponse);
            }
        });



    }
}