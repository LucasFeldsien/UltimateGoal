package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class LauncherTeleop extends HardwareNames {
    public void launcherMotor(HardwareMap hwm) {
        super.driveMotors(hwm);
    }
    //Method for on/off toggle, method for adjusting strength, method for tilt, method for launching rings ;)
    public void LauncherToggle (boolean leftbumper) {
        if (leftbumper == true) {
            launchmotor.setPower(1);
        }
    }
    //need to change second launchmotor for krabby flip
        public void Eject (boolean rightbumper) {
            if (rightbumper == true) {
                launchmotor.setPower(1);
            }
        }

         public void launcherpower (boolean buttonA, boolean buttonB, boolean buttonX, boolean buttonY) {
                if (buttonA == true) {
                    launchmotor.setPower(.25);
                }

                else if (buttonX == true) {
                    launchmotor.setPower(.50);
                }

                else if (buttonY == true) {
                    launchmotor.setPower(.75);
                }

                else if (buttonB == true) {
                    launchmotor.setPower(1);
                }
                }

                public void ejectangle (boolean lefttrigger, boolean righttrigger) {
                       if (lefttrigger == true) {
                           aimservo.getPosition();
                           aimservo.setPosition(aimservo.getPosition() - 0.1);
                       }

                        if (righttrigger == true) {
                        aimservo.getPosition();
                        aimservo.setPosition(aimservo.getPosition() + 0.1);
                        }

                }


            }








