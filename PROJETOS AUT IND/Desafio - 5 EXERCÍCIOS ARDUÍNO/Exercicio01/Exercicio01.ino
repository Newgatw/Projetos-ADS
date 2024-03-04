int verde = 4;
int botao = 6;
bool bpress = 0;

void setup() {
  
  pinMode(verde, OUTPUT);
  pinMode(botao , INPUT);

}

void loop() {
  
  bpress = digitalRead(botao);
  
  if(bpress == 1)

  digitalWrite(verde, HIGH);
  
  else {
  
  	digitalWrite (verde, LOW);
    
  }
}