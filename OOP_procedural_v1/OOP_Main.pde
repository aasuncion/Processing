// OOP
// In OOP, objects are named using an uppercase (e.g. PImage, String)
// Defining an object, e.g. Bubble, should also begin with an uppercaase
// With variables, we declare and initialize them. In the same manner, we declare objects and initialize them
// For the working version of the sketch as OOP, refer to Bubble.pde


Bubble b; // declares the object Bubble

void setup() {
  b = new Bubble(); // initializes the object Bubble; this executes a "constructor"
}


// To ACT on the object Bubble, we use the dot syntax convention
void draw() {
  b.display(); // dot syntax
  b.ascend(); // dot syntax
  b.top();
}