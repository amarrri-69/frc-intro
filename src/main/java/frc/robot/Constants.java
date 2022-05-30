package frc.robot;

public class Constants {
    public static final class Trajectory {
        public static final double kDistPerRot = 3.072 / 100;
    }

    public static final class Indexer {
      public static final int kPort = 0;
      public static final double kOneBallTick = 0.69;
    }

    public static final class Drivetrain {
        public static final double kThrottleFilter = 1.5;
        public static final double kTurnFilter = 1.5;

        public static final double kIterativeTurningAdjustment = 0.1;
        public static final double kAcceptableTurningError = 3.0;

        public static final double kSafeForwardThrottle = 0.05;
    }
    
    public static final class Intake {
        public static final int kPort = 0;
        public static final double kP = 0;
        public static final double kI = 0;
        public static final double kD = 0;
        public static final double kFF = 0;
    }
}
