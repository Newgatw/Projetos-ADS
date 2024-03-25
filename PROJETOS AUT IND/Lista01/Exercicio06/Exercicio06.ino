int rd = 3;
int yw = 4;
int gn = 5;
int button = 2;
int clickCount = 0;

void setup(){
  
  pinMode(button, INPUT);
  
  for(int i=3; i<=5; i++){
  
  pinMode(i, OUTPUT);
  
  }



}


void loop(){

  bool buttonState = digitalRead(2);
  
  if(buttonState == 1){
    
    delay(500);
    clickCount++;

    switch(clickCount){
  
    case 1:
    ledMix(1,0,0);
    break;
    case 2:
    ledMix(0,1,0);
    break;
    case 3:
    ledMix(0,0,1);
    break;
      
    default: clickCount = 0;
  
  }
	
    
  }

}

int ledMix(int a, int b, int c){

digitalWrite(3,a);
digitalWrite(4,b);
digitalWrite(5,c);
}