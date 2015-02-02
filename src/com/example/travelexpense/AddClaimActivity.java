/*
    TravelExpense App
    
    Copyright (C) 2015 Di Meng dmeng@ualberta.ca
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.
    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.
    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.example.travelexpense;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AddClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_claim);
		
		Bundle got = getIntent().getExtras();
		String name = got.getString("key");
		
		TextView claimNameView = (TextView)findViewById(R.id.claim_name);
		
		claimNameView.setText(name);
		
		addAction();
	}
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_claim, menu);
		return true;
	}
	
	public void addAction(){
		Button add_button = (Button) findViewById(R.id.addButton);
		
		add_button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				ClaimListController test_con = new ClaimListController();
				
				ClaimList testlist = new ClaimList();
				EditText name = (EditText) findViewById(R.id.claim_name);
				EditText start = (EditText) findViewById(R.id.startDate);
				EditText end = (EditText) findViewById(R.id.endDate);
				EditText des = (EditText) findViewById(R.id.des);
				
				//convert the start date to integer
				String string1 = start.getText().toString();
				int s = new Integer(string1).intValue();
				// convert the end date to integer
				String string2 = start.getText().toString();
				int e = new Integer(string2).intValue();
				
				Claims test1 = new Claims();
				test1.name = name.getText().toString();
				test1.startDate = s;
				test1.endDate = e;
				test1.des = des.getText().toString();
				
				testlist.addClaims(test1);
				test_con.addClaim(test1);
				
				//add new claim
				//test.addClaims(name.getText().toString(),s,e, des.getText().toString());
				// button try to go back to MainActivity				
				startActivity(new Intent(AddClaimActivity.this,MainActivity.class));
			}
		
		});
	}
	
	
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
