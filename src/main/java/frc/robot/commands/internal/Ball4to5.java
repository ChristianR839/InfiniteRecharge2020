/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.internal;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Transport;

public class Ball4to5 extends CommandBase 
{

  private final Transport m_transportMechanism;

  /**
   * Creates a new Ball4to5.
   */
  public Ball4to5(Transport transport) 
  {
    // Use addRequirements() here to declare subsystem dependencies.
    m_transportMechanism = transport;
    addRequirements(m_transportMechanism);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() 
  {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute()
  {
    m_transportMechanism.Stage2In();
    m_transportMechanism.Stage3In();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted)
  {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() 
  {
    return ((Transport.READABLE_VALUE & Transport.SENSOR_5) != 0);
  }
}
