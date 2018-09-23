PVector head, headSpd;
PVector chain1, chain1Spd;
PVector chain2, chain2Spd;
PVector chain3, chain3Spd;
PVector chain4, chain4Spd;
PVector chain5, chain5Spd;
PVector chain6, chain6Spd;
PVector chain7, chain7Spd;

//PVector body, bodySpd;
//int segmentNum = 3;
//int segmentNumCurrent;
//float segmentRate;
//float[] deltaX = new float[segmentNum];
//float[] deltaY = new float[segmentNum];


float springing = random(0.005,0.05); //0.01
float dampening = .39; //random(0.19,0.49); //.39; //0.99

void setup() {
  size(600, 600);
  noFill();
  smooth();
  head = new PVector();
  headSpd = new PVector();//random(-1.5, 1.5), random(-1.5, 1.5));
  chain1 = new PVector();
  chain1Spd = new PVector();
  chain2 = new PVector();
  chain2Spd = new PVector();
  chain3 = new PVector();
  chain3Spd = new PVector();
  chain4 = new PVector();
  chain4Spd = new PVector();
  chain5 = new PVector();
  chain5Spd = new PVector();
  chain6 = new PVector();
  chain6Spd = new PVector();
  chain7 = new PVector();
  chain7Spd = new PVector();
  
  
  //for(int i=0; i<segmentNum; i+=1){
  //  join(body,i) = new PVector();
  //  bodySpd[i] = new PVector();
  //}
}

void draw() {
  //background(255);
  background(0);
  translate(width/2, height/2);
  head();
  
  chain1();
  chain2();
  chain3();
  chain4();
  chain5();
  chain6();
  chain7();
  render();
  bounds();
}
