package com.ceng319.stepofviewswitcher;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

// import button, view, and viewSwitcher classes
import android.view.View;
import android.widget.Button;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    //Declare ViewSwitcher variable called vSwitcher
    ViewSwitcher vSwitcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Declare 2 buttons: btnPre and btnNext
        Button btnPre, btnNext;

        //Find view by id (ViewSwitcher, btnPre, btnNext)
        vSwitcher = findViewById(R.id.vSwitcher);
        btnPre = findViewById(R.id.btn_pre);
        btnNext = findViewById(R.id.btn_next);

        //When next button is pressed, viewSwitcher switches view to next view
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vSwitcher.showNext();
            }
        });
        //When previous button is pressed, viewSwitcher switches view to Previous view
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vSwitcher.showPrevious();
            }
        });

    }
}
