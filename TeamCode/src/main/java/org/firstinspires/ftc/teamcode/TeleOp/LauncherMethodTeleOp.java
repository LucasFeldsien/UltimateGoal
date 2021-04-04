package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class LauncherMethodTeleOp  {
    private int whatdoidolucas = 0;
    private double powersetting = 1;
    private int test = 0;

    public DcMotor motorlaunch;
    public DcMotor motorlift;
    public DcMotor motorfeed;
    int newtarget = 0;

    public LauncherMethodTeleOp(HardwareMap hwm) {
        motorlaunch = hwm.get(DcMotor.class, "motorlaunch");
        motorlift = hwm.get(DcMotor.class, "motorlift");
        motorfeed = hwm.get(DcMotor.class, "motorfeed");

        motorlaunch.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        motorlift.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        motorfeed.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        motorfeed.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motorfeed.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    //Method for on/off toggle, method for adjusting strength, method for tilt, method for launching rings ;)
    public void LauncherToggle (boolean leftbumper) {
        if (leftbumper) {
            motorlaunch.setPower(1);
        }
    }
    //need to change second launchmotor for krabby flip
    public void eject (boolean unknownbutton) {
        if(unknownbutton == false) {
            test = 1;
        }
        else if(test == 1) {
            test = 0;
            switch (whatdoidolucas) {
                default:
                    motorlaunch.setPower(0);
                    whatdoidolucas = 1;
                    break;

                case 1:
                    motorlaunch.setPower(1);
                    whatdoidolucas = 0;
                    break;
            }
        }
    }

    public void setMaxPower(boolean up, boolean down) {
        if(up == true) {
            powersetting = 1;
        }
        if(down == true) {
            powersetting = .5;
        }
    }
    public void ejectAngle (float lefttrigger) {
        motorlift.setPower(lefttrigger*powersetting);
    }

    public void feed() {
        newtarget = motorfeed.getCurrentPosition()+100;
        motorfeed.setTargetPosition(newtarget);
        motorfeed.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
}