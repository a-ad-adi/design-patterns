package design_patterns.builder.computer_builder;

import java.util.List;

public class Computer {
	private String name;
	private String company;
	private double price;
	private String version;
	private List<Ram> rams;
	private List<HardDrive> hardDrives;
	private List<Port> ports;
	private Battery battery;
	
	public Computer(ComputerBuilder cb) {
		name = cb.name;
		company = cb.name;
		price = cb.price;
		version = cb.version;
		rams = cb.rams;
		hardDrives = cb.hardDrives;
		ports = cb.ports;
	}

	@Override
	public String toString() {
		return "Computer [name=" + name + ", company=" + company + ", price=" + price + ", version=" + version
				+ ", rams=" + rams + ", hardDrives=" + hardDrives + ", ports=" + ports + ", battery=" + battery + "]";
	}
}
