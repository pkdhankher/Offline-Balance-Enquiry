package com.example.pawan.offlinebalanceenquiry;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button b;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);
        t = (TextView) findViewById(R.id.textView);
    }
    public void onClick(View v) {

         Intent callIntent = new Intent(Intent.ACTION_CALL);

         String encodedHash = Uri.encode("#");
         String ussd = "*"+"141"+encodedHash;
        // t.setText(ussd);
        callIntent.setData(Uri.parse("tel:"+ ussd));
        try {
            startActivity(callIntent);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }



}
