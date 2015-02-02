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
import java.io.IOException;

public class ClaimListController {
	private static ClaimList claimlist = null;
	
	static public ClaimList getClaimList(){
		if (claimlist ==null){
			claimlist = new ClaimList();
		}
		return claimlist;
	}
	
	public void addClaim(Claims claim){
		getClaimList().addClaims(claim);
	}
	
}
