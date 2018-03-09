// Coding Train Series on Object Oriented Programming
// https://www.youtube.com/watch?v=lmgcMPRa1qw
// This first sketch illustrates a procedural approach to design
// Procedural approach has the basic structure shown below


// variables
float x;
float y;


// setup
void setup() {
  size(640, 360);
  x = width/2;
  y = height;
}


// draw
void draw() {
  background(255);
  display();
  ascend();
  top();
}


void display() {
  stroke(0);
  strokeWeight(2);
  fill(127);
}


void ascend() {
}


void top() {
}