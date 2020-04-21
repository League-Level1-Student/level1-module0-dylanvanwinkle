float x;
float y;
void setup(){
    size(600,600);
    background(0,0,0);
}

void draw (){
  makeMagical();
  x =    random(600);
  y =    random(600);
  fill(random(254)+1,random(254)+1,random(254)+1);
    for (int i = 0; i < 300; i++) {
  ellipse(getWormX(i),getWormY(i),10,10);  
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
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
