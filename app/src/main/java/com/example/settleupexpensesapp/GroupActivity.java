package com.example.settleupexpensesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.settleupexpensesapp.R;

public class GroupActivity extends AppCompatActivity {
    private Button groupname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
       /* groupname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddActivity();

            }
        });*/

    }
  /*  public void BasicActivity2(){
        Intent intent = new Intent( this, AddActivity.class);
        startActivity(intent);
    }*/
}
    
