class Solution { 
    static boolean issafe(int rowid , int cidx,int n , char[][] brd){ 
        
        int row = rowid; 
        int col = cidx; 
        while(col>=0){ 
            if(brd[row][col]=='Q'){ 
                return false; 
            } 
            col--; 
        } 
       
        row = rowid; 
        col = cidx; 
        while(row>=0 && col>=0){ 
            if(brd[row][col]=='Q'){ 
                return false; 
            } 
            row=row-1; 
            col=col-1; 
        } 
       
        row = rowid; 
        col = cidx;
        while(row<n && col>=0){ 
            if(brd[row][col]=='Q'){ 
                return false; 
            } 
            row=row+1; 
            col=col-1; 
        } 
        return true; 
    } 

    static void solve(char[][] brd, int n, int cidx, List<List<String>> ans){ 
        if(cidx>=n){ 
            List<String> tem = new ArrayList<>(); 
            for(int i=0; i<n; i++){ 
                tem.add(new String(brd[i])); 
            } 
            ans.add(tem); 
            return; 
        } 
        for(int rowid =0; rowid<n; rowid++){ 
            if(issafe(rowid ,cidx, n, brd)){ 
                brd[rowid][cidx] = 'Q'; 
                solve(brd,n,cidx+1,ans); 
                brd[rowid][cidx]= '.'; 
            } 
        } 
    } 

    public List<List<String>> solveNQueens(int n) { 
        char[][] brd = new char[n][n]; 
        for(int i = 0; i<n; i++){ 
            Arrays.fill(brd[i],'.'); 
        }
        int cidx = 0; 
        List<List<String>> ans = new ArrayList<>(); 
        solve(brd,n,cidx,ans); 
        return ans; 
    } 
}
