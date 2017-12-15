package cimdata.android.dez2017.modernjavaonandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button clickMeButton;
    TextView outputTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickMeButton = findViewById(R.id.btn_acmain_clickme);
        outputTextView = findViewById(R.id.txt_acmain_output);

        clickMeButton.setOnClickListener( (v) -> outputTextView.setText("Klappt") );


    }
}
