// Shakyo_001_Android_Camera2Basic


package com.example.android.camera2basic;

import android.app.Activity;
import android.on.Bundle;

public class CameraActivity extend Activity{

	@override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camea);
		if(null == savedInstanceState){
			getFragmentManager().beginTransacion()
				.replace(R.id.container, Camera2BasicFragment.newInstance())
				.commit();
		}
	}

}
