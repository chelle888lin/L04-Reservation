package sg.edu.rp.c346.id20028636.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText phNumber;
    EditText gpNumber;
    DatePicker datePicker;
    TimePicker timePicker;
    ToggleButton smoking;
    Button submit;
    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.editTextTextPersonName);
        phNumber = findViewById(R.id.editTextPhone);
        gpNumber = findViewById(R.id.editTextNumber);
        datePicker = findViewById(R.id.datePicker);
        timePicker = findViewById(R.id.timePicker);
        smoking = findViewById(R.id.toggleButton);
        submit = findViewById(R.id.btnSubmit);
        reset = findViewById(R.id.btnRest);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), name + "reserved for " + gpNumber + "people for " + datePicker + timePicker + "with a " + smoking + "room" , Toast.LENGTH_LONG ).show();

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.updateDate(2020,7,1);
                timePicker.setCurrentHour(7);
                timePicker.setCurrentMinute(30);

            }
        });
    }
}