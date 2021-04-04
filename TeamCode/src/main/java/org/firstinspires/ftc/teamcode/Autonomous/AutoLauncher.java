package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoLauncher {
    public DcMotor motorlaunch;
    public DcMotor motorlift;
    public DcMotor motorfeed;

    public AutoLauncher(HardwareMap hwm) {
        motorlaunch = hwm.get(DcMotor.class, "motorlaunch");
        motorlift = hwm.get(DcMotor.class, "motorlift");
        motorfeed = hwm.get(DcMotor.class, "motorfeed");

        motorlaunch.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motorlift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorfeed.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        motorfeed.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorfeed.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }

    public void eject(int ringnum) {
        //PAIN
    }

    public void drawbridge(double drawbridgelift) {

    }
}