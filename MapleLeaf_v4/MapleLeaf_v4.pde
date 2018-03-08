// Title: Spring to Fall
// Albert Asuncion, Johnson Ekedum, Shravan Kuchkula
// Progressively flipping the values of r & g as mouse is dragged from left to right
// There are 3 image files attached

PImage leaf;
void setup(){
  size(871, 836);
  leaf = loadImage("GreenLeaf.jpg");
  //leaf = loadImage("OrangeLeaf.jpg");
  //leaf = loadImage("OriginalMapleLeaf.gif");
  //println(leaf.width);
  //println(leaf.height);
}

void draw(){
  //image(leaf, 0, 0);
  loadPixels();
  float mx = constrain(mouseX, 0, 400);
  float mxp = mx/40000;

  leaf.loadPixels();
  for(int x = 0; x < width; x++){
    for(int y = 0; y < height; y++) {
      int loc = x + y * width;
      float r = red(leaf.pixels[loc]);
      float g = green(leaf.pixels[loc]);
      float b = blue(leaf.pixels[loc]);
        float factor = abs(r-g)*mxp;
      if (r == 0 && g == 0 && b ==0) {
        pixels[loc] = color(0, 0, 0);
      } else {
        pixels[loc] = color(r*(1+factor), g*(1-factor), b);
      }
    }
  }
  updatePixels();
  //image(leaf, 0, 0);
}