package test;

public class ControllerAndView {
	public static void createShape(Shape shape){
		  switch(shape.type){
		    case "LeftBottomCathetus":  
		      createLeftBottomCathetusTriangle(shape);
		      break;
		    case "RightBottomCathetus": 
		      createRightBottomCathetusTriangle(shape);
		      break;
		    case "LeftTopCathetus": 
		      createLeftTopCathetusTriangle(shape);
		      break;
		    case "RightTopCathetus": 
		    	createRigthTopCathetusTriangle(shape);
		      break;
		    case "Rectangle": 
		      createRectangle(shape);		    	
		      break;
		    case "RightRight": 
			      createRightRight(shape);		    	
			      break;
		   
		    }
		  }
		  public static void drawPass() {
		      System.out.println("_________________");
		  }
		  private static void drawShifts(int shifts){   
			    for(int i = 0; i < shifts; i++){
			      System.out.print(" ");
			    }
			  }
		  private static void drawDotsLine(int line, String dot){   
		    for(int j = 0; j < line + 1; j++){
		      System.out.print(dot);  
		    }
		  } 
		 
		  private static void createLeftBottomCathetusTriangle(Shape shape){   
		    for(int i = 0; i < shape.lines; i++){    
		      drawShifts(shape.shift);  
		      drawDotsLine(i, shape.dot);  
		      System.out.println();
		    }
		  }
		  private static void createRightBottomCathetusTriangle(Shape shape){   
		    for(int i = 0; i < shape.lines; i++){   
		      drawShifts(shape.shift); 
		      drawDotsLine(shape.lines - i - 1, " "); 
		      drawDotsLine(i, shape.dot);  
		      System.out.println();
		    }
		  }
		  static void createLeftTopCathetusTriangle(Shape shape){
			  for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
		  }
		  static void createRigthTopCathetusTriangle(Shape shape){
			  for(int i = shape.lines; i > 0 ; i--){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines - i, " "); 
			      drawDotsLine(i - 1, shape.dot); 
			      System.out.println();
			    }
		  }
		  static void createRectangle(Shape shape){
			  for(int i = 0; i<shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(shape.lines, " "); 
			      drawDotsLine(shape.lines-1,shape.dot); 
			      System.out.println();
			    }
		  }
		  static void createRightRight(Shape shape){   
			    for(int i = 0; i < shape.lines; i++){    
			      drawShifts(shape.shift);  
			      drawDotsLine(i, shape.dot);  
			      System.out.println();
			    }
			   for(int i = shape.lines-1; i > 0; i--){   
				  drawShifts(shape.shift);  
			      drawDotsLine(i-1, shape.dot);  
			      System.out.println();
			    }
		  }
}
