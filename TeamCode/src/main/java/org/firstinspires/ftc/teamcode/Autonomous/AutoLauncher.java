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
        servoaim.setPosition(vis);
        motorlaunch.setPower(1.0);
        servofeed.setPosition(1.0);//continous
        servolift.setPosition(1.0);
        //need a wait statement
        servolift.setPosition(0.0);
    }
}