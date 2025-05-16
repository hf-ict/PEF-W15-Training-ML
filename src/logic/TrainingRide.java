package logic;

public class TrainingRide {

	private double distance; // km
	private double duration; // hours

	public TrainingRide(double distance, double duration) {
		if (distance >= 0 && duration > 0) {
			this.distance = distance;
			this.duration = duration;
		}
	}

	public double getDistance() {
		return this.distance;
	}

	public double getDuration() {
		return this.duration;
	}

	public void addStage(TrainingRide t) {
		if (t != null) {
			this.distance += t.getDistance();
			this.duration += t.getDuration();
		}
	}

	public double getAverageSpeed() {
		double result = 0;
		if (this.duration > 0) {
			result = this.distance / this.duration;
		}
		return result;
	}
}
