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

import java.util.ArrayList;
import java.util.Collection;


import java.util.Collections;









import android.annotation.SuppressLint;
//import ca.ualberta.cs.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
//modfied by Abram Hindle's video https://www.youtube.com/watch?v=7zKCuqScaRE	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		set();
	}
	
	public void set(){
	 ListView listView = (ListView) findViewById(R.id.cliam_listView);
     Collection<Claims> claims = ClaimListController.getClaimList().getClaims();
   

     final ArrayList<Claims> list = new ArrayList<Claims>(claims);
     final ArrayAdapter<Claims> claimAdapter = new ArrayAdapter<Claims>(this, android.R.layout.simple_list_item_1, list);
     listView.setAdapter(claimAdapter);
     

     ClaimListController.getClaimList().addListener(new Listener() {
     	public void update() {
     		list.clear();
     		Collection<Claims> claims = ClaimListController.getClaimList().getClaims();
     		list.addAll(claims);
     		claimAdapter.notifyDataSetChanged();
     	}
     });
     
     
//     modified base on  Abram Hindle's video https://www.youtube.com/watch?v=7zKCuqScaRE
     listView.setOnItemLongClickListener(new OnItemLongClickListener() {
    	 public boolean onItemLongClick(AdapterView<?> adapterView,View view, int position , long id){
    		 AlertDialog.Builder abd = new AlertDialog.Builder(MainActivity.this);
    		 abd.setMessage("Delete?");
    		 abd.setCancelable(true);
    		 
    		 final int finalPosition = position;
    		 abd.setPositiveButton("Delete", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Claims claim = list.get(finalPosition);
		    		ClaimListController.getClaimList().deleteClaims(claim);
					
				}
			} );
    		 
    		 
    		 abd.setNegativeButton("Cancel", new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					
				}
			});
    		abd.show();
    		 return true;
    	 }
	});
	
	
	
	listView.setOnItemClickListener(new OnItemClickListener(){


		@Override
		public void onItemClick(AdapterView<?> adapterView, View view, int position,
				long id) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(MainActivity.this,ListExpenseActivity.class);
			startActivity(intent);
			}
		});
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void add_Claim_Click(View v){
		Button add_button = (Button) findViewById(R.id.add_item_Button); 
		
		//Toast.makeText(this, "add a claim", Toast.LENGTH_SHORT).show();
		add_button.setOnClickListener(new View.OnClickListener() {
			
			@SuppressLint("NewApi")
			@Override
			public void onClick(View v) {
				startActivity(new Intent(v.getContext(),AddClaimActivity.class));
				pass_name();
			}
		
		});
	}
	
	//use bundle pass the name in text into AddClaimActivity
	public void pass_name(){
		final TextView nameTextView = (TextView)findViewById(R.id.Add_ItemText);
		// pass name to add_claim_activity
		String name = nameTextView.getText().toString();
		Bundle k = new Bundle();
		k.putString("key", name);
		Intent a = new Intent(MainActivity.this, AddClaimActivity.class);
		a.putExtras(k);
		startActivity(a);
	}
	
	
	
	
	public void editClaims(MenuItem Menu){
		Toast.makeText(this, "edit expenses£¡", Toast.LENGTH_SHORT).show();
		Intent intent = new Intent(MainActivity.this,ListExpenseActivity.class);
		startActivity(intent);
		
	}
	
	
	
	
	
	
	
	
	
	
}
