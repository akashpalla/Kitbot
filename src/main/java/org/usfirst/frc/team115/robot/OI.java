package org.usfirst.frc.team115.robot;

import org.usfirst.frc.team115.robot.commands.IntakeHatch1;
import org.usfirst.frc.team115.robot.commands.IntakeHatch2;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick joystick;
	JoystickButton extendHatch1;
	JoystickButton extendHatch2; 

	public OI(){
		joystick = new Joystick(0);
		extendHatch1 = new JoystickButton(joystick, 2);
		extendHatch2 = new JoystickButton(joystick, 2);
		
		extendHatch1.whenPressed(new IntakeHatch1());
		extendHatch2.whenPressed(new IntakeHatch2());
	
	}
	
	public double getThrottle() {
		return joystick.getRawAxis(0);
	}
	
	public double getWheel() {
		return joystick.getRawAxis(1);
	}
}
