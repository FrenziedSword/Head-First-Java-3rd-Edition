class DogTestDrive	{
	public static void main(String[] args)	{
		Dog d1 = new Dog();
		d1.name = "Chapa";
		d1.size = 40;
		d1.breed = "BullDog";
		d1.bark();

		Dog d2 = new Dog();
		d2.name = "Fluffy";
		d2.size = 8;
		d2.breed = "Chihuahua";
		d2.bark();
	}
}