
class Solution {

    private boolean dfs(int[][] arr,int row,int col){

         int n=arr.length;
         int m=arr[0].length;

         if(row>=n || row <0 || col>=m || col<0)return false;

        if (arr[row][col] == 1) {
            return true;
        }

         arr[row][col]=1;
         boolean up=dfs(arr,row-1,col);
         boolean down=dfs(arr,row+1,col);
         boolean left=dfs(arr,row,col-1);
         boolean right=dfs(arr,row,col+1);

         return up&& down && left && right;
    }


    public int closedIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=grid[i][j];
            }
        }

        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    if(dfs(arr,i,j))cnt++;
                  
                }
            }
        }
   
       return cnt;

    }
}