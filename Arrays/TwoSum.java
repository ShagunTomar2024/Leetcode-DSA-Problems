//problem=Two Sum
//Approach=Two-Pointer-Approach
//Time-Complexity=O(nlogn)
//Space-Complexity=O(n)
//Problem-No=1

class Solution {
    public int[] twoSum(int[] nums, int target) {
       int n=nums.length; 
       int l=0,r=n-1;
       int arr1[]=new int [n];
      Arrays.sort(nums);
       while(l<r){
        if(arr1[l]+arr1[r]==target){
            l=arr1[l];
            r=arr1[r];
            break;
        }else if(arr1[l]+arr1[r]>target){
            r--;
        }else{
            l++;
        }
       }
       int arr[]=new int[2];
       int j=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==l||nums[i]==r){
            arr[j++]=i;
        }
       }
       return arr;
    }
}
