class Solution {
      public static void swap(int a,int b){
            int swap=a;
            a=b;
            b=swap;
        }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<i;j++){
                int swap=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=swap;
    
            }
        }
        for(int[] row:matrix){
            int left=0,right=row.length-1;
        while(left<right){
            int temp=row[left];
            row[left]=row[right];
            row[right]=temp;
            left++;
            right--;
        }
     }
    
    }
}
