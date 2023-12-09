package com.example.pr_28_zlobina_pr_21_101;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button:
               Intent intent = new Intent(this, MainActivity2.class);
               startActivity(intent);
                break;

            case R.id.button2:
                Intent intent1 = new Intent (this, MainActivity3.class);
                startActivity(intent1);
                break;

            case R.id.button3:
                Intent intent2 = new Intent (this, MainActivity4.class);
                startActivity(intent2);
                break;

            default:
                Toast.makeText(getApplication(),"hey!",Toast.LENGTH_LONG).show();
        }
    }
}