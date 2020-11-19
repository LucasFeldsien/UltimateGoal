package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;

@TeleOp(name="MecanumLucasTest", group="MecanumTest")
@Disabled
class TeleOpExample extends OpMode {

        TeleOpDriveTrain robot = null;
        @Override
        public void init() {
            robot = new TeleOpDriveTrain();
        }
        @Override
        public void loop() {
            robot.diagonal(gamepad1.left_stick_x, gamepad1.left_stick_y);
            /*robot.turndrive(gamepad1);*/
        }
}
