void chain3() {
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
