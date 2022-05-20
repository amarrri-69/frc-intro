package frc.robot.subsystems.intake.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intake.Intake;

public class OuttakeBall extends CommandBase {
  public Intake intake;

  public OuttakeBall(Intake intake) {
    this.intake = new Intake();
    addRequirements(intake);
  }

  @Override
  public void execute() {
    this.Intake.setVelocity(-this.Intake.onVelocity);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
    this.intake.setPower(0);
  }
}