import java.util.*;
	
class TeleVisionAssignment{

	public static void main(String []arg){
		String status;
		boolean var = false;
		int iVolume;
		int dVolume;
		int channel;
		TeleVision tv = new TeleVision(false,0,1);
		
		System.out.println("Enter the status ON or OFF");
		Scanner sc = new Scanner(System.in);
		status = sc.nextLine();
		if(status.equals("on")){
			var=true;
			System.out.println("Enter the increase volume");
			iVolume = sc.nextInt();
			System.out.println("volume increased to "+tv.increaseVolume(iVolume));

			System.out.println("Enter the decrease volume");
			dVolume = sc.nextInt();
			System.out.println("volume decreased to "+tv.decreaseVolume(dVolume));

			System.out.println("Enter the channel number");
			channel = sc.nextInt();
			System.out.println("channel changed to "+tv.changeChannel(channel));
		}
		else
		{
			var = false;
		}

		
		var = tv.onOff(false);
		if(var==true){
			
			System.out.println("tv is ON");
		}
		else{
			System.out.println("tv is OFF");
		}
			
	}

}