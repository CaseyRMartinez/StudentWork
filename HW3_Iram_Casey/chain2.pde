void chain2() {
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
