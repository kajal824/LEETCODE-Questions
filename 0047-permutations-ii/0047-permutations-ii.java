class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        solve(nums, 0);
       return removeDuplicates(ans);
    }

    public void solve(int[] nums, int idx) {
        if (idx == nums.length) {
            List<Integer> l = new ArrayList<>();
            for (int a : nums) {
                l.add(a);
            }
            ans.add(l);
            return;
        }

        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            solve(nums, idx + 1);
            swap(nums, i, idx);
        }
    }

    public void swap(int[] nums, int i, int j) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    public List<List<Integer>> removeDuplicates(List<List<Integer>> list) {
        Set<List<Integer>> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
