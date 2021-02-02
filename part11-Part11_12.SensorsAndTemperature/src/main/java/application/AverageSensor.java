package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

	private final List<Sensor> sensors;
	private final List<Integer> readings;

	public AverageSensor() {
		this.sensors = new ArrayList<>();
		this.readings = new ArrayList<>();
	}

	public void addSensor(Sensor sensor) {
		sensors.add(sensor);
	}

	@Override
	public boolean isOn() {
		return sensors.stream().allMatch(Sensor::isOn);
	}

	@Override
	public void setOn() {
		sensors.forEach(Sensor::setOn);
	}

	@Override
	public void setOff() {
		sensors.forEach(Sensor::setOff);
	}

	@Override
	public int read() {
		if (!isOn() || sensors.isEmpty()) {
			throw new IllegalStateException("Cannot read when empty or off.");
		}
		int avg = (int) sensors.stream().mapToInt(Sensor::read).average().orElse(-1);
		readings.add(avg);
		return avg;
	}

	public List<Integer> readings() {
		return readings;
	}

}
