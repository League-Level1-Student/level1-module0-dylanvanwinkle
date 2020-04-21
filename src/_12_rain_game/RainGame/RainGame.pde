int x = 100;
int y = 100;
int score = 0;
void draw(){
background(0,0,255);
    fill(0,255,0);
    stroke(255,0,0);
    ellipse(x, y, 50,50);
            rect(mouseX,height-100,100,100);
                fill(0, 0, 0);
    textSize(16);
    text("Score: " + score, 20, 20);
    y += 4;
    if(y > height){
      checkCatch(x);
        x = (int) random(width);
      ellipse(x, y, 50,50);
    y = 100;
    }
}

void setup(){
size(600,600);
}
    void checkCatch(int x){
         if (x > mouseX && x < mouseX+100)
            score++;
         else if (score > 0) 
            score--;
    }
