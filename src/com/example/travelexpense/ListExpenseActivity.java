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

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ListExpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_expense);
		addItem();
		setList2();
	}
	
	private void addItem() {
		// add item details 
		
		Button add_button = (Button) findViewById(R.id.add_item_Button);
		add_button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				ItemController test_con = new ItemController();
				ItemList testlist = new ItemList();
				EditText name = (EditText) findViewById(R.id.Add_ItemText);
				EditText start = (EditText) findViewById(R.id.editDate);
				EditText cat = (EditText) findViewById(R.id.editCat);
				EditText des = (EditText) findViewById(R.id.edit_Describtion);
				EditText cur = (EditText) findViewById(R.id.eidt_cur);
				EditText cost = (EditText) findViewById(R.id.edit_cost);
				
				Items test1 = new Items();
				test1.name = name.getText().toString();
				test1.des = name.getText().toString();
				test1.cur = cur.getText().toString();
				test1.des = des.getText().toString();
				test1.start = start.getText().toString();
				test1.cat = cat.getText().toString();
				
				
				testlist.addItems(test1);
				
				
			}
		
		});
	}

	private void setList2(){
		 ListView listView = (ListView) findViewById(R.id.listItem);
	     final Collection<Items> items = ItemController.getItemList().getItems();
	   

	     final ArrayList<Items> list = new ArrayList<Items>(items);
	     final ArrayAdapter<Items> itemAdapter = new ArrayAdapter<Items>(this, android.R.layout.simple_list_item_1, list);
	     listView.setAdapter(itemAdapter);
	     

	     ItemController.getItemList().addListener(new Listener() {
	     	public void update() {
	     		list.clear();
	     		Collection<Items> items = ItemController.getItemList().getItems();
	     		list.addAll(items);
	     		itemAdapter.notifyDataSetChanged();
	     	}
	     });
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
	
	
	
	
}
