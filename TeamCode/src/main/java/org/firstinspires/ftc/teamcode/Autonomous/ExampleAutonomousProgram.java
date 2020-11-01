package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.HardwareNames;


@Autonomous(name = "ExampleAutonomousProgram", group = "Example")
public class ExampleAutonomousProgram extends LinearOpMode {
    // you can add more motors or servos here
    DcMotor backRightWheel;
    DcMotor backLeftWheel;
    DcMotor frontRightWheel;
    DcMotor frontLeftWheel;

    @Override
    public void runOpMode() throws InterruptedException {
    backLeftWheel = hardwareMap.dcMotor.get("Back Left Wheel");
    backRightWheel = hardwareMap.dcMotor.get("Back Right Wheel");
    frontLeftWheel = hardwareMap.dcMotor.get("Front Left Wheel");
    frontRightWheel = hardwareMap.dcMotor.get("Front Right Wheel");
    backLeftWheel.setDirection(DcMotor.Direction.REVERSE);

    // wait for start

    // now you can start programming autonomous with moving the robot or moving the servos


    }
}
