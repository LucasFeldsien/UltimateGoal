package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import java.lang.Math;
import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoDriveTrain extends HardwareNames {
    public void driveMotors(HardwareMap hwm) {
        super.driveMotors(hwm);
    }
    public void autoDriveInit() {
        drivefr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivefl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        drivebl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public static int converstion(double baddist) {
        int dist = (int)baddist/2; /** this is for the convertion beween ticks and like cm or something**/
        return dist;
    }
    //basic movement
    public void autoDriveStraight(double dist, double power) {
       int ticks = converstion(dist);
        drivefr.setTargetPosition(ticks);
        drivefl.setTargetPosition(ticks);
        drivebr.setTargetPosition(ticks);
        drivebl.setTargetPosition(ticks);

        drivefl.setPower(ticks);
        drivebr.setPower(ticks);
        drivebl.setPower(ticks);
    }
    //turning
    public void autoPivotTurn(double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivebl.setPower(ticks);
        drivefr.setPower(-ticks);
        drivebr.setPower(-ticks);
    }
    //Strafe movement
    public void autoStrafe(double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivefr.setPower(-ticks);
        drivebl.setPower(-ticks);
        drivebr.setPower(ticks);
    }
    //Basic Diagonal Movement
    public void autoDiagonalPosSlope (double dist) {
        int ticks = converstion(dist);
        drivefl.setPower(ticks);
        drivebr.setPower(ticks);
    }
    //Left Diagonal Movement
    public void autoDiagonalNegSlope (double dist) {
        int ticks = converstion(dist);
        drivefr.setPower(-ticks);
        drivebl.setPower(-ticks);
    }

    public void init(HardwareMap hardwareMap) {
    }
}
