package com.example.hmw6;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SimpleClass extends AppCompatActivity {


    public void tvCreator(LinearLayout outputLayout, int fstNum, int scdNum, int devider) {

        setContentView(R.layout.activity_main);

        if ( scdNum > fstNum ) {

            for (int i = fstNum; i <= scdNum; i++) {

                if ( i % devider == 0 ) {

                    TextView textView = new TextView(this);
                    textView.setText(String.valueOf(i));
                    textView.setId(i);
                    textView.setTextSize(18);
                    textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    outputLayout.addView(textView);

                }

            }

        } else {

            for (int i = scdNum; i <= fstNum; i++) {

                if (i % devider == 0) {

                    TextView textView = new TextView(this);
                    textView.setText(i);
                    textView.setTextSize(16);
                    outputLayout.addView(textView);

                }
            }
        }

    }

}
