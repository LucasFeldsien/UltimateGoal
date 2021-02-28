package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="DrivetrainTeleOp", group="TeleOp")
//@Disabled

public class DrivetrainTeleOp extends OpMode {
    double power = 1;

    DriveTrainMethodTeleOp drivetrain;

    @Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp(hardwareMap);
    }
    /*@Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp();
        drivetrain.driveMotors(hardwareMap);
    }*/

    @Override
    public void loop() {
        power = drivetrain.motorPower(power,gamepad1.a, gamepad1.b,gamepad1.x,gamepad1.y);

        if (Math.abs(gamepad1.left_stick_y ) <=0.1 && Math.abs(gamepad1.left_stick_y ) <=0.1) {
            drivetrain.turn(power, gamepad1.right_stick_x);
        }
        else {
            drivetrain.omnidirectional(power, gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);
        }
    }
}
