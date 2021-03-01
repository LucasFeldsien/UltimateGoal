package org.firstinspires.ftc.teamcode.TeleOp;

import java.lang.Math;

import com.qualcomm.robotcore.hardware.DcMotorSimple;
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


   public DriveTrainMethodTeleOp(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "driveFR");
        drivefl = hwm.get(DcMotor.class, "driveFL");
        drivebr = hwm.get(DcMotor.class, "driveBR");
        drivebl = hwm.get(DcMotor.class, "driveBL");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        drivefr.setDirection(DcMotorSimple.Direction.FORWARD);
        drivebr.setDirection(DcMotorSimple.Direction.FORWARD);
        drivefl.setDirection(DcMotorSimple.Direction.FORWARD);
        drivebl.setDirection(DcMotorSimple.Direction.REVERSE);

   }
    //Basic forward/back

    //Basic turning
    public void turn(double power, float x) {
            drivefl.setPower(-x * power);
            drivebl.setPower(-x * power);
            drivefr.setPower(x * power);
            drivebr.setPower(x * power);
    }


    public void omnidirectional(double power, float x, float y, float x1) {
        magnitude = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), (1/2));
        robotAngle = Math.atan2(y, x);
        rightX = x1;
        fld = (magnitude * Math.cos(robotAngle - (Math.PI / 4)) - Math.cos(robotAngle) * rightX);
        bld = (magnitude * Math.sin(robotAngle - (Math.PI / 4)) - Math.sin(robotAngle) * rightX); //back
        frd = (magnitude * Math.sin(robotAngle - (Math.PI / 4)) - Math.sin(robotAngle) * rightX);
        brd = (magnitude * Math.cos(robotAngle - (Math.PI / 4)) - Math.cos(robotAngle) * rightX); //back
        drivefl.setPower(fld * power);
        drivefr.setPower(frd * power);
        drivebl.setPower(bld * power);
        drivebr.setPower(brd * power);


    }


    public double motorPower (double power, boolean buttonA, boolean buttonB, boolean buttonX, boolean buttonY) {
        if (buttonA) {
            power = .25;
        }

        else if (buttonX) {
            power = .50;
        }

        else if (buttonY) {
            power = .75;
        }

        else if (buttonB) {
            power = 1;
        }
        return power;
    }

}