//Variaveis Globais

int button = 2;
bool buttonPress = 0;

int redCar= 3;
int yellowCar = 4;
int greenCar= 5;
int greenPedestrian = 6;
int redPedestrian = 7;



void setup(){

pinMode(redCar,OUTPUT);
pinMode(yellowCar,OUTPUT);
pinMode(greenCar,OUTPUT);
pinMode(greenPedestrian,OUTPUT);
pinMode(redCar,OUTPUT);
pinMode(redPedestrian,OUTPUT);
pinMode(button,INPUT);

}

void loop(){

if (buttonPress == 1) {

//VERDE PEDESTRE LIGADO, VERMELHO CARRO LIGADO
digitalWrite(greenPedestrian,HIGH);
digitalWrite(redCar,HIGH);
delay(2000);

//VERDE PEDESTRE DESLIGADO, VERMELHO PISCANTE LIGADO.

digitalWrite(greenPedestrian,LOW);
digitalWrite(redCar,HIGH);

digitalWrite(redPedestrian,HIGH);
delay(200);
digitalWrite(redPedestrian,LOW);
delay(200);

digitalWrite(redPedestrian,HIGH);
delay(200);
digitalWrite(redPedestrian,LOW);
delay(200);

digitalWrite(redPedestrian,HIGH);
delay(200);
digitalWrite(redPedestrian,LOW);
delay(200);

digitalWrite(redCar,LOW);

 //VERMELHO PEDESTRE LIGADO, VERDE CARRO LIGADO.

digitalWrite(redPedestrian,HIGH);
digitalWrite(greenCar,HIGH);
delay(2000);

//VERDE CARRO DESLIGA, AMARELO CARRO PISCANTE LIGA.

digitalWrite(greenCar,LOW);

digitalWrite(yellowCar,HIGH);
delay(200);
digitalWrite(yellowCar,LOW);
delay(200);

digitalWrite(yellowCar,HIGH);
delay(200);
digitalWrite(yellowCar,LOW);
delay(200);

digitalWrite(yellowCar,HIGH);
delay(200);
digitalWrite(yellowCar,LOW);
delay(200);

digitalWrite(redPedestrian,LOW);

}

else {

//VERDE PEDESTRE LIGADO, VERMELHO CARRO LIGADO
digitalWrite(greenPedestrian,HIGH);
digitalWrite(redCar,HIGH);
delay(5000);

//VERDE PEDESTRE DESLIGADO, VERMELHO PISCANTE LIGADO.

digitalWrite(greenPedestrian,LOW);
digitalWrite(redCar,HIGH);

digitalWrite(redPedestrian,HIGH);
delay(500);
digitalWrite(redPedestrian,LOW);
delay(500);

digitalWrite(redPedestrian,HIGH);
delay(500);
digitalWrite(redPedestrian,LOW);
delay(500);

digitalWrite(redPedestrian,HIGH);
delay(500);
digitalWrite(redPedestrian,LOW);
delay(500);

digitalWrite(redCar,LOW);

 //VERMELHO PEDESTRE LIGADO, VERDE CARRO LIGADO.

digitalWrite(redPedestrian,HIGH);
digitalWrite(greenCar,HIGH);
delay(5000);

//VERDE CARRO DESLIGA, AMARELO CARRO PISCANTE LIGA.

digitalWrite(greenCar,LOW);

digitalWrite(yellowCar,HIGH);
delay(500);
digitalWrite(yellowCar,LOW);
delay(500);

digitalWrite(yellowCar,HIGH);
delay(500);
digitalWrite(yellowCar,LOW);
delay(500);

digitalWrite(yellowCar,HIGH);
delay(500);
digitalWrite(yellowCar,LOW);
delay(500);

digitalWrite(redPedestrian,LOW);

buttonPress = digitalRead(button);

}



}













