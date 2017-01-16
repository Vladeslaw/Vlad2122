public class Foodgoods {
	public char name // name of the rpoduct
	public float prc; // price in dollars
	public float mas; // weight in kilograms
	public float vol; // volume in liters
	public byte expd; // day of expiration 
	public byte expm; // motnth of expiration 
	public byte expy; // year of expiration 
	public byte dis; // % of discount
	private boolean eco // is a product ecologibally clean
	private boolean fat // does a product contain animal fat
	private short pcs; // number of pieces to buy
	
	public unpack(); // to unpack, unfold the product
	public moveToClos(); // to place a product into closet
	public moveToFrid(); // to place a product into fridge
	private moveToBas(); // to place a product into basement
	public dropToDish(); // to place a product into dish
	public moveToMicro(); // to place a product into microwave
	public putOnPan(); // to place product onto frying pan
	private putOnConservation(); // to conservate the product
	private moveToTrash(); // to trough out a product
	private moveToShop(); // to return product back to shop
	}