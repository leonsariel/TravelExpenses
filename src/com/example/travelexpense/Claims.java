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

//modfied by Abram Hindle's video https://www.youtube.com/watch?v=7zKCuqScaRE	
package com.example.travelexpense;
import java.util.Date;

public class Claims {
	protected String name;
	protected int startDate;
	protected int endDate;
	protected String des;
	
	public void claims(String name,int start,int end,String des){
		this.name = name;
		this.startDate = start;
		this.endDate = end;
		this.des = des;
		
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getStart()
	{
		return this.startDate;
	}
	
	public int getEnd(){
		return this.endDate;
	}
	
	public String getDes(){
		return this.des;
	}
	
	public String toString() {
		return getName();
	}
	

	public int toStart() {
		return getStart();
	}
	
	public int toEnd() {
		return getEnd();
	}

	public String toDes() {
		return getDes();
	}

}
