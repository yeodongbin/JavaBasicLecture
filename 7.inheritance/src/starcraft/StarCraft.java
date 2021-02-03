package starcraft;
                                                  
public class StarCraft {

	public static void main(String[] args) {
		Marine marine = new Marine();
		Firebet firebet = new Firebet();
		SCV scv = new SCV();
		
		System.out.println(firebet.hp);
		marine.attack(firebet);
		System.out.println(firebet.hp);
		marine.attack(scv);
	}

}

//Vehicle
//String  type
//void run()
//-----------------
//|                   |
//Bus                 Texi
//Bus(Driver)        Texi(Driver)
//void price()        void price()
//void run()          void run()
//
//Driver
//name
//
//
//  Units
// int x,y;
// int hp
// int mp
// int attackLevel
// int defenceLevel
// String type
// void move(int x, int y)
//Worker  		     Soilder	       Vehicle
//void mine(int x, int y)   void attack(Units)    void upgrade() 3번
//                                               attackLevel++
//                                               defenceLevel++
//-SCV
//void fix(SCV or Vehicle)
//	    
//-Drone		    - Marine   	       -Tank
//                     void stimpac()          String mode = Normal, Siege  
//                     attacklevel++
//                     hp--
//-Prove		    - Firebet                  
//                     void stimpac()   
//                     attacklevel++    
//                     hp-- 