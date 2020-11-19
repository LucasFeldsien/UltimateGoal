package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;


public class GrabberMethodTeleOp extends HardwareNames {
        public void grabberMotors(HardwareMap hwm) {
            super.grabbermotors(hwm);
        }
        // Using dpad for grabber directional movement
        public void grabbergrab(boolean dLeft, boolean dRight) {
            while (dLeft) {
                grabberservo.setPosition(0);
            }

            while  (dRight) {
                grabberservo.setPosition(1);
            }
        }
        public void grabberlift(boolean dUp, boolean dDown) {
            while (dUp) {
                liftservo.getPosition();
                liftservo.setPosition(aimservo.getPosition() + 0.1);
            }

            while (dDown) {
                liftservo.getPosition();
                liftservo.setPosition(aimservo.getPosition() - 0.1);
            }


        }

        public static void main(String[] args) {

        }
    }
