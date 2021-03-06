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



//code is modified based on Abram Hindle's tutorial https://www.youtube.com/watch?v=7zKCuqScaRE


public class ClaimList {
	protected ArrayList<Claims> claimsList;
	protected ArrayList<Listener> listeners;
	
	public ClaimList(){
		claimsList = new ArrayList<Claims>();
		listeners = new ArrayList<Listener>();
	}
	
	
	public Collection<Claims> getClaims(){
		return claimsList;
	}
	
	public void addClaims(Claims x){
		claimsList.add(x);
		notifyListeners();
	}
	

	public void deleteClaims(Claims y){
		claimsList.remove(y);
		notifyListeners();
	}
	
	public int size(){
		return claimsList.size();
	}
	
	public boolean contains(Claims test){
		return claimsList.contains(test);
	}
	

// Methods for listeners copy by Abram Hindle's video https://www.youtube.com/watch?v=7zKCuqScaRE	
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


	public void addClaims(String string, int s, int e, String string2) {
		// TODO Auto-generated method stub
		
	}
}
