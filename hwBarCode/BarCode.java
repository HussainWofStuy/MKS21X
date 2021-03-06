public class BarCode{
    final String[] c = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    // instance variables
    private String _zip;
    private int _checkDigit;
    
    public BarCode(String zip) {
	try{
	    if(zip.length()<5){
		throw new IllegalArgumentException("Make sure the length of the zip is exactly 5");
	    }
	    Integer.parseInt(zip);
	}catch(NumberFormatException e){
	    throw new NumberFormatException("Please make sure all the characters in the zip are integers");
	}
	_zip = zip;
	_checkDigit = checkSum();
    }
    
    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }
    
    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum = 0;
	for(int x = 0; x < 5; x++){
	    sum += Integer.parseInt(_zip.substring(x,x+1));
	}
	return sum%10;
    }
    
    //postcondition: format zip + check digit + barcode
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
    public String toString(){
	String ans = _zip + "      |";
	for(int x = 0; x < _zip.length(); x++){
	    ans += c[Integer.parseInt(_zip.substring(x,x+1))];
	}
	ans += c[checkSum()] + "|";
	return ans;
    }
    
    public boolean equals(Object other){
	return this == other || other instanceof BarCode && _zip.equals(((BarCode)other)._zip);
    }
    // postcondition: false if the object is not a BarCode,
    // false if it is a non-matching barcode
    // true when they match.
    
    
    public int compareTo(Comparable other){
	return -1;
    }
    // postcondition: compares the zip + checkdigit
    
}
