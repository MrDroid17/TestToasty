package com.example.mrdroid.test_toasty;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configToasty();
    }

    private void configToasty(){
        Toasty.Config.getInstance()
                .setErrorColor(ContextCompat.getColor(this, R.color.error_color))
                .setErrorColor(ContextCompat.getColor(this, R.color.warning_color))
                .setErrorColor(ContextCompat.getColor(this, R.color.success_color))
                .setErrorColor(ContextCompat.getColor(this, R.color.info_color))
                .apply();
    }

    public void showErrorToasty(View view){

        Toasty.error(this, getString(R.string.Error_Message), Toast.LENGTH_SHORT, true).show();
    }

    public void showWarningToasty(View view){

        Toasty.warning(this, getString(R.string.Warning_Message), Toast.LENGTH_SHORT, true).show();
    }

    public void showSuccessToasty(View view){

        Toasty.success(this, getString(R.string.Success_Message), Toast.LENGTH_SHORT, true).show();
    }

    public void showInfoToasty(View view){

        Toasty.info(this, getString(R.string.Imformation_Message), Toast.LENGTH_SHORT, true).show();
    }



}
