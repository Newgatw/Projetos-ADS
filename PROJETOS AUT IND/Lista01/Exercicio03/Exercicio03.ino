int a,b,c,d,e,f,g;
int botao;
bool estadoBotao;
void setup(){

botao = 2;
pinMode(botao, INPUT);

  for(int i=3; i<=9; i++){
  
  pinMode(i, OUTPUT);
  
  }

}

void loop(){
  
estadoBotao = digitalRead(botao);

  if(estadoBotao == HIGH){
  
    controlador(1,1,1,1,1,1,0,1);//n0
	controlador(0,1,1,0,0,0,0,1);//n1
    controlador(1,1,0,1,1,0,1,1);//n2
    controlador(1,1,1,1,0,0,1,1);//n3
    controlador(0,1,1,0,0,1,1,1);//n4
    controlador(1,0,1,1,0,1,1,1);//n5
    controlador(1,0,1,1,1,1,1,1);//n6
    controlador(1,1,1,0,0,0,0,1);//n7
    controlador(1,1,1,1,1,1,1,1);//n8
    controlador(1,1,1,1,0,1,1,1);//n9
    controlador(0,0,0,0,0,0,0,0);//out
    
    delay(1000);
    
    controlador(1,1,1,1,0,1,1,1);//n9
    controlador(1,1,1,1,1,1,1,1);//n8
    controlador(1,1,1,0,0,0,0,1);//n7
    controlador(1,0,1,1,1,1,1,1);//n6
    controlador(1,0,1,1,0,1,1,1);//n5
    controlador(0,1,1,0,0,1,1,1);//n4
    controlador(1,1,1,1,0,0,1,1);//n3
    controlador(1,1,0,1,1,0,1,1);//n2
    controlador(0,1,1,0,0,0,0,1);//n1
    controlador(1,1,1,1,1,1,0,1);//n0
    controlador(0,0,0,0,0,0,0,0);//out
  
    
  
  }


}

void controlador(int a, int b, int c, int d, int e, int f, int g, int cachorro){
  
digitalWrite(3,a);
digitalWrite(4,b);
digitalWrite(5,c);
digitalWrite(6,d);
digitalWrite(7,e);
digitalWrite(8,f);
digitalWrite(9,g);
delay(cachorro*=1000);



}