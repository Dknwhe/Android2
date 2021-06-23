package se.ecutb.cai.exercise_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean loginValid = false;

    String Username = "Admin";
    String Password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editUsername = findViewById(R.id.username_EditText);
        EditText editPassword = findViewById(R.id.password_EditText);
        Button login = findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUsername = editUsername.getText().toString();
                String inputPassword = editPassword.getText().toString();

                if(inputUsername.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Password and username can't be empty! ", Toast.LENGTH_SHORT).show();

                } else {
                    loginValid = login(inputUsername, inputPassword);
                    if(!loginValid) {
                        Toast.makeText(MainActivity.this, "Uncorrected password and username", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, " Welcome!" , Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, Form.class);
                        startActivity(i);

                    }
                }
            }
        });
    }

    private boolean login(String name, String password) {

        if (name.equals(Username) && password.equals(Password)) {
            return true;
        }

        return false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle", "onStart invoked " + getApplication());

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle", "onResume invoked " + getApplication());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle", "onPause invoked " + getApplication());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle", "onStop invoked " + getApplication());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle", "onRestart invoked " + getApplication());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle", "onDestroy invoked " + getApplication());
    }
}