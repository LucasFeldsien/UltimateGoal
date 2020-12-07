package org.firstinspires.ftc.teamcode.TeleOp;

import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.teamcode.HardwareNames;

public class DriveTrainMethodTeleOp {

    public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;

    double magnitude = 0;
    double robotAngle = 0;
    double rightX = 0;
    double fld, frd, bld, brd;


   public void driveMotors(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "driveFR");
        drivefl = hwm.get(DcMotor.class, "driveFL");
        drivebr = hwm.get(DcMotor.class, "driveBR");
        drivebl = hwm.get(DcMotor.class, "driveBL");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    //Basic forward/back

    //Basic turning
    public void turn(float x) {
            drivefl.setPower(x);
            drivebl.setPower(x);
            drivefr.setPower(-x);
            drivebr.setPower(-x);
    }


    public void omnidirectional(float x, float y, float x1) {
        magnitude = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), (1/2));
        robotAngle = Math.atan2(y, x);
        rightX = x1;
        fld = (magnitude * Math.cos(robotAngle - (Math.PI / 4)) - Math.cos(robotAngle) * rightX);
        bld = (magnitude * Math.sin(robotAngle - (Math.PI / 4)) - Math.sin(robotAngle) * rightX); //back
        frd = -(magnitude * Math.sin(robotAngle - (Math.PI / 4)) - Math.sin(robotAngle) * rightX);
        brd = -(magnitude * Math.cos(robotAngle - (Math.PI / 4)) - Math.cos(robotAngle) * rightX); //back
        drivefl.setPower(fld);
        drivefr.setPower(frd);
        drivebl.setPower(bld);
        drivebr.setPower(brd);


    }
}