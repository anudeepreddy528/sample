package Arrays;

import java.util.HashSet;
import java.util.Set;

public class sudoko {

	public static void main(String[] args) {
	    char board[][] = new char[][]{ 
	    		{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
	    		{ '6', '.', '3', '1', '9', '5', '.', '.', '.' }, 
	    		{ '.', '9', '8', '.', '.', '.', '.', '6', '.' }, 
	    		{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, 
	    		{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
	    		{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, 
	    		{ '.', '6', '.', '.', '.', '.', '2', '8', '.' }, 
	    		{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, 
	    		{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }
	    	}; 
	    	boolean res = validSudoko(board);
	    	System.out.println("Is valid Sudoko :"+res);

	}

	static boolean validSudoko(char[][] board) {
		
		for(int i=0; i < board.length; i++) 
		{
			int rowitr=0,colitr=0;
			Set<Character> row  = new HashSet<Character>();
			Set<Character> col  = new HashSet<Character>();
			Set<Character> grid = new HashSet<Character>();
			for(int j = 0 ; j < board.length ; j++) 
			{
				//row checking
				if(board[i][j] == '.')
				{
					continue;
				}
				if(row.contains(board[i][j]))
					return false;
				else
					row.add(board[i][j]);
				//column checking
				if(board[j][i] == '.')
				{
					continue;
				}
				if(col.contains(board[j][i]))
					return false;
				else
					col.add(board[j][i]);
				
				if(i%3 == 0 && j%3 == 0) {
					

					for(int temp1 = i; temp1<i+3; temp1++) {
						for(int temp2 = j ;temp2 <j+3 ;temp2++) {
							if(board[temp1][temp2] == '.')
							{
								continue;
							}
							if(grid.contains(board[temp1][temp2]))
								return false;
							else
								grid.add(board[temp1][temp2]);
						}
					}
				}
				grid.clear();
			}	
			row.clear();
			col.clear();
		}
	return true;
	}
}
