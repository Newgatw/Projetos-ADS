int botao, ledverde, estadobotao;
int tempo;

void setup(){

ledverde = 4;
  
botao = 6;

tempo = 3000;

  pinMode(4, OUTPUT);
  pinMode(6, INPUT);
  
}

void loop(){
  
  estadobotao = digitalRead(6);
  
  if (estadobotao == 1){
  
    digitalWrite(4,1);
    delay(tempo);
    digitalWrite(4,0);
  
  }
}