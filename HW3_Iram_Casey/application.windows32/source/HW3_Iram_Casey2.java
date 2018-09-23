import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class HW3_Iram_Casey2 extends PApplet {

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


float springing = random(0.005f,0.05f); //0.01
float dampening = .39f; //random(0.19,0.49); //.39; //0.99

public void setup() {
  
  noFill();
  
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

public void draw() {
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
//void body(int i) {
  
//  bodySpd = new PVector();
//  //move center point
//  if(i<1){
//    deltaX[i] = 0;
//    deltaX[i] = 0;  
//  }
//  else{
//    deltaX[i] = body[i-1].x - body[i].x;
//    deltaY[i] = body[i-1].y - body[i].y;
//  }
//  //float springing[i] = .01; //0.0[i]
//  //float Damping[i] = .39; //0.99

//  // create springing effect
//  deltaX[i] *= springing;
//  deltaY[i] *= springing;

//  bodySpd[i].x += deltaX[i];
//  bodySpd[i].y += deltaY[i];

//  // move predator's center
//  body[i].x +=  bodySpd[i].x;
//  body[i].y +=  bodySpd[i].y;

//  // slow down springing
//  bodySpd[i].x *= Damping;
//  bodySpd[i].y *= Damping;
//}
public void bounds() {
  if (head.x > width/2) {
    head.x = width/2;
    headSpd.x *= -1;
  } 
  else if (head.x < -width/2) {
    head.x = -width/2;
    headSpd.x *= -1;
  }

  if (head.y > height/2) {
    head.y = height/2;
    headSpd.y *= -1;
  } 
  else if (head.y < -height/2) {
    head.y = -height/2;
    headSpd.y *= -1;
  }
}
public void chain1() {
  //move center point
  float deltaX1 = head.x - chain1.x;
  float deltaY1 = head.y - chain1.y;
  
  //float springing1 = .01; //0.01
  //float Damping1 = .39; //0.99

  // create springing effect
  deltaX1 *= springing;
  deltaY1 *= springing;

  chain1Spd.x += deltaX1;
  chain1Spd.y += deltaY1;

  // move predator's center
  chain1.x +=  chain1Spd.x;
  chain1.y +=  chain1Spd.y;

  // slow down springing
  chain1Spd.x *= dampening;
  chain1Spd.y *= dampening;
}
public void chain2() {
  //move center point
  float deltaX2 = chain1.x - chain2.x;
  float deltaY2 = chain1.y - chain2.y;
  
  //float springing2 = 0.01; //0.01
  //float Damping2 = 0.39; //0.99

  // create springing effect
  deltaX2 *= springing;
  deltaY2 *= springing;

  chain2Spd.x += deltaX2;
  chain2Spd.y += deltaY2;

  // move predator's center
  chain2.x +=  chain2Spd.x;
  chain2.y +=  chain2Spd.y;

  // slow down springing
  chain2Spd.x *= dampening;
  chain2Spd.y *= dampening;
}
public void chain3() {
  //move center point
  float deltaX3 = chain2.x - chain3.x;
  float deltaY3 = chain2.y - chain3.y;
  
  //float springing3 = 0.02; //0.02
  //float Damping3 = 0.39; //0.99

  // create springing effect
  deltaX3 *= springing;
  deltaY3 *= springing;

  chain3Spd.x += deltaX3;
  chain3Spd.y += deltaY3;

  // move predator's center
  chain3.x +=  chain3Spd.x;
  chain3.y +=  chain3Spd.y;

  // slow down springing
  chain3Spd.x *= dampening;
  chain3Spd.y *= dampening;
}
public void chain4() {
  //move center point
  float deltaX4 = chain3.x - chain4.x;
  float deltaY4 = chain3.y - chain4.y;
  
  //float springing3 = 0.02; //0.02
  //float Damping3 = 0.39; //0.99

  // create springing effect
  deltaX4 *= springing;
  deltaY4 *= springing;

  chain4Spd.x += deltaX4;
  chain4Spd.y += deltaY4;

  // move predator's center
  chain4.x +=  chain4Spd.x;
  chain4.y +=  chain4Spd.y;

  // slow down springing
  chain4Spd.x *= dampening;
  chain4Spd.y *= dampening;
}
public void chain5() {
  //move center point
  float deltaX5 = chain4.x - chain5.x;
  float deltaY5 = chain4.y - chain5.y;
  
  //float springing3 = 0.02; //0.02
  //float Damping3 = 0.39; //0.99

  // create springing effect
  deltaX5 *= springing;
  deltaY5 *= springing;

  chain5Spd.x += deltaX5;
  chain5Spd.y += deltaY5;

  // move predator's center
  chain5.x +=  chain5Spd.x;
  chain5.y +=  chain5Spd.y;

  // slow down springing
  chain5Spd.x *= dampening;
  chain5Spd.y *= dampening;
}
public void chain6() {
  //move center point
  float deltaX6 = chain5.x - chain6.x;
  float deltaY6 = chain5.y - chain6.y;
  
  //float springing3 = 0.02; //0.02
  //float Damping3 = 0.39; //0.99

  // create springing effect
  deltaX6 *= springing;
  deltaY6 *= springing;

  chain6Spd.x += deltaX6;
  chain6Spd.y += deltaY6;

  // move predator's center
  chain6.x +=  chain6Spd.x;
  chain6.y +=  chain6Spd.y;

  // slow down springing
  chain6Spd.x *= dampening;
  chain6Spd.y *= dampening;
}
public void chain7() {
  //move center point
  float deltaX7 = chain6.x - chain7.x;
  float deltaY7 = chain6.y - chain7.y;
  
  //float springing3 = 0.02; //0.02
  //float Damping3 = 0.39; //0.99

  // create springing effect
  deltaX7 *= springing;
  deltaY7 *= springing;

  chain7Spd.x += deltaX7;
  chain7Spd.y += deltaY7;

  // move predator's center
  chain7.x +=  chain7Spd.x;
  chain7.y +=  chain7Spd.y;

  // slow down springing
  chain7Spd.x *= dampening;
  chain7Spd.y *= dampening;
}
public void head() {
  headSpd.add(new PVector(random(-.15f, .15f),random(-.15f, .15f)));
  head.add(headSpd);
  //head.set(mouseX,mouseY);
}
public void render() {
  //stroke(100, 255);
  stroke(300, 555);
  //line(head.x, head.y, chain1.x, chain1.y);
  //line(chain1.x, chain1.y, chain2.x, chain2.y);
  
  stroke(50, 200, 200, 255);
  //ellipse(head.x, head.y, 5, 5);
  fill(128, 0, 128);
  stroke(200, 20, 20, 255);
  //stroke(400, 50, 50, 255);
  //ellipse(chain1.x, chain1.y, 13, 13);
  //ellipse(chain2.x, chain2.y, 13, 13);
  //ellipse(chain3.x, chain3.y, 13, 13);

  //for(int i=0; i<segmentNum; i+=1){
  //  join(body,i) = new PVector();
  //  bodySpd[i] = new PVector();
  //}
  curve(chain1.x+200,chain1.y+200,chain2.x,chain2.y,chain1.x,chain1.y,chain2.x+200,chain2.y+200);
  curve(chain1.x-200,chain1.y-200,chain2.x,chain2.y,chain1.x,chain1.y,chain2.x-200,chain2.y-200);

  curve(chain2.x+200,chain2.y+200,chain3.x,chain3.y,chain2.x,chain2.y,chain3.x+200,chain3.y+200);
  curve(chain2.x-200,chain2.y-200,chain3.x,chain3.y,chain2.x,chain2.y,chain3.x-200,chain3.y-200);

  curve(chain3.x+200,chain3.y+200,chain4.x,chain4.y,chain3.x,chain3.y,chain4.x+200,chain4.y+200);
  curve(chain3.x-200,chain3.y-200,chain4.x,chain4.y,chain3.x,chain3.y,chain4.x-200,chain4.y-200);
  
  curve(chain4.x+200,chain4.y+200,chain5.x,chain5.y,chain4.x,chain4.y,chain5.x+200,chain5.y+200);
  curve(chain4.x-200,chain4.y-200,chain5.x,chain5.y,chain4.x,chain4.y,chain5.x-200,chain5.y-200);
  
  curve(chain5.x+200,chain5.y+200,chain6.x,chain6.y,chain5.x,chain5.y,chain6.x+200,chain6.y+200);
  curve(chain5.x-200,chain5.y-200,chain6.x,chain6.y,chain5.x,chain5.y,chain6.x-200,chain6.y-200);
  
  curve(chain6.x+200,chain6.y+200,chain7.x,chain7.y,chain6.x,chain6.y,chain7.x+200,chain7.y+200);
  curve(chain6.x-200,chain6.y-200,chain7.x,chain7.y,chain6.x,chain6.y,chain7.x-200,chain7.y-200);
}
  public void settings() {  size(600, 600);  smooth(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "HW3_Iram_Casey2" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
