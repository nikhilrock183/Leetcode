import java.util.List;
import java.util.ArrayList;
public class LC118  {
    public static void main(String[] args) {
        System.out.println(pascal(5));

    }
    static List<List<Integer>> pascal(int numRows) {

        List<List<Integer>> rowArray=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>colArray=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    colArray.add(1);
                }
                else{
                    colArray.add(j,rowArray.get(i-1).get(j-1)+rowArray.get(i-1).get(j));
                }

        }
            rowArray.add(colArray);

    }
return rowArray;
    }
}
