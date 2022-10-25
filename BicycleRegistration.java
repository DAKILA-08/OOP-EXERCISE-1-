
class BicycleRegistration
{

	public static void main(String[] args){

		Bicycle bike_1, bike_2;
		String  owner1, owner2, tagNo1, tagNo2;

	 

		bike_1 =new Bicycle();
		bike_1.setOwnerName("Adam Smith");
		bike_1.settagNo(" 2004-13R");
		
		bike_2 = new Bicycle();
		bike_2.settagNo(" 2004-134R");
	
		//out the information

		owner1 = bike_1.getownerName();
		owner2 = bike_2.getownerName();
		tagNo1 = bike_1.gettagNo();
                tagNo2 = bike_2.gettagNo(); 
		System.out.println(owner1 + " owns a Bicycle with tagNo" + tagNo1);
		System.out.println(owner2 + " also owns a Bicycle with tagNo" + tagNo2);

	}
}
