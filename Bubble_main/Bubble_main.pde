Bubble b1; // declares the object Bubble
Bubble b2;

void setup() {
  size(640, 360);
  b1 = new Bubble(32);
  b2 = new Bubble(16); // initializes the object Bubble; this executes a "constructor"
}

// To ACT on the object Bubble, we use the dot syntax convention
void draw() {
  background(255);
  b1.display(); // dot syntax
  b1.ascend(); // dot syntax
  b1.top();
  
  b2.display(); // dot syntax
  b2.ascend(); // dot syntax
  b2.top();
}