package application;

import java.util.Scanner;
import entities.Rooms;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();

		Rooms[] vectRooms = new Rooms[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1) + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String temporaryName = sc.nextLine();
			System.out.print("Email: ");
			String temporaryEmail = sc.next();
			System.out.print("Room: ");
			int temporaryRoomNumber = sc.nextInt();
			vectRooms[temporaryRoomNumber] = new Rooms(temporaryName, temporaryEmail);
			System.out.println();
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < vectRooms.length; i++) {
			if (vectRooms[i] != null) {
				System.out.println(i + ": " + vectRooms[i]);
			}
		}

		sc.close();
	}
}
