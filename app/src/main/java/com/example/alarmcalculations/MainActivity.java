package com.example.alarmcalculations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when calculate button is pressed **/
    public void calculateBatteryCapacity(View view)
    {
        //Define Variables & Fetch from inputs
        TextView resultView = (TextView)findViewById(R.id.textResult);
        double standbyCurrent = Double.parseDouble(findViewById(R.id.editStandByCurrent));
        double fullAlarmCurrent = Double.parseDouble(editAlarmCurrent);
        double standByTime = Double.parseDouble(editStandbyTime);
        double Cmin = 0;





        double value;
        String text =your_edittext.getText().toString();
        if(!text.isEmpty())
            try
            {
                value= Double.parseDouble(text);
                // it means it is double
            } catch (Exception e1) {
                // this means it is not double
                e1.printStackTrace();
            }





        //Cmin Calculations
        Cmin = standbyCurrent * standByTime;
        Cmin += fullAlarmCurrent;
        Cmin = Cmin * 1.25;

        //Send to TextView
        String finalResult = Double.toString(Cmin);
        resultView.setText(finalResult);

    }

}
