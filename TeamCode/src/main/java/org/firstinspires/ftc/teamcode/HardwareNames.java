package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HardwareNames {
    public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;

    public void driveMotors(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "drivefr");
        drivefl = hwm.get(DcMotor.class, "drivefl");
        drivebr = hwm.get(DcMotor.class, "drivebr");
        drivebl = hwm.get(DcMotor.class, "drivebl");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
}
