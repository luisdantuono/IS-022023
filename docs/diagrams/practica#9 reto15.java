
  public class CoffeMaker{

      String On(){
      return "yes";
     }
     
      String turnOff(){
      return "no"
     }
     
     } 

      String isOn(){
      return "a";
     }

}


public class AdapterCoffeMaker extends Conectable
{
	CoffeMaker coffemaker;
	
	public AdapterCoffeMaker(){

      this.coffemaker=new CoffeMaker();
	}

      String turnOn(){
      return this.coffemaker.On();
     }
     
      String turnOff(){
      return this.coffemaker.Off();
     }
     
     

      String isOn(){
      return this.coffemaker.isOff();
     }
     
}

public class TurnOnDevices {

 

 public static void main(String[] args) {
 
turnOnDevice(new Lamp()); 
 turnOnDevice(new Computer());
 turnOnDevice(new AdapterCoffeMaker());
 }
 
 private static void turnOnDevice(Connectable device) {
 device.turnOn();
 System.out.println(device.isOn());
 }
}

