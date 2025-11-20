import java.util.*;
class Main {
	public static void main(String[] args) {
		Playlist p = new Playlist("Fisrt Playlist");

		p.addTrack("said lambda !!");

		List<String> Up = p.getTracks();
		System.out.println(Up);

		BankAccount b = new BankAccount("said123",10000);


	}
}