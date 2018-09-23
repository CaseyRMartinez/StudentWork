void chain6() {
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
