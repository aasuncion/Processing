import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class endless_rhythm extends PApplet {
  public void setup() {
// size canvas of the ratio 4 inches x 5.5 inches


// set background color
background(160);

// large middle white ellipse
noStroke();
fill(227, 222, 222);
ellipse(200, 275, 225, 225);

// top white arc
strokeWeight(4);
stroke(118,159,224);
fill(227, 222, 222);
arc(300, 103, 220, 190, radians(-60), radians(120), OPEN);

// orange arc
noStroke();
fill(188, 112, 30);
arc(300, 103, 125, 125, radians(-60), radians(120), OPEN);

// bottom white arc
strokeWeight(4);
stroke(203, 206, 42);
fill(227, 222, 222);
arc(100, 447, 240, 185, radians(-60), radians(120), OPEN);

// red arc
noStroke();
fill(165, 46, 25);
arc(100, 447, 125, 125, radians(-60), radians(120), OPEN);

// top black arc
strokeWeight(4);
stroke(203, 206, 42);
fill(60, 61, 61);
arc(300, 103, 220, 190, radians(120), radians(300), OPEN);

// blue arc
noStroke();
fill(118, 159, 224);
arc(250, 189, 125, 125, radians(120), radians(300), OPEN);

// bottom black arc
strokeWeight(4);
stroke(118,159,224);
fill(60, 61, 61);
arc(100, 447, 200, 200, radians(120), radians(300), OPEN);

// light green arc
noStroke();
fill(108, 173, 124);
arc(150, 361, 125, 125, radians(120), radians(300), OPEN);

// large middle black arc
noStroke();
fill(60, 61, 61);
arc(205, 267, 270, 250, radians(-60), radians(120), OPEN);
// arc(210, 258, 235, 240, radians(-60), radians(120), OPEN);

// dark green arc
noStroke();
fill(19, 113, 100);
arc(200, 275, 125, 125, radians(-60), radians(120), OPEN);

// small middle grey ellipse
noStroke();
fill(200);
ellipse(200, 275, 75, 75);

// small middle arc
noStroke();
fill(177, 189, 219);
arc(200, 275, 75, 75, radians(120), radians(300), OPEN);

// small grey ellipse above middle
fill(200);
ellipse(250, 189, 75, 75);

// small arc above middle ellipse
noStroke();
fill(177, 189, 219);
arc(250, 189, 75, 75, radians(120), radians(300), OPEN);

// small grey ellipse top
fill(200);
ellipse(300, 103, 75, 75);

// small arc top
noStroke();
fill(177, 189, 219);
arc(300, 103, 75, 75, radians(-60), radians(120), OPEN);

// small grey ellipse below middle
fill(200);
ellipse(150, 361, 75, 75);

// small arc below middle
noStroke();
fill(177, 189, 219);
arc(150, 361, 75, 75, radians(-60), radians(120), OPEN);

// small grey ellipse bottom
fill(200);
ellipse(100, 447, 75, 75);

// small arc bottom
noStroke();
fill(177, 189, 219);
arc(100, 447, 75, 75, radians(120), radians(300), OPEN);
    noLoop();
  }

  public void settings() { 
size(420, 550); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "endless_rhythm" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
