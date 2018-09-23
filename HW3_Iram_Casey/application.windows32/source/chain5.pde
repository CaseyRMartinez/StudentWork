void chain5() {
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
