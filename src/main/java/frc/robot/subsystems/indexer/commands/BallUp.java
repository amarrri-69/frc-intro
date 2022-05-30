package frc.robot.subsystems.indexer.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.indexer.Indexer;
import frc.robot.Constants;

public class BallUp extends CommandBase {
  public Indexer indexer;
  public double numOfBall;

  public BallUp(Indexer indexer, double numOfBall) {
    this.numOfBall = numOfBall;
    this.indexer = new Indexer();
    addRequirements(indexer);
  }

  @Override
  public void execute() {
    this.indexer.setEncoder(Constants.Indexer.kOneBallTick * numOfBall);
  }

  @Override
  public boolean isFinished() {
    return false;
  }

  @Override
  public void end(boolean interrupted) {
    this.indexer.setPower(0);
  }
}
