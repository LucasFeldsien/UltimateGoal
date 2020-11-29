package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp(name="EXAMPLE", group="TeleOp")
@Disabled
class TeleOpExample extends OpMode {

        DriveTrainMethodTeleOp drivetrain = null;

        @Override
        public void init() {
            drivetrain = new DriveTrainMethodTeleOp();
            //drivetrain.driveMotors(HardwareMap);
        }
        @Override
        public void loop() {
            drivetrain.omnidirectional(gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.left_stick_x);
            /*robot.turndrive(gamepad1);*/
        }
}