package org.firstinspires.ftc.teamcode.TeleOp;

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
    public void diagonalright (float y) {
        drivefl.setPower(y);
        drivebr.setPower(y);
    }

    public void diagonalleft (float y) {
            drivefr.setPower(-y);
            drivebl.setPower(-y);
    }
}
