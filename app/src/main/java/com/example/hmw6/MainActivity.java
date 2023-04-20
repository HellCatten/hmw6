package com.example.hmw6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText fstEditText = findViewById(R.id.fstNum);
        EditText scdEditText = findViewById(R.id.scdNum);
        EditText devider = findViewById(R.id.parser);
        Button btn = findViewById(R.id.clcBtn);
        LinearLayout outputLayout = findViewById(R.id.output);
        btn.setOnClickListener( v -> {
            outputLayout.removeAllViews();
            Log.i("hmw6_tag", "Button clicked");
            String num1 = fstEditText.getText().toString();
            String num2 = scdEditText.getText().toString();
            String p = devider.getText().toString();
            int fstNum = Integer.parseInt(num1);
            int scdNum = Integer.parseInt(num2);
            int prs = Integer.parseInt(p);
            Log.i("hmw6_tag","first value = " + fstNum + "Second value = " + scdNum + "Deveder = " + prs);
            //SimpleClass.tvCreator(outputLayout,fstNum,scdNum,prs);

            if ( scdNum > fstNum ) {
                Log.i("hmw6_tag","TextView creator is working");
                for (int i = fstNum; i <= scdNum; i++) {

                    if ( i % prs == 0 ) {

                        TextView textView = new TextView(this);
                        textView.setText(String.valueOf(i));
                        textView.setId(i);
                        textView.setTextSize(18);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        outputLayout.addView(textView);

                    }

                }

            } else {
                Log.i("hmw6_tag","TextView creator is working");
                for (int i = scdNum; i <= fstNum; i++) {

                    if (i % prs == 0) {

                        TextView textView = new TextView(this);
                        textView.setText(String.valueOf(i));
                        textView.setTextSize(18);
                        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                        outputLayout.addView(textView);

                    }
                }
            }


        });
    }
}