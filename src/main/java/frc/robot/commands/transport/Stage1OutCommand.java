// /*----------------------------------------------------------------------------*/
// /* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
// /* Open Source Software - may be modified and shared by FRC teams. The code   */
// /* must be accompanied by the FIRST BSD license file in the root directory of */
// /* the project.                                                               */
// /*----------------------------------------------------------------------------*/

// package frc.robot.commands.transport;

// import edu.wpi.first.wpilibj2.command.CommandBase;
// import frc.robot.subsystems.Transport;

// public class Stage1OutCommand extends CommandBase {

//   private final Transport transportStage1;

//   /**
//    * Creates a new Stage1InCommand.
//    */
//   public Stage1OutCommand(Transport transport) {
//     // Use addRequirements() here to declare subsystem dependencies.
//     transportStage1 = transport;
//     addRequirements(transportStage1);
//   }

//   // Called when the command is initially scheduled.
//   @Override
//   public void initialize() {
//     transportStage1.Stage1Out();
//   }

//   // Called every time the scheduler runs while the command is scheduled.
//   @Override
//   public void execute() {
//   }

//   // Called once the command ends or is interrupted.
//   @Override
//   public void end(boolean interrupted) {
//     transportStage1.Stage1Stop();
//   }

//   // Returns true when the command should end.
//   @Override
//   public boolean isFinished() {
//     return false;
//   }
// }
