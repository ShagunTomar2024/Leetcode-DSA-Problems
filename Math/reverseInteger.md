class Solution {
    public int reverse(int x) {
        int temp=x;
        int s=0;
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        while(temp!=0){
            int r=temp%10;
            if((s>(max/10))||( s==(Integer.MAX_VALUE/10) && r>7)){ 
                return 0;}
            if((s<(min/10))||(s==(Integer.MIN_VALUE/10) && r<-8)){ 
                return 0;}
            s=(s*10)+r;
            temp/=10;
        }
        return s;
    }
}
