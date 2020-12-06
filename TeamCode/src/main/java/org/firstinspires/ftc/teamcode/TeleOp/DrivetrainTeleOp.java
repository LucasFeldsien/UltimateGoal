package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="DrivetrainTeleOp", group="TeleOp")
//@Disabled

public class DrivetrainTeleOp extends OpMode {

    DriveTrainMethodTeleOp drivetrain;

    @Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        drivetrain.driveMotors(hardwareMap);
    }
    /*@Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        drivetrain.driveMotors(hardwareMap);
    }*/

    @Override
    public void loop() {

        if (Math.abs(gamepad1.left_stick_y ) <=0.1 && Math.abs(gamepad1.left_stick_y ) <=0.1) {
            drivetrain.turn(gamepad1.right_stick_x);
        }
        else {
            drivetrain.omnidirectional(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        }
    }
}
