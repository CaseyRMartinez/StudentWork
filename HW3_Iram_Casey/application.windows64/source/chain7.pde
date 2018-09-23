void chain7() {
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
