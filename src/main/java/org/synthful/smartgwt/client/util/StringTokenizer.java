package org.synthful.smartgwt.client.util;

import java.util.ArrayList;
import java.util.Collection;

public class StringTokenizer {
	
	private String[] tokens;

	public StringTokenizer(String str, String delim) {
		Collection<String> lstTokens = new ArrayList<String>();
		
		int start = 0;
		int end = 0;
		while(end < str.length()) {
			end = str.indexOf(delim, start);
			if(end == -1) {
				end = str.length();
			}
			
			String token = str.substring(start, end);
			lstTokens.add(token);
			start = end + delim.length();
		}
		tokens = lstTokens.toArray(new String[0]);
	}
	
	public String[] getTokens() {
		return tokens;
	}
	
}
