package se.ecutb.cai.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Send extends AppCompatActivity {

    TextView textName, textLastName, textNumber, textEmail, textGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        textName = findViewById(R.id.textName);
        textLastName = findViewById(R.id.textLastname);
        textNumber = findViewById(R.id.textNumber);
        textEmail = findViewById(R.id.textEmail);
        textGender = findViewById(R.id.textGender);

        Intent intent = getIntent();

        Bundle editBundle = intent.getBundleExtra("editBundle");

        String editNameValue = editBundle.getString("editName");
        String editLastnameValue = editBundle.getString("editLastname");
        String editEmailValue = editBundle.getString("editEmail");
        String editNumberValue = editBundle.getString("editNumber");
        String editGenderValue = editBundle.getString("editGender");

        textName.setText(editNameValue);
        textLastName.setText(editLastnameValue);
        textEmail.setText(editEmailValue);
        textNumber.setText(editNumberValue);
        textGender.setText(editGenderValue);

    }
}