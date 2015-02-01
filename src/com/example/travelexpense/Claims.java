// Di Meng
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
	
	// used to get the start date of the claim
	public int toStart() {
		return getStart();
	}
	
	// used to get the end date of the claim
	public int toEnd() {
		return getEnd();
	}
	
	// used to get the details of the claim
	public String toDes() {
		return getDes();
	}

}
