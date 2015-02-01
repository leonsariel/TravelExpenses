// Di Meng
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


	public void addClaims(String string, int s, int e, String string2) {
		// TODO Auto-generated method stub
		
	}
}
