package com.example.analizator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pomiary extends Activity

	// bla bla

{
	protected void onCreate (Bundle sevedInstanceState) {
		
		super.onCreate(sevedInstanceState);
		setContentView(R.layout.activity_pomiary);
	}
	
	
	public void PrzyciskBateryjka(View arg0) {
	Intent intent = new Intent(this, Bateryjka.class);
	startActivity(intent);
		}
	
	public void PrzyciskZbiorczy(View arg0) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	public void PrzyciskGPS(View view) {
		Intent intent = new Intent(this, GPS.class);
		startActivity(intent);
	}
}
