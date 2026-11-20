class Solution {
    public List<Integer> lexicalOrder(int n) { 

        List<Integer> l = new ArrayList<>();

        for(int i=1; i<=9; i++){
            solve(n,i,l);
        }

        return l; 

        
        
    }

    public void solve(int n , int cur, List<Integer> l  ){
        if(cur>n){
            return;
        }
        l.add(cur);

        for(int i=0; i<=9; i++){
            solve(n, cur*10+i,l );
        }
    }
}