package com.example.huub.ball01;

import android.app.Activity;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class balls01 extends Activity {

    public SensorManager sensorManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Sensor shit
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

        setContentView(new GamePanel(this, sensorManager));

    }


}
