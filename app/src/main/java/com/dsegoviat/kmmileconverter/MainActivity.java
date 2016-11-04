package com.dsegoviat.kmmileconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                conversion(v);
            }
        });
    }

    public void conversion(View view) {
        switch (view.getId()) {
            case R.id.button:
                EditText text = (EditText) findViewById(R.id.editText);
                TextView result = (TextView) findViewById(R.id.textView2);
                RadioButton buttonKm = (RadioButton) findViewById(R.id.radioButton);

                float inputValue = Float.parseFloat(text.getText().toString());
                double resultValue;
                if (buttonKm.isChecked())
                    resultValue = inputValue / 1.609344;
                else
                    resultValue = inputValue * 1.609344;
                result.setText(String.format(Locale.getDefault(), "%.3f", resultValue));
                break;
        }
    }
}
