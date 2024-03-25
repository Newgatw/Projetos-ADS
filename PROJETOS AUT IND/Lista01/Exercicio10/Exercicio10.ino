/* EXERCICIO 10 */

const int button1 = 6;
const int button2 = 4;
const int led = 3;    

void setup() {
  pinMode(button1, INPUT_PULLUP); 
  pinMode(button2, INPUT_PULLUP);
  pinMode(led, OUTPUT);            
}

void loop() {
  int button1State = digitalRead(button1); 
  int button2State = digitalRead(button2);  

  if (button1State == HIGH) {
    digitalWrite(led, HIGH);
  }


  if (button2State == HIGH) {
    digitalWrite(led, HIGH);
  }

  if (button1State == HIGH && button2State == HIGH) {

    while(true ){
    digitalWrite(led, LOW);
    delay(500);
    digitalWrite(led, LOW);
    delay(500);
    }
  }
}
