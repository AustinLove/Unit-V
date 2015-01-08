
import java.util.ArrayList;


public class PeopleList {

    public static void main(String[] args) {
        ArrayList ppl = new ArrayList();
        person p = new person("Bob",32); 
        ppl.add(p);
        ppl.add(new person("John", 25));
        ppl.add(0,new person("Cindy", 7));
        for(int x=0;x<ppl.size();x++){
            p = (person)ppl.get(x);
            System.out.println(p);
        }
        ppl.remove(1);
        for(int x=0;x<ppl.size();x++){
            p = (person)ppl.get(x);
            System.out.println(p);
        }
    }
    
}
