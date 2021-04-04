package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

class AutoIntake {
    public DcMotor motorintake;

    public AutoIntake(HardwareMap hwm) {
        motorintake = hwm.get(DcMotor.class, "motorintake");
    }

    public void intake(double seconds) {
        motorintake.setPower(-.5);
    }

    public void outake(double seconds) {
        motorintake.setPower(.5);
    }

    public void off() {
        motorintake.setPower(0);
    }
}
