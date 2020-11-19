package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="DrivetrainTeleOp", group="TeleOp")
@Disabled
class DrivetrainTeleOp extends OpMode {

    DriveTrainMethodTeleOp drivetrain = null;

    @Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        drivetrain.turn(gamepad1.right_stick_x);
        drivetrain.omnidirectional(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        if ((gamepad1.left_stick_x <0 & gamepad1.left_stick_x >0) & (gamepad1.left_stick_y <0 & gamepad1.left_stick_y >0)) {
            drivetrain.turn(gamepad1.right_stick_x);
        }
        else {
            drivetrain.omnidirectional(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        }
    }
}