package inheritanceLearnin;
import java.util.*;

public class MainProgram {

	public static void main(String[] args) {
		String cakeFlavour, event,stringLayers;
		int layers = 0;
		Boolean error;
		
		
		System.out.println("What flavour of cake would you like?");
		Scanner cakeInput = new Scanner(System.in);
		//Opens a scanner for the flavour of cake
		 cakeFlavour = cakeInput.next();
		 
		 
		 System.out.println("What event would you like the cake to be made for?");
		 Scanner eventInput = new Scanner(System.in);
		 //Opens a scanner for the flavour of cake
		 event = eventInput.next();
		 //assigns the input to the event
		 
		 System.out.println("How many layers of the cake would you like?");
		 Scanner layerInput = new Scanner(System.in);
		 stringLayers = layerInput.next();
		 do {
		 try 
		 {
			 layers =Integer.parseInt(stringLayers);
			 error = false;
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("ERROR, please enter how many layers of the cake would you like?");
			 stringLayers = layerInput.next();
			error =true;
			 
		 }
		 }
		 while (error != false);
		 
		Cakes cake = new Cakes(cakeFlavour,event,layers);
		 System.out.println("The flavour of the cake is "+ cake.GetFlavour());
		 System.out.println("The event the cake is being made for is a"+ cake.GetEvent());
		 System.out.println("There are "+cake.GetLayersr()+" layers of cake being made.");
		 cakeInput.close();
		 eventInput.close();
		 layerInput.close();
	}

}
