void chain1() {
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
