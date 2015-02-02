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

public class ItemList {
	
	protected ArrayList<Items> ItemsList = null;
	protected ArrayList<Listener> listeners;
	
	public ItemList(){
		ItemsList = new ArrayList<Items>();
		listeners = new ArrayList<Listener>();
	}
	
	
	public Collection<Items> getItems(){
		return ItemsList;
	}
	
	public void addItems(Items x){
		ItemsList.add(x);
		notifyListeners();
	}
	

	public void deleteItems(Items y){
		ItemsList.remove(y);
		notifyListeners();
	}
	
	public int size(){
		return ItemsList.size();
	}
	
	public boolean contains(Items test){
		return ItemsList.contains(test);
	}
	

// Methods for listeners
	private void notifyListeners() {
		for (Listener listener: listeners){
			listener.update();
		}
	}

	
	public void addListener(Listener test){
		listeners.add(test);
	}
	
	public void deleteListener(Listener test){
		listeners.remove(test);
	}

}
