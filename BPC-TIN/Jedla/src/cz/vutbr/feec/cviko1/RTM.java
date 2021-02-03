package cz.vutbr.feec.cviko1;

public class RTM {

	public static void main(String[] args) {
		Packet packet1 = new Packet(1);
		Packet packet2 = new Packet(2);
		Packet packet3 = new Packet(3);
		Packet packet4 = new Packet(4);
		Packet packet5 = new Packet(5);
		Packet packet6 = new Packet(6);

		packet1.addPacket(packet2);
		packet1.addPacket(packet4);
		packet1.addPacket(packet5);
		packet1.addPacket(packet6);

		packet2.addPacket(packet1);
		packet2.addPacket(packet3);
		packet2.addPacket(packet5);

		packet5.addPacket(packet4);

		System.out.println(packet1.database);

	}

}
