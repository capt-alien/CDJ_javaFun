public class StringManipulator{
    // Trim and Concat
    public String trimAndConcat(String str1, String str2){
        String a = str1.trim();
        String b = str2.trim();
        String z = a.concat(b);
        return z;
    }
    // Get Index or Null
    public Integer getIndexOrNUll(String str, char n){
        Integer x = str.indexof(n);
        if(x == -1){
            return null;
        } else{
            return x;
        }
    }
    public Integer getIndexOrNull(String strA, String strB){
        Integer x = strA.indexof(strB);
        if(x == -1){
            return null;
        } else{
            return x;
        }
    }
    // Concat Substring
    public String ConcatSubstring(String strA, int x, int y , String strB){
        String a =straA.substring(x);
        String b = strB.substring(y);
        String c = a.concat(b);
        return c; 
    }
}
