package test;

import logic.TrainingRide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingRideTest {

    private TrainingRide ride;

    @BeforeEach
    void setUp() throws Exception {
        ride = new TrainingRide(60, 2);
    }

    @Test
    void testTrainingRide() {
        ride = new TrainingRide(-0.001, 0); //-1m, 0h
        assertEquals(0, ride.getDuration());
        assertEquals(0, ride.getDistance());

        ride = new TrainingRide(0, 0); //0m, 0h
        assertEquals(0, ride.getDuration());
        assertEquals(0, ride.getDistance());

        ride = new TrainingRide(-0.001, 1); //-1m, 1h
        assertEquals(0, ride.getDuration());
        assertEquals(0, ride.getDistance());
    }

    @Test
    void testGetDistance() {
        assertEquals(60, ride.getDistance());
    }

    @Test
    void testGetDuration() {
        assertEquals(2, ride.getDuration());
    }

    @Test
    void testAddStage() {
        this.ride.addStage(null);
        assertEquals(60, ride.getDistance());
        assertEquals(2, ride.getDuration());

        TrainingRide ride2 = new TrainingRide(30, 0);
        this.ride.addStage(ride2);
        assertEquals(60, ride.getDistance());
        assertEquals(2, ride.getDuration());

        TrainingRide ride3 = new TrainingRide(25, 1);
        this.ride.addStage(ride3);
        assertEquals(85, ride.getDistance());
        assertEquals(3, ride.getDuration());
    }

    @Test
    void testGetAverageSpeed() {
        assertEquals(30, ride.getAverageSpeed(), 0.00001);
        TrainingRide ride2 = new TrainingRide(30, 0);
		assertEquals(0, ride2.getAverageSpeed(), 0.00001);
    }

}