package com.example.androidserviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.midi.MidiManager;
import android.os.IBinder;
import android.provider.MediaStore;
import android.provider.Settings;

import androidx.annotation.Nullable;

public class MyService extends Service {

    private MediaPlayer player;

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }


    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this, Settings.System.DEFAULT_RINGTONE_URI);
        player.setLooping(true);
        player.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}









