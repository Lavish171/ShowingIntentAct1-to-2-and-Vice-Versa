package com.example.showingintents;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    private Intent intent;
    TextView toshowtextview;
    public void goingtonext(View view)
    {
        intent=new Intent(getApplicationContext(),Main2Activity.class);
        intent.putExtra("Text",editText.getText().toString() );
        startActivityForResult(intent, 1);
        //1 is the request code
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1)
        {
                assert  data!=null;
                String gettingback=data.getStringExtra("editTextValue");
            Toast.makeText(getApplicationContext(),"Get string back "+gettingback,Toast.LENGTH_SHORT).show();
                toshowtextview.setText(gettingback);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.edittext);
        toshowtextview=findViewById(R.id.toshowtextview);
    }
}
