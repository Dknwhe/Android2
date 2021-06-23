package se.ecutb.cai.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Form extends AppCompatActivity {

    private EditText editName, editLastname,  editEmail, editNumber;

    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        radioGroup = findViewById(R.id.rgb_gender);
        editName = findViewById(R.id.editTextTextPersonName);
        editLastname = findViewById(R.id.editTextTextPersonLastname);
        editEmail = findViewById(R.id.editTextTextEmailAddress);
        editNumber = findViewById(R.id.editTextPhone);




    }

    public void onClick(View view) {

        Intent intent = new Intent(this, Send.class);

        String editNameValue = editName.getText().toString();
        String editLastnameValue = editLastname.getText().toString();
        String editEmailValue = editEmail.getText().toString();
        String editNumberValue = editNumber.getText().toString();
        String editGenderValue = String.valueOf(radioGroup.getId());

        Bundle bundle = new Bundle();
        bundle.putString("editName", editNameValue);
        bundle.putString("editLastname", editLastnameValue);
        bundle.putString("editEmail", editEmailValue);
        bundle.putString("editNumber", editNumberValue);
        bundle.putString("editGender", editGenderValue);

        intent.putExtra("editBundle", bundle);
        startActivity(intent);



    }

    public void rbClick(View view) {
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioButtonId);

        Toast.makeText(Form.this, radioButton.getText(), Toast.LENGTH_LONG).show();
    }
}