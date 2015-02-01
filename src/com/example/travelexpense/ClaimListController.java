// Di Meng
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
