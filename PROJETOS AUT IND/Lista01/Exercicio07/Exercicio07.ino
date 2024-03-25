int ledverde, botao, estadobotao, clickbotao;
int tempovariado;
int tempoanterior;
int i=0;

unsigned long agora = 0;


void setup(){
  
ledverde = 4;
botao = 6;

pinMode(4, OUTPUT);
pinMode(6, INPUT);
estadobotao=0;
clickbotao=0;
  
}

void loop(){

  if(i>=1){
  
      tempoanterior=millis();
    
    while (millis() < tempoanterior+(1000/i)){


      digitalWrite(ledverde, 1);
      
      if(digitalRead(botao)==1){
      
        i++;
        delay(50);
        
  	    }

	    }
  
        tempoanterior=millis();
    
  while (millis() < tempoanterior+(1000/i)){
    
    digitalWrite(ledverde, 0);
  
      if (digitalRead(botao)== 1){
      
        i++;
        delay(50);
        
      }
    
  	}
  
  }
    else{

      if(digitalRead(botao)){
      i++;
          delay(50);
  
  
  }
}
}

