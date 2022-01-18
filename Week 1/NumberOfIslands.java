class Solution {
    public int numIslands(char[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int cc = 0;
        for(int i = 0; i<grid.length; i++) {
            for(int j = 0; j<grid[0].length; j++) {
                if(grid[i][j]=='1' && visited[i][j]==false) {
                    getConnectedCompoments(i, j, visited, grid);
                    cc++;
                }
            }
        }
        return cc;
    }
    private void getConnectedCompoments(int i, int j, boolean visited[][], char grid[][]) {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || visited[i][j]==true) {
            return;
        }
        visited[i][j] = true;
        getConnectedCompoments(i+1, j, visited, grid); // t
        getConnectedCompoments(i, j+1, visited, grid); // l
        getConnectedCompoments(i-1, j, visited, grid); // d
        getConnectedCompoments(i, j-1, visited, grid); // r
    }
}