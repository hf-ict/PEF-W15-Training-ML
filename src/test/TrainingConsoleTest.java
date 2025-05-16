package test;

import logic.TrainingRide;

public class TrainingConsoleTest {

	public static void main(String[] args) {

		TrainingRide ride = new TrainingRide(60, 2);
		System.out.println("1. Etappe mit " + ride.getDistance() + "km und " + ride.getDuration() + "h.");
		System.out.println("Durchschnittsgeschw.: " + ride.getAverageSpeed() + "km/h");
		
		TrainingRide stage = new TrainingRide(25, 1);
		System.out.println("2. Etappe mit " + stage.getDistance() + "km und " + stage.getDuration() + "h.");
		ride.addStage(stage);
		System.out.println("Trainingstag mit insg. " + ride.getDistance() + "km und " + ride.getDuration() + "h.");
		System.out.println("Durchschnittsgeschw.: " + ride.getAverageSpeed() + "km/h");
	}

}
