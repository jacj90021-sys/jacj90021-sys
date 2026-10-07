package com.cmaster.cloner;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.HashMap;

/* compiled from: r8-map-id-b6a76c1f47a189ff549f65e3bd043bd70b1794641f7a8effd31f0ac437af7687 */
/* loaded from: classes.dex */
public final class im1 implements SensorEventListener {
    public static final String OooO0OO = sn2.OooO00o("eyCzv121WiNaN7uCV6lSI0A3\n", "L0XezzjHO1c=\n");
    public final HashMap OooO00o = new HashMap();
    public final SensorManager OooO0O0;

    public im1(Activity activity) {
        SensorManager sensorManager = (SensorManager) activity.getSystemService(sn2.OooO00o("c1uuepKL\n", "AD7ACf35MgE=\n"));
        this.OooO0O0 = sensorManager;
        for (Sensor sensor : sensorManager.getSensorList(-1)) {
            if (sensor.getName().toLowerCase().contains(sn2.OooO00o("FZe/DUSA630UgLc=\n", "YfLSfSHyigk=\n"))) {
                this.OooO0O0.registerListener(this, sensor, 3);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.OooO00o.put(sensorEvent.sensor.getName(), Float.valueOf(sensorEvent.values[0]));
    }
}
