package com.example.nancy.myapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction(View view){
        Button button= findViewById(R.id.button);
        if (button.getText()== "You clicked this button!"){
            button.setText(R.string.button_text);
        }else{
            button.setText("You clicked this button!");

        }
    }

    public void clickLogin(View view){
        EditText nameInput= findViewById(R.id.nameInput);
        EditText passInput=findViewById(R.id.passInput);
        Button button= findViewById(R.id.login);
        button.setText("You are logged in!");
        Toast.makeText(MainActivity.this, "Hello "+nameInput.getText().toString()+", you are logged in", Toast.LENGTH_SHORT).show();
        Log.i("Username",nameInput.getText().toString());
        Log.i("Password",passInput.getText().toString());
    }

    public void changeImage(View view){

        ImageView dog=findViewById(R.id.dogImage);
        String tagName=String.valueOf(dog.getTag());

        if (tagName.equals("dog1")) {
            dog.setTag("dog2");
            dog.setImageResource(R.drawable.dog2);
        }else{
            dog.setTag("dog1");
            dog.setImageResource(R.drawable.dog1);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
