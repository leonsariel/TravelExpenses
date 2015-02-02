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


public class ItemController {
	private static ItemList Itemlist = null;
	
	static public ItemList getItemList(){
		if (Itemlist ==null){
			Itemlist = new ItemList();
		}
		return Itemlist;
	}
	
	public void addItem(Items Item){
		getItemList().addItems(Item);
	}
	
}
