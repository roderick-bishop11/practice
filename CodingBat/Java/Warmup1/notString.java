/*

Given a string, return a new string where "not " has been added to the front. 
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.

*/

public String notString(String str) {
  if(str.length()<3) {
  return "not " +str;
  }
  else{
     if(str.substring(0,3).equals("not"))
  return str;
  }
return "not " + str;
} 
