package frc.robot.subsystems.intake;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  public final CANSparkMax intakeMotor;
  public final RelativeEncoder intakeEncoder;
  public SparkMaxPIDController intakeController;

  private double onVelocity;

  public Intake(double onVelocity) {
    this.intakeMotor = new CANSparkMAX(Constants.Intake.kPort, MotorType.kBrushless);
    this.intakeEncoder = this.intakeMotor.getEncoder();
    this.intakeController = this.intakeMotor.getPIDController();
    intakeMotor.setIdleMode(IdleMode.kBrake);
    
    this.intakeController.setP(Constants.Intake.kP);
    this.intakeController.setI(Constants.Intake.kI);
    this.intakeController.setD(Constants.Intake.kD);
    this.intakeController.setFF(Constants.Intake.kFF);

    this.onVelocity = onVelocity;
  }

  public void setPower(double power) {
    intakeMotor.set(power);
  }

  public double getVelocity() {
    return this.intakeEncoder.getVelocity();
  }

  public void setVelocity(double velocity) {
    this.intakeController.setReference(velocity, CANSparkMax.ControlType.kVelocity);
    
  }
}
