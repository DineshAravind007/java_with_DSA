// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class FreqOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        String str = "programming";
        
        for(int i=0;i<str.length()-1;i++)
        {
            char ch = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }
        
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
        
        
    }
}