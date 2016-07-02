package com.jalaj.firstapp.buttonlistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button b;
    private TextView tv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relative);
        b = (Button)findViewById(R.id.btnShowHide);
        b.setText(getResources().getString(R.string.strBtnHide));
    }

    public void onClick(View view){

        tv = (TextView) findViewById(R.id.txtImage);

        if (tv.getVisibility() == View.INVISIBLE )
        {
            tv.setVisibility(View.VISIBLE);
            b.setText(getResources().getString(R.string.strBtnHide));
        }
        else {
            tv.setVisibility(View.INVISIBLE);
            b.setText(getResources().getString(R.string.strBtnShow));

        }
    }

}
