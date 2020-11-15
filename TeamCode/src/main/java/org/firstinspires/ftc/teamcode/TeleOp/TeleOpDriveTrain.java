package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class TeleOpDriveTrain extends HardwareNames {
        public void driveMotors(HardwareMap hwm) {
            super.driveMotors(hwm);
        }
    //Basic forward/back
    public void drivestraight(float y) {
    drivefr.setPower(y);
    drivefl.setPower(y);
    drivebr.setPower(y);
    drivebl.setPower(y);
    }
    //Basic turning
    public void turn(float x) {
            drivefl.setPower(x);
            drivebl.setPower(x);
            drivefr.setPower(-x);
            drivebr.setPower(-x);
    }
    //Strafe movement
    public void strafe(float x) {
    drivefl.setPower(x);
    drivefr.setPower(-x);
    drivebl.setPower(-x);
    drivebr.setPower(x);
    }
    //Basic Diagonal Movement
    public void diagonal(float x, float y) {
        float diagonal = (int) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            int power = (int) (x + y);
        if (( x > 0  && y > 0)  || ( x < 0 && y < 0)) {
            drivefl.setPower(y);
            drivebr.setPower(y);
        }
        else if (( x < 0 &&  y > 0) || (x > 0 && y < 0)) {
            drivefr.setPower(-y);
            drivebl.setPower(-y);
        }

    }

}
