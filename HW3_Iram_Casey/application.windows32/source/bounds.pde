void bounds() {
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
