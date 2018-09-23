void render() {
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
