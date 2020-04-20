  PImage pictureOfRecord;    
  int x = -40;
  int y = -40;
void draw(){
        image(pictureOfRecord, x, y);

}
void setup(){
        size(800,800);                                
        pictureOfRecord= loadImage("record.png");   
      }
