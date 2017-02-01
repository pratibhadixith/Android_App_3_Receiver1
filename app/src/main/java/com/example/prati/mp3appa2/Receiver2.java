package com.example.prati.mp3appa2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by prati on 10/23/2016.
 */

public class Receiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "Restaurant Intent Detected !", Toast.LENGTH_LONG).show();
        }

}
