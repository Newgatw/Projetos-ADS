/* Semáforo simples:

    Conecte três LEDs a pinos digitais para representar um semáforo.
    Escreva um programa que faça o semáforo seguir o padrão de funcionamento real (verde, amarelo, vermelho).

*/

int vermelho = 3;
int amarelo = 4;
int verde = 5;

void setup() {
  
  pinMode(vermelho, OUTPUT);
  pinMode(amarelo, OUTPUT);
  pinMode(verde, OUTPUT);

}

void loop() {
  
  digitalWrite(verde, HIGH);
  delay(3000);

  digitalWrite(verde, LOW);
  digitalWrite(amarelo, HIGH);
  delay(2000);

  digitalWrite(amarelo, LOW);
  digitalWrite(vermelho, HIGH);
  delay(3000);

  digitalWrite(vermelho, LOW);

}