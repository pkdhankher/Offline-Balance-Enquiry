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
 /*   Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
    Button vb;
    Button vs;
    Button vd;
*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

  /*       vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);
        vb = (Button) findViewById(R.id.button);

    }
    public void onClick(View v) {

         Intent callIntent = new Intent(Intent.ACTION_CALL);

         String encodedHash = Uri.encode("#");
         String ussd_vb = "*"+"141"+encodedHash;
       if(v==vb) {
           callIntent.setData(Uri.parse("tel:" + ussd_vb));
           try {
               startActivity(callIntent);
           } catch (Exception e) {
               e.printStackTrace();
           }
       }
        else if (v==vs){
           String ussd_vs= "*"+"123"+encodedHash;
           callIntent.setData(Uri.parse("tel:" + ussd_vs));
           try {
               startActivity(callIntent);
           } catch (Exception e) {
               e.printStackTrace();
           }

       }
       else if (v==vd){
           String ussd_vd= "*"+"123"+encodedHash;
           callIntent.setData(Uri.parse("tel:" + ussd_vd));
           try {
               startActivity(callIntent);
           } catch (Exception e) {
               e.printStackTrace();
           }

       } */

    }



}
