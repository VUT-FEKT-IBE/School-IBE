package cz.vutbr.feec.cviko1;

import java.util.ArrayList;
import java.util.List;

public class Packet {
	private int packet;

	List<Packet> database = new ArrayList<Packet>();

	public void addPacket(Packet packet) {
		database.add(packet);
	}

	public Packet(int packet) {
		super();
		this.packet = packet;
	}

	@Override
	public String toString() {
		return "Packet [packet=" + packet + "]";
	}

	public int getPacket() {
		return packet;
	}

	public void setPacket(int packet) {
		this.packet = packet;
	}
}
