package exercise.exercise3;
import java.util.Comparator;
/**
 * Created by user on 7/1/2016.
 */
public class MyComparator implements Comparator<String> {


    public int compare(String e1, String e2) {
        if(e1.length() > e2.length()){
            return 1;
        } else {
            return -1;
        }
    }
}
