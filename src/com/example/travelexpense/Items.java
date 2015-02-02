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


public class Items {
	protected String name;
	protected String start;
	protected String des;
	protected int cost;
	protected String cat;
	protected String cur;
	
	public Items(){
		this.name = name;
		this.start= start;
		this.des = des;
		this.cost = (int) cost;
		this.cat = cat;
		this.cur = cur;
		
		
	}
	

	public String getName(){
		return this.name;
	}
	
	public String getStart()
	{
		return this.start;
	}
	
	public String getCat() {
		return this.cat;
	}

	public String getCur() {
		return this.cur;
	}
	
	public float getCost() {
		return this.cost;
	}
	
	public String getDes(){
		return this.des;
	}
	
	public String toString() {
		return getName();
	}
	
	public String toStart() {
		return getStart();
	}
	


	public String toDes() {
		return getDes();
	}
	
	public String toCat(){
		return getCat();
	}
	
	public float toCost() {
		return getCost();
	}
	
	public String toCur() {
		return getCur();
	}

}