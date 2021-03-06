/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team115.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */

public class Intake extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public DoubleSolenoid hatch1;
  public DoubleSolenoid hatch2;

  public Intake () {
    hatch1 = new DoubleSolenoid(0, 1);
    hatch2 = new DoubleSolenoid(2, 3);
  }


  public void extendHatch1() {
    hatch1.set(Value.kForward);
  }

  public void extendHatch2() {
    hatch2.set(Value.kForward);
  }

  public void retractHatch1() {
    hatch1.set(Value.kReverse);
  }

  public void retractHatch2() {
    hatch2.set(Value.kReverse);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
