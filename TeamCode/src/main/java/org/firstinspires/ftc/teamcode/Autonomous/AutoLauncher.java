package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoLauncher extends HardwareNames {
    public void launcherMotors(HardwareMap hwm) {
        super.launcherMotors(hwm);
    }
    public void shoot(double vis) {
        aimservo.setPosition(vis);
        launchmotor.setPower(1.0);
        feedservo.setPosition(1.0);//continous
        liftservo.setPosition(1.0);
        //need a wait statement
        liftservo.setPosition(0.0);
    }
}