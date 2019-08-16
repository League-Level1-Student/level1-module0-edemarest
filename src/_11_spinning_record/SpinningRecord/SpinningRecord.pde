import ddf.minim.*;  //at the very top of your sketch
PImage record;
int angle = 0;

Minim minim;  //as a member variable
AudioPlayer song;  //as a member variable

void setup() {
  minim = new Minim(this);  //in the setup method
  song = minim.loadFile("awesomeTrack.mp3", 512);//in the setup method
  size(600,600);                                 
  record= loadImage("record.png");   
  record.resize(600,600);
}

void draw() {
  angle = angle+5;
  image(record, 0, 0); 
  if (mousePressed) {
    song.play();
    rotateImage(record, 50 + angle);
    image(record, 0, 0);
  }
  else {
    song.pause();
  }
  
}


void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
        
    }
