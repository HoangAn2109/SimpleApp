package com.example.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentActivity1 extends AppCompatActivity {

    EditText name, email, date1, date2;
    Button conf;
    DBHelper1 DB1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        name = (EditText) findViewById(R.id.cusname);
        email = (EditText) findViewById(R.id.cusemail);
        date1 = (EditText) findViewById(R.id.date1);
        date2 = (EditText) findViewById(R.id.date2);
        conf = (Button) findViewById(R.id.conf);
        DB1 = new DBHelper1(this);

        conf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String na = name.getText().toString();
                String em = email.getText().toString();
                String da1 = date1.getText().toString();
                String da2 = date2.getText().toString();
                if (na.equals("") || em.equals("") || da1.equals("") || da2.equals(""))
                    Toast.makeText(PaymentActivity1.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    Boolean insert1 = DB1.insertData1(na, em, da1, da2);
                    if (insert1 == true) {
                        Toast.makeText(PaymentActivity1.this, "Booking successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), End.class);
                        startActivity(intent);
                    }

                }
            }
        });

    }
}