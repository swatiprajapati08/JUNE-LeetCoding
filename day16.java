class Solution {
    public String validIPAddress(String IP) {
        
        if (IP == null || IP.length() == 0)
			return "Neither";
		if (checkIP4(IP))
			return "IPv4";
		if (checkIP6(IP)) 
			return "IPv6";
		return "Neither";
	}
 
	public boolean checkIP4(String IP) {
		if (IP.charAt(IP.length() - 1) == '.')    
			return false;
		String[] numbers = IP.split("\\.");       
		if (numbers == null || numbers.length != 4)  
			return false;
		for (String str : numbers) {
			if (str.length() == 0 || str.length() > 3)   
				return false;
			if (str.length() > 1 && str.charAt(0) == '0') 
				return false;
			int val = 0;
			for (int i = 0; i < str.length(); i++) { 
				char c = str.charAt(i);
				if (c < '0' || c > '9')
					return false;
				val = val * 10 + (int) (c - '0');
			}
 
			if (val < 0 || val > 255) 
				return false;
		}
		return true;
	}
 
	public boolean checkIP6(String IP) {
		if (IP.charAt(IP.length() - 1) == ':') 
			return false;
		String[] numbers = IP.split(":");
		if (numbers == null || numbers.length != 8) 
			return false;
		for (String str : numbers) {
			if (str.length() == 0 || str.length() > 4)  
				return false;
			int i = 0;
			while (i < str.length()) {
				char c = str.charAt(i++);
				if ((c < '0' || c > '9') && (c < 'a' || c > 'f') && (c < 'A' || c > 'F')) 
					return false;
			}
		}
		return true;

    }
}
