package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import java.lang.Math;
import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoDriveTrain {
    public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;

    static final double     COUNTS_PER_MOTOR_REV    = .0/*1440*/ ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = .0 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = .0 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /(WHEEL_DIAMETER_INCHES * 3.1415);

    public AutoDriveTrain(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "driveFR");
        drivefl = hwm.get(DcMotor.class, "driveFL");
        drivebr = hwm.get(DcMotor.class, "driveBR");
        drivebl = hwm.get(DcMotor.class, "driveBL");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        drivefr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivefl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        drivefr.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        drivefl.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        drivebr.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        drivebl.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void runToPos() {
        drivefr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivefl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
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
        drivefr.setTargetPosition(ticks+drivefr.getCurrentPosition());
        drivefl.setTargetPosition(ticks+drivefl.getCurrentPosition());
        drivebr.setTargetPosition(ticks+drivebr.getCurrentPosition());
        drivebl.setTargetPosition(ticks+drivebl.getCurrentPosition());

        runToPos();
    }
    //turning
    public void autoPivotTurn(int angle) {
        int ticks = degreeconverstion(angle);
        drivefr.setTargetPosition(ticks+drivefr.getCurrentPosition());
        drivefl.setTargetPosition(ticks+drivefl.getCurrentPosition());
        drivebr.setTargetPosition(-ticks+drivebr.getCurrentPosition());
        drivebl.setTargetPosition(-ticks+drivebl.getCurrentPosition());

        runToPos();
    }
    //Strafe movement
    public void autoStrafe(double dist) {
        int ticks = converstion(dist);
        drivefr.setTargetPosition(ticks+drivefr.getCurrentPosition());
        drivefl.setTargetPosition(-ticks+drivefl.getCurrentPosition());
        drivebr.setTargetPosition(-ticks+drivebr.getCurrentPosition());
        drivebl.setTargetPosition(ticks+drivebl.getCurrentPosition());

        runToPos();
    }
    //Basic Diagonal Movement
    public void autoDiagonalPosSlope (double dist) {
        int ticks = converstion(dist);
        drivefl.setTargetPosition(ticks+drivefl.getCurrentPosition());
        drivebr.setTargetPosition(ticks+drivebr.getCurrentPosition());

        runToPos();
    }
    //Left Diagonal Movement
    public void autoDiagonalNegSlope (double dist) {
        int ticks = converstion(dist);
        drivefr.setTargetPosition(-ticks+drivefr.getCurrentPosition());
        drivebl.setTargetPosition(-ticks+drivebl.getCurrentPosition());

        runToPos();
    }

    public void backTurn(int angle) {
        int ticks = degreeconverstion(angle);
        drivebr.setTargetPosition(ticks+drivebr.getCurrentPosition());
        drivebl.setTargetPosition(-ticks+drivebl.getCurrentPosition());

        runToPos();
    }

    public void stop() {
        drivefl.setPower(0);
        drivefr.setPower(0);
        drivebl.setPower(0);
        drivebr.setPower(0);
    }


}
