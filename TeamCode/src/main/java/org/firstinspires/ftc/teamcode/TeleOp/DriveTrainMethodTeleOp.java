package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class DriveTrainMethodTeleOp {
    HardwareNames names = null;
        public void driveMotor(HardwareMap hwm) {
            names.driveMotors(hwm);
        }
    //Basic forward/back

    public void init() {
            //ahhh im stuck
    }

    //Basic turning
    public void turn(float x) {
            names.drivefl.setPower(x);
            names.drivebl.setPower(x);
            names.drivefr.setPower(-x);
            names.drivebr.setPower(-x);
    }


    public void omnidirectional(float x, float y, float x1) {
        double magnitude = Math.hypot(x, y);
        double robotAngle = Math.atan2(y, x) - Math.PI / 4;
        double rightX = x1;
        double fld = magnitude * Math.cos(robotAngle) + rightX;
        double frd = magnitude * Math.sin(robotAngle) - rightX;
        double bld = magnitude * Math.sin(robotAngle) + rightX;
        double brd = magnitude * Math.cos(robotAngle) - rightX;
        names.drivefl.setPower(fld);
        names.drivefr.setPower(frd);
        names.drivebl.setPower(bld);
        names.drivebr.setPower(brd);

    }
}
