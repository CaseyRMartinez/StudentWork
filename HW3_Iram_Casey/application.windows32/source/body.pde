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
