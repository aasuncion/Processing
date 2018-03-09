// Classes contain both the data and functionality


class Bubble {
  
  //data
  float x;
  float y;
  float diameter;

  // include a default constructor as a best practice
  //Bubble() {
  //}
  
  // constructor
  Bubble(float tempD) {
    x = width/2;
    y = height;
    diameter = tempD;
  }
  
  Bubble() {
    x = width/8;
    y = height;
  }
  
  
  void ascend(){
    y--;
    x = x + random(-2, 2);
  }
  
  // functionality
  void display() {
    stroke(0);
    fill(127);
    ellipse(x, y, diameter, diameter);
  }
  void top(){
    if (y < diameter/2) {
      y = diameter/2;
    }
  }
}