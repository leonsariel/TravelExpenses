// Di Meng
package com.example.travelexpense;

import java.util.ArrayList;
import java.util.Collection;


import java.util.Collections;




import android.annotation.SuppressLint;
//import ca.ualberta.cs.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
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
     
     listView.setOnItemLongClickListener(new OnItemLongClickListener() {
    	 public boolean onItemLongClick(AdapterView<?> adapterView,View view, int position , long id){
    		 Toast.makeText(MainActivity.this,"Delete"+ list.get(position).toString(), Toast.LENGTH_SHORT).show();
    		 return false;
    	 }
	});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void add_Claim_Click(View v){
		Button add_button = (Button) findViewById(R.id.add_Claim_Button); 
		
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
		final TextView nameTextView = (TextView)findViewById(R.id.Add_ClaimText);
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
