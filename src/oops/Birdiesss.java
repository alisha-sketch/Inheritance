package oops;
class duck implements Birds{
	public void sound() {
		System.out.println("quack...");
	}
}

public class Birdiesss implements Birds{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Birdiesss b=new Birdiess();
       b.sound();
       b=new Birdiesss();
       
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Tweet...");
		System.out.println("quack...");
	}

}



	

