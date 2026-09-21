class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0; i<nums1.length; i++){
            for(int j=0; j<nums2.length; j++){
                nums1[m+j]= nums2[j];
            }
        }

        Arrays.sort(nums1);
        
    }
}