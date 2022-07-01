package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText amountET;
    private RadioButton dollarToTakaRB, takaToDollarRB;
    private Button converterBtn;
    private TextView resultTV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        amountET = findViewById(R.id.amountET);
        dollarToTakaRB = findViewById(R.id.dollarToTakaRB);
        takaToDollarRB = findViewById(R.id.takaToDollarRB);
        converterBtn = findViewById(R.id.convertBtn);
        resultTV = findViewById(R.id.resultTV);
        
        converterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount = amountET.getText().toString();
                if(amount.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter your amount",Toast.LENGTH_LONG).show();
                }else {

                    if (dollarToTakaRB.isChecked()) {
                        double totalAmount = Double.valueOf(amount);
                        double result = totalAmount * 80;
                        resultTV.setText(String.valueOf(result));


                    } else {

                    }
                }
            }
        });
    }
    
}
