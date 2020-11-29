package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class DriveTrainMethodTeleOp extends HardwareNames {
        public void driveMotors(HardwareMap hwm) {
            super.driveMotors(hwm);
        }
    //Basic forward/back

    public void init() {
            //ahhh im stuck
    }

    //Basic turning
    public void turn(float x) {
            drivefl.setPower(x);
            drivebl.setPower(x);
            drivefr.setPower(-x);
            drivebr.setPower(-x);
    }


    public void omnidirectional(float x, float y, float x1) {
        double magnitude = Math.hypot(x, y);
        double robotAngle = Math.atan2(y, x) - Math.PI / 4;
        double rightX = x1;
        double fld = magnitude * Math.cos(robotAngle) + rightX;
        double frd = magnitude * Math.sin(robotAngle) - rightX;
        double bld = magnitude * Math.sin(robotAngle) + rightX;
        double brd = magnitude * Math.cos(robotAngle) - rightX;
        drivefl.setPower(fld);
        drivefr.setPower(frd);
        drivebl.setPower(bld);
        drivebr.setPower(brd);

    }
}
