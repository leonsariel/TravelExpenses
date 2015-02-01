// Di Meng
package com.example.travelexpense;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ListExpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_expense);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.list_expense, menu);
		return true;
	}
	
	// Button click method that go back to MainActivity
	public void back_to_main(View v){
		Button back_button = (Button) findViewById(R.id.back_to_main); 
		Toast.makeText(this, "go back to main", Toast.LENGTH_SHORT).show();
		back_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// button try to go back to MainActivity				
				startActivity(new Intent(v.getContext(),MainActivity.class));
			}
		
		});
	}
	
	
	
	public void addExpenseAction(View v){
		
	}
}
