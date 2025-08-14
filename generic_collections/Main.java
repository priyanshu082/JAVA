package generic_collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //collection
        //list,map,set 
        List<String> myList= new ArrayList<>();
        myList.add("eihehheidie");

        Map<String,String> mpp=new HashMap<>();
        mpp.put("hello","aijaisj");


        Set<String> st=new HashSet<>();
        st.add("hello");
        System.out.println(st.contains("helo"));
    }
}
