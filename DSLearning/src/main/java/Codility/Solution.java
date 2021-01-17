package Codility;

import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		//Scanner scanner = new Scanner(System.in);
		
		//int rotation = scanner.nextInt();
		
		String input = "\"abcde#fghij#klmno#pqrst#uvwxy\"";
		
		//String[] inputArray = scanner.nextLine().replace("\"", "").split("#");
		String[] inputArray = input.replace("\"", "").split("#");
		
		int rotation = 2;
		
		String [][] inputMatrix = new String[inputArray.length][]; 
		for(int i=0; i<inputArray.length; i++) { 
			inputMatrix[i] = inputArray[i].split(""); 
		}
		
		int rows = inputArray.length;
		
		int columns = inputMatrix[0].length;
		
		spiralRotate(inputMatrix, rows, columns, rotation); 
		
		//scanner.close();
		
		String [] joinedArray = new String[inputMatrix.length];
		
		System.out.println(inputMatrix.length);
		
		for(int i=0; i<inputMatrix.length; i++) {
			joinedArray[i] = String.join("", inputMatrix[i]);
		}
		
		String result = String.join("", joinedArray);
		
		//System.out.println(result);	

	}

	public static void spiralRotate(String[][] inputMatrix, int row, int column, int rotation) {
			
		int currentStartRow = 0, currentStartColumn = 0;
		
		int currentMaxRow = row-1, currentMaxColumn = column-1;
		
		List<List<String>> rotationString = new ArrayList<List<String>>();
		
		/*
		 *  [a, f, k, p, u, v, w, x, y, t, o, j, e, d, c, b] - length = 16 
		 *  rotation = 2
		 *  
		 *  startIdx = 14 = (length - rotation%length)
		 *  
		 * a b c d e   <- result = c d e j o
		 * f g h i j
		 * k l m n o
		 * p q r s t
		 * u v w x y 
		 * 
		 * 
		 * */
		
		while(currentStartRow <= currentMaxRow && currentStartColumn <= currentMaxColumn) {
			
			List<String> currentLine = new ArrayList<String>();
			
			for(int i=currentStartRow; i<currentMaxRow; i++ ) {
				currentLine.add(inputMatrix[i][currentStartColumn]);
			}
			for(int i=currentStartColumn; i<currentMaxColumn; i++) {
				currentLine.add(inputMatrix[currentMaxRow][i]);
			}
			for(int i=currentMaxRow; i> currentStartRow; i--) {
				currentLine.add(inputMatrix[i][currentMaxColumn]);
			}
			for(int i=currentMaxColumn; i> currentStartColumn; i--) {
				currentLine.add(inputMatrix[currentStartRow][i]);
			}
			
			currentStartRow++;
			currentStartColumn++;
			currentMaxRow--;
			currentMaxColumn--;	
			
			if(!currentLine.isEmpty()) {
				rotationString.add(currentLine);
			}
			
			
		}
		System.out.print(rotationString);

		currentStartRow = 0; currentStartColumn = 0;
		currentMaxRow = row-1; currentMaxColumn = column-1;
		
		for(int i = 0 ; i < rotationString.size() ; i++) {
			
			ArrayList<String> currentLine = (ArrayList<String>)rotationString.get(i);
			
			int curIndex = -1;
			
			if(i%2 != 0) {
				// clockwise
				curIndex = rotation % currentLine.size();
			}else {
				// anticlockwise
				curIndex = currentLine.size() - rotation % currentLine.size();
			}
			
			for(int j = currentStartRow ; j < currentMaxRow ; j++) {
				inputMatrix[j][currentStartColumn] = currentLine.get(curIndex % currentLine.size()).toString();
				curIndex++;
			}
			for(int j = currentStartColumn ; j < currentMaxColumn ; j++) {
				inputMatrix[currentMaxRow][j] = currentLine.get(curIndex % currentLine.size()).toString();
				curIndex++;
			}
			for(int j = currentMaxRow ; j > currentStartRow ; j--) {
				inputMatrix[j][currentMaxColumn] = currentLine.get(curIndex % currentLine.size()).toString();
				curIndex++;
			}
			for(int j = currentMaxColumn; j > currentStartColumn ; j--) {
				inputMatrix[currentStartRow][j] = currentLine.get(curIndex % currentLine.size()).toString();
				curIndex++;
			}
			
			currentMaxRow--;
			currentMaxColumn--;
			currentStartRow++;
			currentStartColumn++;
		}	
	}
	
}
