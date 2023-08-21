class Solution {
    public int mySqrt(int x) {
        
        int l=0;
        int h=x;
        double root=0.0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(m*m==x){
                return m;
            }
            else if(x>m*m){
                l=m+1;
            }
            else {
                h=m-1;
            }
        } 
        double incr=0.1;
        for(int i=0;i<=3;i++){
            while(root*root<=x){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }

        return (int)root;
    }
}