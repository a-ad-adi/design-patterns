package design_patterns.builder.computer_builder;

import java.util.List;

public abstract class ComputerBuilder {
	String name;
	String company;
	double price;
	String version;
	List<Ram> rams;
	List<HardDrive> hardDrives;
	List<Port> ports;
	Battery battery;
	
	
	public abstract ComputerBuilder name(String name);
	public abstract ComputerBuilder company(String company);
	public abstract ComputerBuilder price(double price);
	public abstract ComputerBuilder version(String version);
	public abstract ComputerBuilder ram(String type, int capacity);
	public abstract ComputerBuilder hardDrive(String type, int capacity);	
	public abstract ComputerBuilder port(String type);
	public abstract ComputerBuilder battary(String type);
	
	public abstract Computer build();
}
