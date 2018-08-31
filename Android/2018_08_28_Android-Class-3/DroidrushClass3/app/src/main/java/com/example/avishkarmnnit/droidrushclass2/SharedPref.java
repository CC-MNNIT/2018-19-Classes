package com.example.avishkarmnnit.droidrushclass2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SharedPref extends AppCompatActivity {

    EditText Name, collg;
    Button save, retrieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref);

        Name = (EditText) findViewById(R.id.name);
        collg = (EditText) findViewById(R.id.collg);
        save = (Button) findViewById(R.id.save_sharedPref);
        retrieve = (Button) findViewById(R.id.retrieve);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MyDetails", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                String myName = Name.getText().toString();
                String myCollege = collg.getText().toString();
                editor.putString("Name", myName);
                editor.putString("College", myCollege);
                editor.commit();
            }
        });

        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SharedPref.this, RetrieveSharedPref.class);
                startActivity(intent);
            }
        });
    }
}
