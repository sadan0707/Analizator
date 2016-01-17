package com.example.analizator;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

/**
 * Created by Surykatka on 2016-01-08.
 */
public class GPS_MAPA extends MapActivity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps_mapa);

        MapView mapa_gps = (MapView)findViewById(R.id.mapView);
        mapa_gps.setBuiltInZoomControls(true);
    }
    protected boolean isRouteDisplayed() {
        return false;
    }
}
