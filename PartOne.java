public class PartOne{
	public static void main(String[] args){
		PartOne x = new PartOne();
		int[][] array = x.fillSquareArray(3);
	}
	public int[][] fillSquareArray(int size){
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				arr[i][j] = (int)(Math.random()*10)+1;
			}
		}
		return arr;
	}
}