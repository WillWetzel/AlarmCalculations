package com.example.alarmcalculations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editStandByCurrent, editFullAlarmCurrent, editStandByTime;
    TextView result;
    Button buttonCalculateCmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editStandByCurrent = (EditText) findViewById(R.id.editStandByCurrent);
        editFullAlarmCurrent = (EditText) findViewById(R.id.editAlarmCurrent);
        editStandByTime = (EditText) findViewById(R.id.editStandbyTime);
        buttonCalculateCmin = (Button) findViewById(R.id.btnCalculate);
        result = (TextView) findViewById(R.id.textResult);

        buttonCalculateCmin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //Get the numbers...
                Double standByCurrent = Double.parseDouble(editStandByCurrent.getText().toString());
                Double fullAlarmCurrent = Double.parseDouble(editFullAlarmCurrent.getText().toString());
                Double standByTime = Double.parseDouble(editStandByTime.getText().toString());
                Double Cmin;

                //...And crunch 'em
                Cmin = standByCurrent * standByTime;
                Cmin += fullAlarmCurrent;
                Cmin = Cmin * 1.25;

                // Return/set result
                result.setText(Cmin.toString());
            }
        });

    }

}
