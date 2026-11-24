class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target ) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
         sol(candidates, target, 0, l2, l);

         return l;
        
    }

    public void sol(int[] candidates, int target, int i, List<Integer> l2, List<List<Integer>> l){

        if(i==candidates.length){
            return;
        }
        if(target==0){
            l.add(new ArrayList<>(l2));
            return;
        }
        int ans = 0;
        if(candidates[i]<=target){
            l2.add(candidates[i]);
            sol(candidates, target-candidates[i], i, l2, l);

           l2.remove(l2.size()-1);
        }

        sol(candidates, target, i+1, l2,l );
    }
}