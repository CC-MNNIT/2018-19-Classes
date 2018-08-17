package com.appworld.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int i=0;
    Button button;
    final static String TAG = "DebugMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Avoid using Toast to debug , use when required
        Toast.makeText(MainActivity.this,"onCreate()",Toast.LENGTH_LONG).show();
        Log.i(TAG,"onCreate()");

        button=(Button)findViewById(R.id.Click_Me_Button) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                if( i == 5 ) {
                    alertdialoog();
                }
                Toast.makeText(MainActivity.this,"click i="+i,Toast.LENGTH_SHORT).show();
            }
        });
    }

    protected void alertdialoog() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Enjoying android ?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this,"onStart()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStart()");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"onResume()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this,"onPause()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this,"onStop()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this,"onDestroy()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this,"onRestart()",Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onRestart()");
    }
}
