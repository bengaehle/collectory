package com.bengaehle.collectory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setup buttons to open View and Modify Activities
        Button view_button = (Button) findViewById(R.id.main_button_view);
        view_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "View Button Pressed", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, ViewActivity.class);
                //startActivity(intent);
            }
        });

        Button modify_button = (Button) findViewById(R.id.main_button_modify);
        modify_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Modify Button Pressed", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, ModifyActivity.class);
                //startActivity(intent);
            }
        });
    }
}
