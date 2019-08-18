

void setup() {
  size(600, 600);
  background(#FFFFFF);
}

void draw() {
  makeMagical();
  for (int i = 0; i < 300; i++) {
    float wormx = getWormX(i);
    float wormy = getWormY(i);
    fill(0, 200, 0);
    stroke(0, 130, 0);
    ellipse(wormx, wormy, 30, 30);
  }
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+5 + frameCount * frequency), 0, 1, 0, height);
}
