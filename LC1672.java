public class LC1672 {
    public static void main(String[] args) {

    }
    public int maximumwealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            //when you start a new col take a new sumof that row
            int sum=0;
            for(int account=0;account<accounts[person].length;person++){
                sum+=accounts[person][account];

            }
            //now we have sum of person
            //check with overall ans
            if (sum > ans) {

                ans=sum;
            }
        }
        return ans;
    }
}
