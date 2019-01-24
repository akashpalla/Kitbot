package org.usfirst.frc.team115.robot.subsystems;

import org.usfirst.frc.team115.robot.commands.DriveWithJoystick;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain extends Subsystem{

	WPI_TalonSRX frontLeft, backLeft, frontRight, backRight;
	SpeedControllerGroup leftDrive;
	SpeedControllerGroup rightDrive;	
	DifferentialDrive drive;
	
	
	public Drivetrain() {
		frontLeft = new WPI_TalonSRX(12);
		backLeft = new WPI_TalonSRX(13);
		frontRight = new WPI_TalonSRX(7);
		backRight= new WPI_TalonSRX(14);
		leftDrive = new SpeedControllerGroup(frontLeft, backLeft);
		rightDrive = new SpeedControllerGroup(frontRight, backRight);
		drive = new DifferentialDrive(leftDrive, rightDrive);
	}
	
	public void drive(double speed, double turnRate){
		drive.arcadeDrive(speed, turnRate);
	}
	
	public void stop() {
		drive.stopMotor();
	}
	
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithJoystick());
	}

}
