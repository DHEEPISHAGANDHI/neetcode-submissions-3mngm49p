class Solution {
    public int maxAreaOfIsland(int[][] grid) {
     int m = grid.length; //row length
       int n=grid[0].length; //column length
       int max=0;
       boolean[][] visited=new boolean[m][n];
       for(int i=0;i<m;i++)
       {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]==1||!visited[i][j])
            {
                max=Math.max(max,dfs(grid,visited,i,j));
         
            }
        }

       }
       return max;
    }
    public int dfs(int[][] grid,boolean[][] visited,int i,int j)
    {
       int m = grid.length; //row length
       int n=grid[0].length; //column length

        if(i<0||j<0||i>=m||j>=n||grid[i][j] == 0||visited[i][j])
        {
            return 0;
        }
        visited[i][j]=true;
       return 1+dfs(grid,visited,i+1,j) + dfs(grid,visited,i-1,j) +dfs(grid,visited,i,j+1) +dfs(grid,visited,i,j-1);
    }
}
