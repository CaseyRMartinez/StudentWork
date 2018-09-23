void chain4() {
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
