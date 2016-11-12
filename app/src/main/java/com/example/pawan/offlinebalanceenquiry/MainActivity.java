package com.example.pawan.offlinebalanceenquiry;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {
    Button vb;
    Button vs;
    Button vd;
    Button ab;
    Button as;
    Button ad;
    Button ib;
    Button is;
    Button id;
    Button bb;
    Button bs;
    Button bd;
    Button db;
    Button ds;
    Button dd;
    Button vcb;
    Button vcs;
    Button vcd;
    Button rb;
    Button rs;
    Button rd;
    Button acb;
    Button acs;
    Button acd;
    ImageButton swap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vd = (Button) findViewById(R.id.vodad);
        vb = (Button) findViewById(R.id.vodab);
        vs = (Button) findViewById(R.id.vodas);
        ad = (Button) findViewById(R.id.aird);
        ab = (Button) findViewById(R.id.airb);
        as = (Button) findViewById(R.id.airs);
        id = (Button) findViewById(R.id.idead);
        ib = (Button) findViewById(R.id.ideab);
        is = (Button) findViewById(R.id.ideas);
        bd = (Button) findViewById(R.id.bsnld);
        bb = (Button) findViewById(R.id.bsnlb);
        bs = (Button) findViewById(R.id.bsnls);
        dd = (Button) findViewById(R.id.docd);
        db = (Button) findViewById(R.id.docb);
        ds = (Button) findViewById(R.id.docs);
        vcd = (Button) findViewById(R.id.vidd);
        vcb = (Button) findViewById(R.id.vidb);
        vcs = (Button) findViewById(R.id.vids);
        rd = (Button) findViewById(R.id.reld);
        rb = (Button) findViewById(R.id.relb);
        rs = (Button) findViewById(R.id.rels);
        acd = (Button) findViewById(R.id.arcld);
        acb = (Button) findViewById(R.id.arclb);
        acs = (Button) findViewById(R.id.arcls);

        swap = (ImageButton) findViewById(R.id.help);


    }
    public void onClick(View v) {

        Intent callIntent = new Intent(Intent.ACTION_CALL);
        String encodedHash = Uri.encode("#");

        //vodafone bttns

        if(v==vd) {
            String ussd_vd = "*"+"141"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_vd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==vb){
            String ussd_vb= "*"+"123"+encodedHash;
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

        //airtel bttns

        else if (v==ad){
            String ussd_ad= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_ad));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==ab){
            String ussd_ab= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_ab));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==as){
            String ussd_as= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_as));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //idea bttns

        else if (v==id){
            String ussd_id= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_id));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==ib){
            String ussd_ib= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_ib));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==is){
            String ussd_is= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_is));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //bsnl bttns

        else if (v==bd){
            String ussd_bd= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_bd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==bb){
            String ussd_bb= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_bb));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==bs){
            String ussd_bs= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_bs));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //docomo bttns

        else if (v==dd){
            String ussd_dd= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_dd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==db){
            String ussd_db= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_db));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==ds){
            String ussd_ds= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_ds));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //videocon bttns

        else if (v==vcd){
            String ussd_vcd= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_vcd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==vcb){
            String ussd_vcb= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_vcb));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==vcs){
            String ussd_vcs= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_vcs));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //reliance bttns

        else if (v==rd){
            String ussd_rd= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_rd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==rb){
            String ussd_rb= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_rb));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==rs){
            String ussd_rs= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_rs));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //Aircel bttns

        else if (v==acd){
            String ussd_acd= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_acd));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==acb){
            String ussd_acb= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_acb));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else if (v==acs){
            String ussd_acs= "*"+"123"+encodedHash;
            callIntent.setData(Uri.parse("tel:" + ussd_acs));
            try {
                startActivity(callIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }






    }

    public void swap(View view){
        startActivityForResult(new Intent(Settings.ACTION_SETTINGS), 0);
    }

    public void help(View v){

            AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("Important Message !!");
        //        alertDialogBuilder.setIcon(R.drawable.help);
                alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");


            AlertDialog alertDialog = alertDialogBuilder.create();
            alertDialog.show();
        }






}
