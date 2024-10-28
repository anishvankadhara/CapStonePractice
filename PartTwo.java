public class PartTwo{
	public static void main(String[] args){
		PartTwo x = new PartTwo();
		int[][] arr = {{1,1,3},{1,2,3}};
		System.out.println(x.analyze2DArray(arr));
	}
	public int analyze2DArray(int[][] arr){
		for(int i=0 ;i< arr.length; i++){
			for(int j=0; j<arr[0].length; j++){
				if(arr[i][j]%2==0)
					return arr[i][j];
			}
		}
		return -1;
	}
}