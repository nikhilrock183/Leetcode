//cyclic sort quesion

public class LC268 {
    public static void main(String[] args) {
        int [] arr={4,0,2,1};
        missingnumber(arr);

    }



    static int missingnumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else{i++;
        }
            for(int index=0;index<arr.length;index++){
                if(arr[correct]!=index){
                    return index;
                }
            }
    }


      return arr[i];
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
}
