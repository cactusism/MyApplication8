package com.example.hailaalsultan.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name,username,age,gender,password;
    Button insert;
    FirebaseDatabase database;
    DatabaseReference ref;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.name);
        username = (EditText) findViewById(R.id.username);
        age = (EditText) findViewById(R.id.age);
        gender = (EditText) findViewById(R.id.gender);
        password = (EditText) findViewById(R.id.password);
        insert = (Button) findViewById(R.id.btnInsert);
        insert.setOnClickListener(this);
        database = FirebaseDatabase.getInstance();
        user = new User();
        ref = database.getReference("User");
    }
private void getValues(){
        user.setName(name.getText().toString());
        user.setUserName(username.getText().toString());
        user.setAge(age.getText().toString());
        user.setGender(gender.getText().toString());
        user.setPassword(password.getText().toString());


}
    public void btnInsert(View view){

        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Toast.makeText(MainActivity.this,"Data111 Inserted ", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        getValues();
        ref.child("User03").setValue(user);
        Toast.makeText(MainActivity.this,"Data Inserted  woohoo", Toast.LENGTH_LONG).show();

    }
}
