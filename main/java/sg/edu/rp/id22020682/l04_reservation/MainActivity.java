package sg.edu.rp.id22020682.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnReset;
    Button btnSubmit;
    EditText name_diner;
    EditText mobile_number;
    EditText pax;
    RadioGroup smoke_nosmoke;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dp =findViewById(R.id.datePicker);
        tp =findViewById(R.id.timePicker);
        btnReset = findViewById(R.id.resetbutton);
        btnSubmit = findViewById(R.id.subbutton);
        name_diner = findViewById(R.id.dinername);
        mobile_number = findViewById(R.id.dinernumber);
        pax = findViewById(R.id.pax);
        smoke_nosmoke = findViewById(R.id.smoking);


        tp.setCurrentHour(7);
        tp.setCurrentMinute(30);

        dp.updateDate(2020,05,1);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {




                Toast.makeText(getApplicationContext(),"Button Clicked",Toast.LENGTH_SHORT).show();

            }
        });




        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);

                dp.updateDate(2020,05,1);



            }
        });






    }
}