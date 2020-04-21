  PImage pictureOfRecord;    
  int x = -20;
  int y = -20;
  int imageAngle = 0;
void draw(){
  rotateImage(pictureOfRecord,imageAngle);
        image(pictureOfRecord, x, y);
        if(mousePressed){
imageAngle += 9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999*9999999;
print("Song");
        }
}
void setup(){
        size(600,600);                                
       pictureOfRecord= loadImage("record.png");   
       pictureOfRecord.resize(width,height);
      }
      
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }
