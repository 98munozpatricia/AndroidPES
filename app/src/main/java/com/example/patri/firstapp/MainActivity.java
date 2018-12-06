package com.example.patri.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); //Busco a la main activity la info
        EditText editText = (EditText) findViewById(R.id.editText); //Creo una variable
        String message = editText.getText().toString(); //Instancia
        intent.putExtra(EXTRA_MESSAGE, message); //Envia el missatge
        startActivity(intent);
    }
}