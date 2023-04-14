package com.str;

public class Ipadrress 
{
//   static String ipaddress(String address)
//{
//	   char[] chararray = new char[address.length() + (2*3)];
//	   for (int i = 0, j =0; i < chararray.length; i++,j++) {
//		char current = address.charAt(i);
//		if(current=='.')
//		{
//			chararray[j++]= '[';
//			chararray[j++]=current;
//			chararray[j]=']';
//		}
//		else
//		{
//			chararray[j]=current;
//		}
//	}
//	return String.valueOf(chararray);
//}
	 public String defangIPaddr(String address) {
	        int trueLength = address.length();
	        int finalLength = trueLength + 6;
	        char[] output = new char[finalLength];
	        int j = 0;
	        for (int i = 0; i < trueLength; i++) {
	            if (address.charAt(i) != '.') {
	                output[j] = address.charAt(i);
	                j++;
	            } else {
	                output[j] = '[';
	                output[j+1]= '.';
	                output[j+2] = ']';
	                j += 3;
	            }
	        }
	        return new String(output);
	    }
	}
   public static void main(String[] args) {
	String s = "1.1.1";
	System.out.println((s));
}
}
