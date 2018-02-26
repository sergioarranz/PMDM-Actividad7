package com.utad.sergio.pmdmactividad7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    DatabaseAdmin databaseAdmin = new DatabaseAdmin(this);
    Contact contact = new Contact(3,"Sergio", "3223233324");
    Contact contact2 = new Contact(4,"Juanma", "233221232");
    Contact contact3 = new Contact(5,"Dani", "1233212334");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseAdmin.addContact(contact);
        databaseAdmin.addContact(contact2);
        databaseAdmin.addContact(contact3);

        Contact contact = databaseAdmin.getContact(3);
        Log.v("Contact Data: ", contact.getName()+" --- "+contact.getPhoneNumber());
        Log.v("Contact Data: ", " Todos los contactos: "+databaseAdmin.getAllContacts());
    }
}
