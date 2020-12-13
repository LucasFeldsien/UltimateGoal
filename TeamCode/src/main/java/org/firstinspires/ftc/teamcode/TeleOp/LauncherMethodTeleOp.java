package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class LauncherMethodTeleOp  {
    private int whatdoidolucas = 0;

    public DcMotor motorlaunch;
    public Servo servolift;
    public Servo servoaim;
    public Servo servofeed;
    public void launcherMotors(HardwareMap hwm) {
        motorlaunch = hwm.get(DcMotor.class, "moterlaunch");
        servolift = hwm.get(Servo.class, "servolift");
        servoaim = hwm.get(Servo.class, "servoaim");
        servofeed = hwm.get(Servo.class, "servofeed");

        motorlaunch.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }
    //Method for on/off toggle, method for adjusting strength, method for tilt, method for launching rings ;)
    public void LauncherToggle (boolean leftbumper) {
        if (leftbumper) {
            motorlaunch.setPower(1);
        }
    }
    //need to change second launchmotor for krabby flip
        public void Eject (double launcherpower) {

            switch (whatdoidolucas) {
                case 1:
                    motorlaunch.setPower(launcherpower);
                    whatdoidolucas = 0;
                    break;

                default:
                    motorlaunch.setPower(0);
                    whatdoidolucas = 1;
                    break;
            }
        }

         public double launcherpower (double power, boolean buttonA, boolean buttonB, boolean buttonX, boolean buttonY) {
                if (buttonA) {
                    power = .25;
                }

                else if (buttonX) {
                    power = .50;
                }

                else if (buttonY) {
                    power = .75;
                }

                else if (buttonB) {
                    power = 1;
                }
                return power;
                }

                public void ejectangle (float lefttrigger, float righttrigger) {
                    while (lefttrigger>0.1) {
                            servoaim.getPosition();
                            servoaim.setPosition(servoaim.getPosition() - 0.1);
                    }

                    while (righttrigger>0.1) {
                            servoaim.getPosition();
                            servoaim.setPosition(servoaim.getPosition() + 0.1);
                    }
                }

            }