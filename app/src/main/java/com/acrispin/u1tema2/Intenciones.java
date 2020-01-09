package com.acrispin.u1tema2;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Intenciones extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intenciones);
    }

    public void web(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://developer.android.com/guide/components/intents-common?hl=es-419"));
        startActivity(intent);
    }

    public void Llamar(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL,
                Uri.parse("tel:952000243"));
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(intent);
    }
    public void maps(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:-18.013739816,-70.2510593169"));
        startActivity(intent);
    }
    public void foto(View view) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        startActivity(intent);
    }
    public void email(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Duda de Android");
        intent.putExtra(Intent.EXTRA_TEXT, "Buen día Ing. Wilson tengo la siguiente duda...");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"nosliwsys@gmail.com"});
        startActivity(intent);
    }
}