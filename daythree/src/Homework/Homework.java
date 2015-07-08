interfaceAssaultable{
//可攻击的  
void attack();
 }   
interface Mobile{
//可移动的  
void move();
 }   
abstractclass  Weapon implementsAssaultable,Mobile { 
 publicvoid attack(){}
  publicvoid move(){}  
}   
class Tank extends Weapon{ 
 publicvoid attack(){  
  System.out.println("坦克攻击！！！");
  }    
 publicvoid move(){   
 System.out.println("坦克移动！！！");
  }
  }  
 classFlighterextends Weapon{ 
 publicvoid attack(){  
  System.out.println("战斗机攻击！！！");  
}     publicvoid move(){ 
    System.out.println("战斗机移动！！！"); 

 } 
 } 
  classWarshipextends Weapon{ 
 publicvoid attack(){ 
   System.out.println("战船攻击！！！"); 
 }    
  publicvoid move(){  
  System.out.println("战船移动！！！"); 
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
   System.out.println("您最多拥有"+max+"个武器！！！");  
 }     
publicvoidaddWeapon(Weapon wa){ 
  if(j<getMax()){
    System.out.println("武器库足够！"+"已增加"+(j+1)+"个武器"); 
   w[j]=wa; 
   j++;
    }  
 else{   
  System.out.println("警告：武器库已满！！！不能增加武器！！！");
   } 
  }     
 publicvoidattackAll(){ 
  System.out.println(); 
   System.out.println("所有武器准备战斗！！！"); 
  for(int i=0;i<w.length;i++){ 
   System.out.print((i+1)+"号"); 
   w[i].attack();
    }  
    }   
  publicvoidmoveAll(){ 
  System.out.println(); 
   System.out.println("所有武器准备移动！！！"); 
  for(int i=0;i<w.length;i++){ 
   System.out.print((i+1)+"号");  
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