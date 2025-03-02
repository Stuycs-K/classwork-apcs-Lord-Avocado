//size(400,400);
//place 2d Primatives anywhere you like
//rect(20,20,40,80);

//draw a face/creature/person/whatever at location x,y
void avatar(int x, int y){
  //place 2d Primatives relative to x and y.
  //
  //change colors and try out different processing commands.
  // drawing the geometry dash player sprite
  // 1. draw a square with strokecolor black, fillcolor yellow
  stroke(0);
  fill(#FFF700); // yellow
  rect(x, y, 26, 26); // x, y, width, height
  // 2. draw two eyes with strokecolor black, fillcolor cyan
  stroke(0); // doesn't do anything but why not
  fill(#00FFF9); // cyan
  rect(x+6, y+6, 4, 4); // eye 1
  // doing the math... 26 = 4 + 4 + 4 + 4 + k where k is the distance between the two eyes...k = 10
  // ignore the above line, the math was not mathing.
  rect(x+16, y+6, 4, 4); // eye 2
  // 3. draw a mouth with strokecolor black, fillcolor cyan
  stroke(0); // again doesn't do anything but again why not
  fill(#00FFF9); // yet again doesn't do anything but yet again why not
  rect(x+6, y+15, 14, 4); // mouth
}

//extra method for resizing avatar cuz why not

void korra(int x, int y, float s) {
  // iykyk
  stroke(0);
  fill(#FFF700);
  rect(x, y, 26*s, 26*s);
  stroke(0);
  fill(#00FFF9);
  rect(x+6*s, y+6*s, 4*s, 4*s);
  rect(x+16*s, y+6*s, 4*s, 4*s);
  stroke(0);
  fill(#00FFF9);
  rect(x+6*s, y+15*s, 14*s, 4*s);
}

//setup will draw two of your avatars.
void setup(){
  size(800,400); // length, width
  background(255);
  avatar(200,200);
  avatar(600,350);
  // let's draw sized avatars:
  korra(300, 300, 1.5);
  korra(700, 100, 2.0);
}
