interfaceAssaultable{
//�ɹ�����  
void attack();
 }   
interface Mobile{
//���ƶ���  
void move();
 }   
abstractclass  Weapon implementsAssaultable,Mobile { 
 publicvoid attack(){}
  publicvoid move(){}  
}   
class Tank extends Weapon{ 
 publicvoid attack(){  
  System.out.println("̹�˹���������");
  }    
 publicvoid move(){   
 System.out.println("̹���ƶ�������");
  }
  }  
 classFlighterextends Weapon{ 
 publicvoid attack(){  
  System.out.println("ս��������������");  
}     publicvoid move(){ 
    System.out.println("ս�����ƶ�������"); 

 } 
 } 
  classWarshipextends Weapon{ 
 publicvoid attack(){ 
   System.out.println("ս������������"); 
 }    
  publicvoid move(){  
  System.out.println("ս���ƶ�������"); 
 } 
 }  
 class Army{  
 Weapon[] w;
 intmax;
 intj=0; 
  publicintgetMax() {
   returnmax; 
 }  
  publicvoidsetMax(int max) {  
 this.max = max;
  }  
  public Army(int max){ 
  w= newWeapon[max]; 
   this.max=max; 
   System.out.println("�����ӵ��"+max+"������������");  
 }     
publicvoidaddWeapon(Weapon wa){ 
  if(j<getMax()){
    System.out.println("�������㹻��"+"������"+(j+1)+"������"); 
   w[j]=wa; 
   j++;
    }  
 else{   
  System.out.println("���棺����������������������������������");
   } 
  }     
 publicvoidattackAll(){ 
  System.out.println(); 
   System.out.println("��������׼��ս��������"); 
  for(int i=0;i<w.length;i++){ 
   System.out.print((i+1)+"��"); 
   w[i].attack();
    }  
    }   
  publicvoidmoveAll(){ 
  System.out.println(); 
   System.out.println("��������׼���ƶ�������"); 
  for(int i=0;i<w.length;i++){ 
   System.out.print((i+1)+"��");  
  w[i].move();  
  }  
 } 
 }  
 publicclass Test1 { 
 publicstaticvoid main(String[] args){ 
  Army a = newArmy(4); 
  a.addWeapon(new Tank()); 
  a.addWeapon(newFlighter()); 
  a.addWeapon(newWarship());
   a.addWeapon(newWarship());  
 a.addWeapon(newWarship()); 
  a.moveAll(); 
  a.attackAll(); 
      } 
 } 