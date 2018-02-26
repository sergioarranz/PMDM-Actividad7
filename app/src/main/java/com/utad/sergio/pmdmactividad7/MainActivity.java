package com.utad.sergio.pmdmactividad7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    DatabaseAdmin databaseAdmin = new DatabaseAdmin(this);
    Contact contact = new Contact(4,"Sergio", "3223233324");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseAdmin.addContact(contact);

        Contact contact = databaseAdmin.getContact(3);
        Log.v("Contact Data: ", contact.getName()+" --- "+contact.getPhoneNumber());
    }
}
