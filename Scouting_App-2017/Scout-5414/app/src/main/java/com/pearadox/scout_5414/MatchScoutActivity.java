package com.pearadox.scout_5414;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class MatchScoutActivity extends AppCompatActivity {

    String TAG = "MatchScout_Activity";      // This CLASS name
    TextView txt_dev, txt_stud, txt_match, txt_MyTeam;
    ImageView imgScoutLogo;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "<< Match Scout >>");
        setContentView(R.layout.activity_match_scout);
        Bundle bundle = this.getIntent().getExtras();
        String param1 = bundle.getString("dev");
        String param2 = bundle.getString("stud");
        Log.d(TAG, param1 + " " + param2);      // ** DEBUG **

        txt_dev = (TextView) findViewById(R.id.txt_Dev);
        txt_stud = (TextView) findViewById(R.id.txt_Student);
        txt_match = (TextView) findViewById(R.id.txt_Match);
        txt_MyTeam = (TextView) findViewById(R.id.txt_MyTeam);
        imgScoutLogo = (ImageView) findViewById(R.id.imageView_SM);
        txt_dev.setText(param1);
        txt_stud.setText(param2);
        String devcol = param1.substring(0,3);
        Log.d(TAG, "color=" + devcol);
        if (devcol.equals("Red")) {
            Log.d(TAG, "loading RED logo ..............");
//            imgScoutLogo.setImageDrawable(getResources().getDrawable(R.drawable.red_scout, getApplicationContext().getTheme()));
        } else {
            Log.d(TAG, "loading BLUE logo ..............");
//            imgScoutLogo.setImageDrawable(getResources().getDrawable(R.drawable.blue_scout, getApplicationContext().getTheme()));
        }

    }
}
