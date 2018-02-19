package com.example.zozo07.book;

import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Point;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        TextView lbl = (TextView) findViewById(R.id.lblFragment1);
        Toast.makeText(getApplicationContext(), lbl.getText(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "In the onCreate() event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "In the onResatart() event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "In the onResume() event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "In the onPause() event");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "In the onStop() event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }

    public void onClickWebBrowser(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.com"));
        startActivity(i);
    }

    public void onClickMakeCalls(View view) {
        Intent i = new Intent(android.content.Intent.ACTION_DIAL, Uri.parse("tel:+36304657841"));
        startActivity(i);
    }

    public void onClickShowMap(View view) {
        Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:47.468381,19.025552"));
        startActivity(i);
    }

    int request_code = 1;

    public void onClickLaunchMyBrowser(View view) {
        //Elindítom az alkalmazást és megadom neki a kért weboldalt is.
        Intent i = new Intent("com.example.zozo07.book.MyBrowserActivity");
        i.setData(Uri.parse("http://www.index.hu"));
        startActivity(i);
    }

    public void onCilckClickMe(View view) {
        Button btnClickMe = (Button) findViewById(R.id.clickMe);
        assert btnClickMe != null;
        btnClickMe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "I love android programming!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
