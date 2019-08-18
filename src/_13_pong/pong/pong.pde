import ddf.minim.*;  
Minim minim;
AudioSample sound;
PImage backgroundImage;
int paddleLength = 120;
float xpos = 1;
float ypos = 1;
float speed = random(1, 9);
float speedy = random(1, 9);
float paddlex;
float paddley = 485;
void setup() {
  backgroundImage = loadImage("pong.png");
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  size(500, 500);
 
}

void draw() {
  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);
  sound.trigger();
  fill(#FFFFFF);
  stroke(#FFFFFF);
  ellipse(xpos, ypos, 20, 20);
  rect(mouseX, paddley, paddleLength, 15);
  
  if (xpos >= width) {
    speed = -speed;
  }
  if (xpos < 0) {
    speed = -speed;
  }
  if (ypos >= width) {
    speedy = -speedy;
  }
  if (ypos < 0) {
    speedy = -speedy;
  }
  xpos = xpos + speed;
  ypos = ypos + speedy;
  
  if (ypos > paddley && xpos > mouseX && xpos < mouseX + paddleLength) {
    speedy = -speedy;
  }
  
  //if (xpos <= mouseX + 60 || xpos >= mouseX - 60) {
   // speedy = -speedy;
  //}
  
}
