class Solution {
    public int secondHighest(String s) {
        String d="";
        int c=0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                d+=s.charAt(i);
                c++;
            }
        }  

        if(c<2){
            return -1;
        }

        int arr[] =new int[c];
        for(int i=0;i<c;i++){
            arr[i]=d.charAt(i)-'0';
        }
        
        Arrays.sort(arr);

        int max=arr[c-1];
        int smax=-1;
        int idx=c-2;
        while(idx>=0){
            if(arr[idx]!=max){
                smax=arr[idx];
                break;
            }
            idx--;
        }
        return smax;
    }
}
