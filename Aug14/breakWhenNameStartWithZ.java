package Aug14;
//Develop a program that iterates through a list of names. If a name starts with 'Z', use break to stop processing further names.

import java.util.ArrayList;
import java.util.List;

public class breakWhenNameStartWithZ {
    public static void main(String[] args) {
        
        List<String> names = new ArrayList<>();

        names.add("Ganesh");
        names.add("Monica");
        names.add("Bob");
        names.add("Zeehan");
        names.add("Ross");

        //String name;

        for(String name : names){
            System.out.println(name);
            if(name.charAt(0) == 'Z'){
                break;
            }
        }

    }
    
}
