package GridTools;

import java.awt.Color;

public class FlagMaker {

	/* Draws a single flag as indicated by the second parameter */
	/* into the grid passed as the first parameter */
	public static void drawFlag(MyGrid grid, int countryCode) {

		int height = grid.getHt();


		if(countryCode==1 && height<=30){ //draw flag for Indonesia 
			indonesia(grid);
		}else if(countryCode==2 && height<=30){ //draw flag for Lithuania
			lithuania(grid);
		}else if(countryCode==3 && height<=30){ //draw flag for Rwanda
			rwanda(grid);
		}else if(countryCode==4 && height<=30){ //draw flag for Malta
			malta(grid);
		}else if(countryCode==5 && height<=30){ //draw flag for Afghanistan
			afghanistan(grid);
		}else if(countryCode==6 && height<=30){ //draw flag for Eritrea
			eritrea(grid);
		}else if(countryCode==7 && height<=30){ //draw flag for Macedonia 
			macedonia(grid);
		}else if(countryCode==8 && height<=30){ //draw flag for The Bahamas
			bahamas(grid);
		}else if(countryCode==9 && height<=30){ //draw flag for Zimbabwe
			zimbabwe(grid);
		}else{                                  //draw error flag 4x8 will be displayed
			errorFlag(grid);
		}

	} 



	/*METHOD FOR INDONESIA BEGINS*/
	public static void indonesia(MyGrid grid){

		//declaring variables
		int rowNum, colNum, height, width;		
		height = grid.getHt();
		width = grid.getWd();

		/*IF STATEMENT FOR EVEN BEGINS*/
		if(height %2==0) //Checks if the height is even number eg h=6,h=8
		{
			
			/*
			 * Color first half 
			 * [ r r r r r r r r r r r r r r ]
			 * [ r r r r r r r r r r r r r r ]
			 * [ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ]
			 * [ 0 0 0 0 0 0 0 0 0 0 0 0 0 0 ]
			 * 
			 * 
			 */
			
			/*COLORS HALF THE FLAG RED BEGINS*/
			for(rowNum=0; rowNum<height/2;rowNum++){
				for(colNum=0; colNum<width;colNum++){
					grid.setColor(rowNum, colNum, Color.RED);
				}
			}
			/*COLORS HALF THE FLAG RED ENDS*/

			
			/*
			 * Color Second half 
			 * [ r r r r r r r r r r r r r r ]
			 * [ r r r r r r r r r r r r r r ]
			 * [ w w w w w w w w w w w w w w ]
			 * [ w w w w w w w w w w w w w w ]
			 * 
			 */
			
			/*COLORS HALF THE FLAG WHITE BEGINS*/
			for(rowNum=height/2; rowNum<height;rowNum++){
				for(colNum=0; colNum<width;colNum++){
					grid.setColor(rowNum, colNum, Color.WHITE);
				}
			}
			/*COLORS HALF THE FLAG WHITE ENDS*/

		}else{                                              
			for(rowNum=0;rowNum<height;rowNum++){
				for(colNum=0;colNum<width;colNum++){
					grid.setColor(rowNum, colNum, Color.WHITE);
				}
			}
			grid.setColor(rowNum=0, colNum=width-1, Color.YELLOW);
			grid.setColor(rowNum=0, colNum=0, Color.RED);
			grid.setColor(rowNum=height-1, colNum=width-1, Color.GREEN);
			grid.setColor(rowNum=height-1, colNum=0, Color.BLUE);
		}
		/*IF STATEMENT FOR EVEN ENDS*/
	}
	/*METHOD FOR INDONESIA ENDS*/



	/*METHOD FOR LITHUANIA COLORING BEGINS*/
	public static void lithuania(MyGrid grid){
		
	}
	/*METHOD FOR LITHUANIA ENDS*/


	/*METHOD FOR RWANDA COLORING BEGINS*/
	public static void rwanda(MyGrid grid){
		
	}
	/*METHOD FOR RWANDA ENDS*/

	
	/*MALTA FLAG COLORING METHOD START HERE*/
	public static void malta(MyGrid grid){
		
	}
	/*MALTA FLAG COLORING METHOD ENDS HERE*/


	/*AFGHANISTAN FLAG COLORING METHOD START HERE*/
	public static void afghanistan(MyGrid grid){
		
	}
	/*AFGHANISTAN FLAG COLORING METHOD ENDS HERE*/



	/*ERITREA FLAG COLORING METHOD START HERE*/
	public static void eritrea(MyGrid grid){
	

	}
	/*AFGHANISTAN FLAG COLORING METHOD ENDS HERE*/


	/*MACEDONIA FLAG COLORING METHOD START HERE*/
	public static void macedonia(MyGrid grid){
		int row, col, height, width, increment1, increment2;

		height = grid.getHt();
		width = grid.getWd();
		increment1 = 1;
		increment2 = 1;

		if(height %2==0 && height>=8){

			for(row=0;row<height;row++){
				for(col=0;col<width;col++){

					grid.setColor(row, col, Color.RED);
				}
			}

			/*COLORING ORANGE VERTICAL AND HORIZONTAL LINES FOR MACEDONIA BEGIN*/
			for(row=height/2;row<(height/2)+1;row++){
				for(col=0;col<width;col++){
					grid.setColor(row, col, Color.ORANGE);
					grid.setColor(row-1, col, Color.ORANGE);
				}
			}

			for(col=width/2;col<(width/2)+1;col++){
				for(row=0;row<height;row++){
					grid.setColor(row, col, Color.ORANGE);
					grid.setColor(row, col-1, Color.ORANGE);
				}
			}
			/*COLORING ORANGE VERTICAL AND HORIZONTAL LINE FOR MACEDONIA END*/

			/*COLORING ORANGE DIAGONAL RIGHT LINE FOR MACEDONIA BEING*/
			for(row=0;row<height;row++){
				for(col=width-(increment1+1);col<=width-increment1;col++){
					grid.setColor(row, col, Color.ORANGE);
				}
				increment1+=2;
			}
			/*COLORING ORANGE DIAGONAL RIGHT LINE FOR MACEDONIA ENDS*/

			/*COLORING ORANGE DIAGONAL LEFT LINE FOR MACEDONIA BEGINS*/
			for(row=0;row<height;row++){
				for(col=increment2-1;col<=increment2;col++){
					grid.setColor(row, col, Color.ORANGE);
				}
				increment2+=2;
			}
			/*COLORING ORANGE DIAGONAL LEFT LINE FOR MACEDONIA ENDS*/

			/*COLORS A SQUARES TO FILL IN MISSING ORANGE SQUARES */
			for(row=(height/2)-2;row<(height/2)+2;row++){
				for(col=(width/2)-2;col<(width/2)+2;col++){
					grid.setColor(row, col, Color.ORANGE);
				}
			}


		}else{                                              
			for(row=0;row<height;row++){
				for(col=0;col<width;col++){
					grid.setColor(row, col, Color.WHITE);
				}
			}
			grid.setColor(row=0, col=width-1, Color.YELLOW);
			grid.setColor(row=0, col=0, Color.RED);
			grid.setColor(row=height-1, col=width-1, Color.GREEN);
			grid.setColor(row=height-1, col=0, Color.BLUE);
		}
	}
	/*ACEDONIA FLAG COLORING METHOD ENDS HERE*/








    /*BAHAMAS METHOD STARTS HERE*/
	public static void bahamas(MyGrid grid){
		int row, col, height, width, increment1;

		height = grid.getHt();
		width = grid.getWd();
		increment1 = 1;

		if(height%3==0 && height%2==1){
			for(row=0;row<height;row++){
				for(col=0;col<width;col++){
					grid.setColor(row, col, Color.BLUE);
				}
			}
			for(row=height/3;row<(2*(height))/3;row++){
				for(col=0;col<width;col++){
					grid.setColor(row, col, Color.YELLOW);
				}
			}

			for(row=0;row<(height/2)+1;row++){
				for(col=0;col<increment1;col++){
					grid.setColor(row, col, Color.BLACK);
				}
				increment1+=1;
			}
			for(row=height/2;row<height;row++){
				for(col=0;col<increment1-1;col++){
					grid.setColor(row, col, Color.BLACK);
				}
				increment1-=1;
			}
		}else{                                              
			for(row=0;row<height;row++){
				for(col=0;col<width;col++){
					grid.setColor(row, col, Color.WHITE);
				}
			}
			grid.setColor(row=0, col=width-1, Color.YELLOW);
			grid.setColor(row=0, col=0, Color.RED);
			grid.setColor(row=height-1, col=width-1, Color.GREEN);
			grid.setColor(row=height-1, col=0, Color.BLUE);
		}
	}




	/*ZIMBABWE FLAG COLORING METHOD START HERE*/
	public static void zimbabwe(MyGrid grid){
		
	}








	/* ERROR FLAG COLORING METHOD START HERE*/
	public static void errorFlag(MyGrid grid){
		int rowNum, colNum, height, width;

		height = grid.getHt();
		width = grid.getWd();

		/*IF STATEMENT FOR ERROR FLAG IF HEIGHT IS GRATER THAN 4 AND LESS THAN 30*/
		if(height>=4 && height<=30){
			
			/*COLORS FLAG WHITE*/
			for(rowNum=0;rowNum<height;rowNum++){
				for(colNum=0;colNum<width;colNum++){
					grid.setColor(rowNum, colNum, Color.WHITE);
				}
			}
			/*COLORS CORNER SQUARES*/
			grid.setColor(rowNum=0, colNum=width-1, Color.YELLOW);
			grid.setColor(rowNum=0, colNum=0, Color.RED);
			grid.setColor(rowNum=height-1, colNum=width-1, Color.GREEN);
			grid.setColor(rowNum=height-1, colNum=0, Color.BLUE);

		}else{
			/*COLORS FLAG WHITE*/
			for(rowNum=0; rowNum<4; rowNum++){
				for(colNum=0;colNum<8; colNum++){
					grid.setColor(rowNum, colNum, Color.WHITE);
				}
			}
			/*COLORS CORNER SQUARES*/
			grid.setColor(0, 0, Color.RED);
			grid.setColor(0, 7, Color.BLUE);
			grid.setColor(3, 0, Color.YELLOW);
			grid.setColor(3, 7, Color.GREEN);


		}
	}
}