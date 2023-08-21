import java.util.ArrayList;

class BeautifulArray {
    public static void main(String[] args) {
      beautifulArray(5);
    }

    public static void beautifulArray(int n) {
        ArrayList<Integer> answer=new ArrayList<>();
        for(int element: answer){
            System.out.println(element);
        }
        // while(answer.size()<n){
        //     ArrayList<Integer> temp=new ArrayList<>();
        //             for(int element:answer)
        //                 if(2*element-1<=n)
        //                     temp.add(element*2-1);
            
        //             for(int element:answer)
        //                 if(2*element<=n)
        //                     temp.add(element*2);
                    
		// 			//in different loops because we want to maintain order
        //     answer=temp;
        // }
        // return answer.stream().mapToInt(i -> i).toArray();
    }
}
