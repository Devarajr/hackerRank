import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReoccuringWords {
    
    private static void seenBefore(String input){
        //ArrayList <String> al = new ArrayList<String>();
        ArrayList<String> al= new ArrayList<String>();
        
        al = (ArrayList<String>) Arrays.asList(input.split(" "));
        
        int i = 0 , size = al.size();
        
        Set<String> s = new HashSet<String>();
    
        for(i = 0 ; i < size ; i ++){
            
            if ( i == 0 ){
                s.add(al.get(i)); // first element is added without any check.
                
            }else{
                if (s.contains(al.get(i))) {
                	
                }
            }
            
        }
    }

    public static void main(String[] args) {
        seenBefore("Badger Badger Badger Badger Mushroom Mushroom Snake");
    }
}