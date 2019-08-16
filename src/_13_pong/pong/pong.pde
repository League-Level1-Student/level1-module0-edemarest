int xpos = 0;
int dir = 0;
void setup() {
  size(500, 500);
 
}

void draw() {
   background(#FFFFFF);
  fill(#000000);
  stroke(#000000);
  ellipse(xpos, 20, 20, 20);
  if (xpos == 500) {
    dir++;
  }
  if (dir%2 == 1) {
    xpos --;
  }
  else {
    xpos++;
  }
}
