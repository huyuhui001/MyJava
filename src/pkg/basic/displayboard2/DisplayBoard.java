package pkg.basic.displayboard2;

public class DisplayBoard {
	public int[][] ledMatrix = new int[16][16];

	public DisplayBoard(){
	    //write your code here
		for(int i = 0; i < 16; i++) {
			for(int j = 0; j < 16; j++) {
				ledMatrix[i][j] = 2;
			}
		}
		
		for(int i = 3; i < 13; i++) {
			for(int j = 3; j < 13; j++) {
				ledMatrix[i][j] = 3;
			}
		}

		for(int i = 6; i < 10; i++) {
			for(int j = 6; j < 10; j++) {
				ledMatrix[i][j] = 1;
			}
		}
 
//	    TCPClient.sentToBoard(ledMatrix);
        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 16; j++) {
            	System.out.print(ledMatrix[i][j]);
            }
            System.out.print("\n");
        }
	}

	public static void main(String[] args) {
		new DisplayBoard();
	}	
}


//int[] row0 =  {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//int[] row1 =  {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//int[] row2 =  {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//int[] row3 =  {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row4 =  {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row5 =  {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row6 =  {2,2,2,3,3,3,1,1,1,1,3,3,3,2,2,2};
//int[] row7 =  {2,2,2,3,3,3,1,1,1,1,3,3,3,2,2,2};
//int[] row8 =  {2,2,2,3,3,3,1,1,1,1,3,3,3,2,2,2};
//int[] row9 =  {2,2,2,3,3,3,1,1,1,1,3,3,3,2,2,2};
//int[] row10 = {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row11 = {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row12 = {2,2,2,3,3,3,3,3,3,3,3,3,3,2,2,2};
//int[] row13 = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//int[] row14 = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//int[] row15 = {2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
//
//
//int[][] ledMatrix = {row0, row1, row2, row3, row4, row5, row6, row7, row8, row9,row10,row11,row12,row13,row14,row15};