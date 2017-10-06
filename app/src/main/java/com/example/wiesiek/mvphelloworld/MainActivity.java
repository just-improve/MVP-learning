package com.example.wiesiek.mvphelloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ILoginView;
import com.example.wiesiek.mvphelloworld.InterfejsyKaty.ILoginPresenter;
import com.example.wiesiek.mvphelloworld.Presenter.LoginPresenter;

public class MainActivity extends AppCompatActivity implements ILoginView {

    ILoginPresenter iLoginPresenter;
    Button btn;
    EditText loginEdit, passwordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.idBtn);
        loginEdit = (EditText) findViewById(R.id.loginId);
        passwordEdit = (EditText) findViewById(R.id.passwordId);

        iLoginPresenter = new LoginPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String loginStr = loginEdit.getText().toString();
                String passwordStr = passwordEdit.getText().toString();
                iLoginPresenter.AttemptLogin(loginStr,passwordStr);
            }
        });
    }


    @Override
    public void navigateToListActivity() {
        Toast.makeText(this,"Succes", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailed() {
        Toast.makeText(this,"LoginFailed", Toast.LENGTH_SHORT).show();

    }
}
