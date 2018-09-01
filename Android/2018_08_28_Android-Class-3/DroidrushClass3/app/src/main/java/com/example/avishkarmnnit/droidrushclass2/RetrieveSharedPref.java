package com.example.avishkarmnnit.droidrushclass2;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RetrieveSharedPref extends AppCompatActivity {

    EditText Name, collg;
    Button retrieve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve_shared_pref);

        Name = (EditText) findViewById(R.id.ret_name);
        collg = (EditText) findViewById(R.id.ret_collg);
        retrieve = (Button) findViewById(R.id.ret_sharedPref);

        retrieve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("MyDetails", Context.MODE_PRIVATE);
                String myName = sharedPreferences.getString("Name", "");
                String myCollege = sharedPreferences.getString("College", "");
                Name.setText(myName);
                collg.setText(myCollege);
            }
        });
    }
}
