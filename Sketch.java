import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3(); 
    draw_section4();
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();
}


  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){
    int intX = 0;
    int intY = 0;
    int boxWidth = 5;
    int boxSpacing = 5;

    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 2 + (boxWidth + boxSpacing)*intRow; 
        intY = 300 + 2 + (boxWidth + boxSpacing) * intColumn; 
        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

      }
    }
  }


  public void draw_section2(){
    int intX = 302;
    int intY = 302;
    int boxWidth = 5;
    int boxSpacing = 5;
   

    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 302 + (boxWidth + boxSpacing)*intRow;  
        intY = 302 + (boxWidth + boxSpacing) * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

        
        if(intRow % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, boxWidth, boxWidth);

      }
      
    }

   } 
  }



 
  public void draw_section3(){
     int intX = 602;
    int intY = 302;
    int boxWidth = 5;
    int boxSpacing = 5;
   

    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 602 + (boxWidth + boxSpacing)*intRow; 
        intY = 302 + (boxWidth + boxSpacing) * intColumn; 
        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

        
        if(intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, boxWidth, boxWidth);

      }
      
    }

   } 

   
  }

  

  public void draw_section4(){

    int intX = 902;
    int intY = 302;
    int boxWidth = 5;
    int boxSpacing = 5;
   

    for(int intRow = 0; intRow < 30; intRow ++){
      for(int intColumn = 0; intColumn < 30; intColumn++){
        intX = 902 + (boxWidth + boxSpacing)*intRow;  
        intY = 302 + (boxWidth + boxSpacing) * intColumn; 

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

        
        if(intRow % 2 == 1){
          fill(0);
          noStroke();
          rect(intX, intY, boxWidth, boxWidth);

      }

        if(intColumn % 2 == 0){
          fill(0);
          noStroke();
          rect(intX, intY, boxWidth, boxWidth);

        }
      
    }

   }
  }

    

  


  public void draw_section5(){

    int intX = 0;
    int intY = 0;
    int boxWidth = 5;
    int boxSpacing = 5;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = 29 - intColumn; intRow < 30; intRow++){
        intX = 2 + (boxWidth + boxSpacing)*intColumn; 
        intY = 2 + (boxWidth + boxSpacing) *intRow; 

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

       
      }
    }
  }

  

  public void draw_section6(){

    int intX = 0;
    int intY = 0;
    int boxWidth = 5;
    int boxSpacing = 5;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = intColumn; intRow < 30; intRow++){
        intX = 302 + (boxWidth + boxSpacing)*intColumn; 
        intY = 2 + (boxWidth + boxSpacing) *intRow;

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

       
      }
    }
  }



  public void draw_section7(){

    int intX = 0;
    int intY = 0;
    int boxWidth = 5;
    int boxSpacing = 5;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = 0; intRow < 30 - intColumn; intRow++){
        intX = 602 + (boxWidth + boxSpacing)*intColumn; 
        intY = 2 + (boxWidth + boxSpacing) *intRow; 

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

       
      }
    }
  }

  
  
  public void draw_section8(){
    int intX = 0;
    int intY = 0;
    int boxWidth = 5;
    int boxSpacing = 5;

    for(int intColumn = 0; intColumn < 30; intColumn++){
      for(int intRow = 0; intRow < intColumn; intRow++){
        intX = 902 + (boxWidth + boxSpacing)*intColumn; 
        intY = 2 + (boxWidth + boxSpacing) *intRow; 

        fill(255);
        noStroke();
        rect(intX, intY, boxWidth, boxWidth);

       
      }
    }
  }
}