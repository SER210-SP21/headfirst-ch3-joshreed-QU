package com.hfad.mymessenger;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    //Calls function when button is clicked
    public void onSendMessage(View view) {
        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        //Intent intent = new Intent(Intent.ACTION_SEND);
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        //intent.setType("text/plain");
        intent.putExtra("message", messageText);
        startActivity(intent);
        //String chooserTitle = getString(R.string.chooser);
        //Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        //startActivity(chosenIntent);
    }
}