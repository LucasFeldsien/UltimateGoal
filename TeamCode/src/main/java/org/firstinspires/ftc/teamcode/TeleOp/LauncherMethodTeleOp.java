package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class LauncherMethodTeleOp extends HardwareNames {
    private int whatdoidolucas = 0;
    public void launcherMotor(HardwareMap hwm) {
        super.driveMotors(hwm);
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