package pkg.basic.displayboard1;

public class DisplayBoard {
	public int[][] ledMatrix;

	public DisplayBoard(){
	    // write your code here
		ledMatrix = new int[16][16];

        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 16; j++) {
                ledMatrix[i][j] = 0;
            }
        }
        
        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 16; j++) {
                if(i == j) {
                    ledMatrix[i][j] = 2;
                }
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
