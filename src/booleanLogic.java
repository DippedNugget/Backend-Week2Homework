/**
 * 
 */

/**
 * @author DippedNugget
 *
 */
public class booleanLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Answers to Boolean Expression Table");
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false));
		System.out.println(false || 1<5);
		System.out.println(5 >=4 && 1>3);
		System.out.println(10<4 || 1>4);
		System.out.println(12>=2 && 1<24);
		System.out.println("Hello".charAt(0)=='h');
		
		System.out.println(' ');
		
		//Variables
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		double costOfMilk = 2.27;
		double moneyInWallet = 11;
		int thirstLevel = 3;
		
		//Variables Created with Boolean Operators
		boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println("4a" + ' ' + shouldBuyIcecream);
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println("4b" + ' ' + willGoSwimming);
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		System.out.println("4c" + ' ' + isAGoodDay);
		boolean willBuyMilk = isHotOutside && thirstLevel>=3 && moneyInWallet>=2*costOfMilk;
		System.out.println("4d" + ' ' + willBuyMilk);
		 
		
	}
		
}	
	

		   		
	