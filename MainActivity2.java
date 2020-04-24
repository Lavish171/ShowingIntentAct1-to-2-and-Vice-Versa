package com.example.showingintents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView gettext;
    EditText editTextnew;
    Button buttonhelp;

    public void helper(View view)
    {
        Intent intent2= new Intent();
        intent2.putExtra("editTextValue",editTextnew.getText().toString());
        setResult(RESULT_OK, intent2);
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent1=getIntent();
        String gettingtext=intent1.getStringExtra("Text");
        Toast.makeText(getApplicationContext(),"String Received from act 1\n "+gettingtext,Toast.LENGTH_SHORT).show();
        gettext=findViewById(R.id.gettext);
        editTextnew=findViewById(R.id.showback);
        gettext.setText(gettingtext);
        buttonhelp=findViewById(R.id.buttonhelp);
    }
}
