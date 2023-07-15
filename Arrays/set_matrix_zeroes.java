//microsoft

class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> a=new HashSet<>();
         Set<Integer> b=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    a.add(i);
                    b.add(j);
                }
            }
            
        }
         for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(a.contains(i) || b.contains(j))
                {
                   matrix[i][j]=0; 
                }
            }            
        }        
    }
}
