package org.firstinspires.ftc.teamcode.TeleOp;

import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.HardwareNames;

public class DriveTrainMethodTeleOp {
    HardwareNames names;

    /*public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;*/

    double magnitude = 0;
    double robotAngle = 0;
    double rightX = 0;
    double fld, frd, bld, brd;


   public void driveMotors(HardwareMap hwm) {
        names.drivefr = hwm.get(DcMotor.class, "driveFR");
        names.drivefl = hwm.get(DcMotor.class, "driveFL");
        names.drivebr = hwm.get(DcMotor.class, "driveBR");
        names.drivebl = hwm.get(DcMotor.class, "driveBL");

        names.drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        names.drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        names.drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        names.drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    //Basic forward/back

    //Basic turning
    public void turn(float x) {
            names.drivefl.setPower(x);
            names.drivebl.setPower(x);
            names.drivefr.setPower(-x);
            names.drivebr.setPower(-x);
    }


    public void omnidirectional(float x, float y, float x1) {
        magnitude = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), (1/2));
        robotAngle = Math.atan2(y, x) - Math.PI / 4;
        rightX = x1;
        fld = magnitude * Math.cos(robotAngle) + rightX;
        frd = magnitude * Math.sin(robotAngle) - rightX;
        bld = magnitude * Math.sin(robotAngle) + rightX;
        brd = magnitude * Math.cos(robotAngle) - rightX;
        names.drivefl.setPower(fld);
        names.drivefr.setPower(frd);
        names.drivebl.setPower(bld);
        names.drivebr.setPower(brd);

    }
}