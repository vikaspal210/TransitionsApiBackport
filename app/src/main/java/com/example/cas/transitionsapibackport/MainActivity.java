package com.example.cas.transitionsapibackport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.transitionseverywhere.TransitionManager;

public class MainActivity extends AppCompatActivity {
    //constants


    Boolean toggle=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button=(Button)findViewById(R.id.button_id);
        final TextView textView=(TextView)findViewById(R.id.text_view);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final ViewGroup transitionsContainer=(ViewGroup)findViewById(R.id.transitions_container);
                if (toggle) {
                    TransitionManager.beginDelayedTransition(transitionsContainer);
                    button.setText("(0_o)");
                    textView.setVisibility(View.GONE);
                    toggle=false;
                }else {
                    TransitionManager.beginDelayedTransition(transitionsContainer);
                    button.setText("(-_-)");
                    textView.setVisibility(View.VISIBLE);
                    toggle=true;
                }
            }
        });

    }
}
