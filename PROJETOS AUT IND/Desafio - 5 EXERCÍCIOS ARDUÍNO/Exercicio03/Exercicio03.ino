int led = 4;
int botao = 2;
bool bpress = 0;

void setup() {
  
  pinMode(led, OUTPUT);
  pinMode(botao , INPUT);

}

void loop() {
  
  bpress = digitalRead(botao);
  
  if(bpress == 1)

  digitalWrite(led, HIGH);
  
  else {
  
  	digitalWrite (led, LOW);
    
  }
}