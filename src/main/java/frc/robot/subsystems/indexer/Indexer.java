package frc.robot.subsystems.indexer;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import com.revrobotics.RelativeEncoder;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Indexer extends SubsystemBase {
  public CANSparkMax indexerMotor;
  public final RelativeEncoder indexerEncoder;
  public SparkMaxPIDController indexerController;

  public Indexer() {
    this.indexerMotor = new CANSparkMax(Constants.Indexer.kPort, MotorType.kBrushless);
    this.indexerEncoder = this.indexerMotor.getEncoder();
    this.indexerController = this.indexerMotor.getPIDController();
    
    indexerController.setPosition(0, CANSparkMax.ControlType.kPosition);
  }

  public void setPosition(double position){
    this.indexerController.setReference(position, CANSparkMax.ControlType.kPosition);
  }
  
  public void setPower(double power) {
    this.indexerMotor.set(power);
  }

  public void setEncoder(double count){
    this.indexerEncoder.setPosition(count);
  }
}
