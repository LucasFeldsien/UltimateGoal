package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name="brrrrr", group="TeleOp")
//@Disabled
public class FedbackFullTeleOp extends OpMode {
    // this code will provide info on every motor and servo
    double power = 1;
    double feetmaxpower = 1;

    DriveTrainMethodTeleOp drivetrain;
    GrabberMethodTeleOp grabber;
    LauncherMethodTeleOp launcher;
    IntakeMethodTeleOp intake;
    IntakeStorageGauge led;

    public void telemetDrive() {
        power = drivetrain.motorPower(power, gamepad1.b, gamepad1.a,gamepad1.x,gamepad1.y);

        if (Math.abs(gamepad1.left_stick_y ) <=0.1 && Math.abs(gamepad1.left_stick_y ) <=0.1) {
            drivetrain.turn(power, gamepad1.right_stick_x);
        }
        else {
            drivetrain.omnidirectional(power, gamepad1.left_stick_x, gamepad1.left_stick_y, gamepad1.right_stick_x);

        }

        telemetry.addData("FL ticks", drivetrain.drivefl.getCurrentPosition());
        telemetry.addData("FL power ", drivetrain.drivefl.getPower());
        telemetry.addData("FR ticks", drivetrain.drivefr.getCurrentPosition());
        telemetry.addData("FR power ", drivetrain.drivefr.getPower());
        telemetry.addData("BL ticks", drivetrain.drivebl.getCurrentPosition());
        telemetry.addData("BL power ", drivetrain.drivebl.getPower());
        telemetry.addData("BR ticks", drivetrain.drivebr.getCurrentPosition());
        telemetry.addData("BR power ", drivetrain.drivebr.getPower());
        telemetry.update();
    }

    public void telemetGrab() {
        grabber.grabbergrab( gamepad1.dpad_left,  gamepad1.dpad_right);
        grabber.grabberlift( gamepad1.dpad_up,  gamepad1.dpad_down, gamepad1.left_bumper);

        telemetry.addData("grabber ", grabber.servopinch.getPosition());
        telemetry.addData("lift ", grabber.servograbrot.getPosition());
        telemetry.update();
    }

    public void telemetLaunch() {
        launcher.ejectAngle(gamepad2.right_stick_y);
        launcher.setMaxPower(gamepad2.dpad_up, gamepad2.dpad_down);
        launcher.eject(gamepad2.b);
        if(gamepad2.a) {
            launcher.feed();
        }
        launcher.motorfeed.setPower(gamepad2.left_stick_x*feetmaxpower);
        if(gamepad2.dpad_left) {
            feetmaxpower = .2;
        }
        else {
            feetmaxpower = 1;
        }

        telemetry.addData("feed ", launcher.motorfeed.getCurrentPosition());
        //telemetry.addData("lift ", launcher.motorlift.getCurrentPosition());
        //telemetry.addData("launcher ", launcher.motorlaunch.getPower());
        telemetry.update();
    }

    public void telemetintake() {
        intake.intake(gamepad2.left_bumper, gamepad2.right_bumper);
        if(gamepad2.y == true) {
            led.ledstrip.setPosition(.95);
        }
        else if(gamepad2.x == true) {
            led.ledstrip.setPosition(.52);
        }
        else {
            led.ledstrip.setPosition(.37);
        }

        telemetry.addData("intake ", intake.motorintake.getPower());
        telemetry.addData("led ", led.ledstrip.getPosition());
        telemetry.update();
    }

    @Override
    public void init() {
        drivetrain = new DriveTrainMethodTeleOp(hardwareMap);
        grabber = new GrabberMethodTeleOp(hardwareMap);
        launcher = new LauncherMethodTeleOp(hardwareMap);
        intake = new IntakeMethodTeleOp(hardwareMap);
        led = new IntakeStorageGauge(hardwareMap);
    }

        @Override
        public void loop() {
            telemetDrive();
            telemetGrab();
            telemetLaunch();
            telemetintake();
        }
}
