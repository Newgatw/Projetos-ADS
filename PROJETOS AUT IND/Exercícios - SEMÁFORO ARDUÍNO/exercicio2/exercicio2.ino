/*
O semáforo deve conter  as seguintes funções:

Iniciar no amarelo piscante, por 3x.

depois que iniciou, ele vai ficar em repetição.
fazendo a seguinte ordem:

Verde (5s)
Amarelo (3s)
Vermelho (5s)


*/

int vermelho = 2;
int amarelo = 3;
int verde = 4;

void setup (){
  
pinMode(vermelho, OUTPUT);
pinMode(amarelo, OUTPUT);
pinMode(verde, OUTPUT);

digitalWrite(amarelo,HIGH);
delay(1000);
digitalWrite(amarelo,LOW);
delay(1000);
digitalWrite(amarelo,HIGH);
delay(1000);
digitalWrite(amarelo,LOW);
delay(1000);
digitalWrite(amarelo,HIGH);
delay(1000);
digitalWrite(amarelo,LOW);
delay(1000);

}

void loop (){

digitalWrite(verde,HIGH);
delay(5000);
digitalWrite(verde,LOW);
delay(1000);
digitalWrite(amarelo,HIGH);
delay(3000);
digitalWrite(amarelo,LOW);
delay(1000);
digitalWrite(vermelho,HIGH);
delay(5000);
digitalWrite(vermelho,LOW);
}
