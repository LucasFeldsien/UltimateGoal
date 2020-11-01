package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class TeleOpDriveTrain extends HardwareNames {
        public void driveMotors(HardwareMap hwm) {
            super.driveMotors(hwm);
        }

    public void driveforward(float y) {
    drivefr.setPower(y);
    drivefl.setPower(y);
    drivebr.setPower(y);
    drivebl.setPower(y);
    }
    public void turn(float x) {
            drivefl.setPower(x);
            drivebl.setPower(x);
            drivefr.setPower(-x);
            drivebr.setPower(-x);
    }
    public void strafe(float x) {
    drivefl.setPower(x);
    drivefr.setPower(-x);
    drivebl.setPower(-x);
    drivebr.setPower(x);
    }

    public void diagonalright (float y) {
        drivefl.setPower(y);
        drivebr.setPower(y);
    }

    public void diagonalleft (float y) {
            drivefr.setPower(-y);
            drivebl.setPower(-y);
    }
}
