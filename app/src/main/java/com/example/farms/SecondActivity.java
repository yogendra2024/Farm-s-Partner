package com.example.farms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SecondActivity extends AppCompatActivity {

EditText etName,etPassword;
Button btnLogin ;
Button btnReg;
FirebaseAuth fAuth;
ProgressBar Progressbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etName = findViewById(R.id.etName);
        etPassword =findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnReg = findViewById(R.id.btnRge2);

        fAuth = FirebaseAuth.getInstance();
        Progressbar = findViewById(R.id.progressBar);

       btnLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               String email = etName.getText().toString().trim();
               String password = etPassword.getText().toString();

               if(TextUtils.isEmpty(email)){
                   etName.setError("Email is Required");
                   return;
               }
               if(TextUtils.isEmpty(password)){
                   etPassword.setError("Password is Required");
                   return;
               }

               if(password.length() < 6){
                   etPassword.setError("Password must be greater than 6 character");
                   return;
               }
               Progressbar.setVisibility(View.VISIBLE);


               fAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {

                       if(task.isSuccessful()){

                           Toast.makeText(SecondActivity.this, "Logged In Successfully", Toast.LENGTH_SHORT).show();
                           startActivity(new Intent(getApplicationContext(),ThirdActivity.class));
                       }else{
                           Toast.makeText(SecondActivity.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                       }
                   }
               });
           }
       });
        Button Govt = (Button)findViewById(R.id.btnRge2);

        Govt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,RegActivity.class);
                startActivity(intent);
            }
        });
    }
}
