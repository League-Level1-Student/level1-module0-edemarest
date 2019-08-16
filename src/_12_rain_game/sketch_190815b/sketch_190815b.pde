int randomNumber = 250;
int ypos = 0;
int score = 0;
void setup() {
  size(500, 500);
  
}

void draw() {
  background(#FFFFFF);
  stroke(0, 0, 100);
  fill(#a1e3ff);
  ellipse(randomNumber, ypos, 20, 20);
  fill(#bababa);
  rect(mouseX, 450, 70, 100);
  ypos++;
  if (ypos == 500) {
    ypos = 0;
    randomNumber = (int) random(width);
  }
  if (ypos == 450) {
  checkCatch(randomNumber);
  ypos = 0;
  }
  fill(#000000);
  textSize(16);
  text("Score: " + score, 20, 20);
}
void checkCatch(int x){
     if (x -50 < mouseX && x +50 > mouseX)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); 

}
