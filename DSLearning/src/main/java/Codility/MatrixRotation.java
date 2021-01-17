package Codility;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MatrixRotation {

	public static void main(String[] args) {
		
		String input = "\"abcde#fghij#klmno#pqrst#uvwxy\"";
		int rotation = 2 ;
		
		String[] inputArray = input.replace("\"", "").split("#") ;
		
		//System.out.println(inputArray[0].toString());
		
		String[][] inputMatrix = new String[inputArray.length][] ;
		
		for (int i =  0 ; i<inputArray.length ; i++) {
			
			inputMatrix[i] = inputArray[i].split("") ;
		}
		
		int rows = inputArray.length ;
		int col =  inputMatrix[0].length ;
		spiralRotate(inputMatrix, rows, col, rotation);
		
	}
	
	public static void spiralRotate(String[][] inputMatrix, int row, int column, int rotation) {
		
		int currStartRow = 0 ,currMaxRow = row-1 ;
		int currStartCol = 0 , currMaxCol = column-1 ;
		
		List<List<String>> rotationString = new ArrayList<List<String>>();
		
		while (currStartRow<=currMaxRow && currStartCol<=currMaxCol) {
			List<String> currentLine = new ArrayList<String>() ; 
			
			for (int i=currStartRow ; i<currMaxRow ; i++) {
				currentLine.add(inputMatrix[i][currStartCol]) ;
			}
			
			for (int i=currStartCol ; i<currMaxCol ; i++) {
				currentLine.add(inputMatrix[currMaxRow][i]) ;
			}
			
			for (int i =currMaxRow ; i>currMaxRow ; i--) {
				currentLine.add(inputMatrix[i][currMaxCol]) ;
			}
			
			for (int i =currMaxCol ; i>currMaxCol ; i--) {
				currentLine.add(inputMatrix[currStartRow][i]) ;
			}
			
			currStartRow++ ;
			currStartCol++ ;
			currMaxRow-- ;
			currMaxCol-- ;
			
			if (currentLine!=null) {
				rotationString.add(currentLine) ;
			} 
			
		}
		
		for (int i = 0 ; i<rotationString.size();i++) {
			int currIndex = -1;
			
			List<String> currentLine =  rotationString.get(i) ;
			
			//ClockWise
			if (i%2==0) {
				currIndex = rotation % currentLine.size();
			}
			//Anticlockwise
			else {
				currIndex = currentLine.size() - (rotation % currentLine.size()) ;
			}
			
			currStartRow=0;currStartCol=0;
			currMaxRow=row-1 ; currMaxCol=column-1 ;
			
				for (int j=currStartRow ; j<currMaxRow ; j++) {
					inputMatrix[j][currStartCol] = currentLine.get(currIndex % currentLine.size()).toString();
					currIndex++ ;
				}
				
				for (int j=currStartCol ; j<currMaxCol ; j++) {
					inputMatrix[currMaxRow][j]= currentLine.get(currIndex % currentLine.size()).toString();
					currIndex++ ;
				}
				
				for (int j =currMaxRow ; j>currMaxRow ; j--) {
					inputMatrix[j][currMaxCol]= currentLine.get(currIndex % currentLine.size()).toString();
					currIndex++ ;
				}
				
				for (int j =currMaxCol ; j>currMaxCol ; j--) {
					inputMatrix[currStartRow][j]= currentLine.get(currIndex % currentLine.size()).toString();
					currIndex++ ;
				}
				
				currStartRow++ ;
				currStartCol++ ;
				currMaxRow-- ;
				currMaxCol-- ;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
			
	
}
