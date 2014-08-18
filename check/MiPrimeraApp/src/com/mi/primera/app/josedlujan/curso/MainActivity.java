package com.mi.primera.app.josedlujan.curso;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{
	TextView textview;
	Button boton;
	CheckBox ch1,ch2;

	
    @Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		textview = (TextView) findViewById(R.id.textview);
		boton= (Button) findViewById(R.id.boton);
		ch1 = (CheckBox) findViewById(R.id.chk1);
		ch2 = (CheckBox) findViewById(R.id.chk2);
	
		boton.setOnClickListener(this);
	
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.boton:
			
			if(ch1.isChecked()==true){
				textview.setText("Buenos dias Joven");
			}
			if(ch2.isChecked()==true){
				textview.setText("Buenos dias Lady");
			}
			
			break;

		default:
			break;
		}
	}


	
	

}
