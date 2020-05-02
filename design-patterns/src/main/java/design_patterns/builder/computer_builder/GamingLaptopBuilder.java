package design_patterns.builder.computer_builder;

import java.util.ArrayList;

public class GamingLaptopBuilder extends ComputerBuilder {
	
	public GamingLaptopBuilder() {
		price = -1;
		company = "NA";
		rams = new ArrayList<Ram>();
		hardDrives = new ArrayList<HardDrive>();
		battery = null;
		ports = new ArrayList<Port>();
				
	}

	public Computer build() {
		if(name == null) throw new IllegalStateException("Invalid name");
		if(rams.size() <=1) throw new IllegalStateException("Insufficienct RAM");
		if(hardDrives.size() < 2) throw new IllegalStateException("Insufficient Hard drive");
		if(battery == null) throw new IllegalStateException("Battery not available");
		if(ports.size() <= 2) throw new IllegalStateException("Insufficient ports");
		return new Computer(this);		
	}

	@Override
	public ComputerBuilder name(String name) {
		this.name = name;
		return this;
	}

	@Override
	public ComputerBuilder company(String company) {
		this.company = company;
		return this;
	}

	@Override
	public ComputerBuilder price(double price) {
		this.price = price;
		return this;
	}

	@Override
	public ComputerBuilder version(String version) {
		this.version = version;
		return this;
		
	}

	@Override
	public ComputerBuilder ram(String type, int capacity) {
		this.rams.add(new Ram(type, capacity)); 
		return this;
	}

	@Override
	public ComputerBuilder hardDrive(String type, int capacity) {
		this.hardDrives.add(new HardDrive(type, capacity));
		return this;
	}

	@Override
	public ComputerBuilder port(String type) {
		this.ports.add(new Port(type));
		return this;
	}

	@Override
	public ComputerBuilder battary(String type) {
		this.battery = new Battery(type);
		return this;
		
	}


}
