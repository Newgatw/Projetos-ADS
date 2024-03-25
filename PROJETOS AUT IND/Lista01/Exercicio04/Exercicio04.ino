int rd = 3;
int yw = 4;
int gn = 5;

void setup(){

  for(int i=3; i<=5; i++){
  
  pinMode(i, OUTPUT);
  
  }



}


void loop(){

  for(float i=5.0; i<=5000; i=i+(i*0.15)){
    
	ledMix(1,0,0);
    delay(i);
	ledMix(0,1,0);
    delay(i);
	ledMix(0,0,1);
    delay(i);
    
  }

}

int ledMix(int a, int b, int c){

digitalWrite(3,a);
digitalWrite(4,b);
digitalWrite(5,c);
}