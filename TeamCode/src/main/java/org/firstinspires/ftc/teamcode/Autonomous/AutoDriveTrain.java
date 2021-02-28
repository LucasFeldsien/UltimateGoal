package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import java.lang.Math;
import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoDriveTrain {
    HardwareNames names = new HardwareNames();

    static final double     COUNTS_PER_MOTOR_REV    = .0/*1440*/ ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = .0 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = .0 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /(WHEEL_DIAMETER_INCHES * 3.1415);

    public AutoDriveTrain(HardwareMap hwm) {
        names.driveMotors(hwm, true);
    }

    public void runToPos() {
        names.drivefr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivefl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivebr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivebl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public int converstion(double baddist) {
        int dist = (int)(COUNTS_PER_INCH * baddist); /** this is for the convertion beween ticks and like cm or something**/
        return dist;
    }

    public int degreeconverstion(int angle) {
        int ticks = angle; /**haorsighdli pAINNNN**/
        return ticks;
    }
    //basic movement
    public void autoDriveStraight(double dist, double power) {
       int ticks = converstion(dist);
        names.drivefr.setTargetPosition(ticks);
        names.drivefl.setTargetPosition(ticks);
        names.drivebr.setTargetPosition(ticks);
        names.drivebl.setTargetPosition(ticks);

        runToPos();
    }
    //turning
    public void autoPivotTurn(int angle) {
        int ticks = degreeconverstion(angle);
        names.drivefr.setTargetPosition(ticks);
        names.drivefl.setTargetPosition(ticks);
        names.drivebr.setTargetPosition(-ticks);
        names.drivebl.setTargetPosition(-ticks);

        runToPos();
    }
    //Strafe movement
    public void autoStrafe(double dist) {
        int ticks = converstion(dist);
        names.drivefr.setTargetPosition(ticks);
        names.drivefl.setTargetPosition(-ticks);
        names.drivebr.setTargetPosition(-ticks);
        names.drivebl.setTargetPosition(ticks);

        runToPos();
    }
    //Basic Diagonal Movement
    public void autoDiagonalPosSlope (double dist) {
        int ticks = converstion(dist);
        names.drivefl.setTargetPosition(ticks);
        names.drivebr.setTargetPosition(ticks);

        runToPos();
    }
    //Left Diagonal Movement
    public void autoDiagonalNegSlope (double dist) {
        int ticks = converstion(dist);
        names.drivefr.setTargetPosition(-ticks);
        names.drivebl.setTargetPosition(-ticks);

        runToPos();
    }

    public void backTurn(int angle) {
        int ticks = degreeconverstion(angle);
        names.drivebr.setTargetPosition(ticks);
        names.drivebl.setTargetPosition(-ticks);

        runToPos();
    }

    public void stop() {
        names.drivefl.setPower(0);
        names.drivefr.setPower(0);
        names.drivebl.setPower(0);
        names.drivebr.setPower(0);
    }

    public void init(HardwareMap hardwareMap) {
    }
}

/*
    @Override
    public void runOpMode() {
        double LeftTarget = BallDrive.motor1.getCurrentPosition() + moveCount;
        double RightTarget = BallDrive.motor2.getCurrentPosition() + moveCount;
// Set Target and Turn On RUN_TO_POSITION
        BallDrive.motor1.setTargetPosition(LeftTarget);
        BallDrive.motor2.setTargetPosition(RightTarget);
        BallDrive.motor1.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        BallDrive.motor2.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }*/