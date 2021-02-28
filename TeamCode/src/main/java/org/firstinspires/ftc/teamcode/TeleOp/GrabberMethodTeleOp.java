package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class GrabberMethodTeleOp {
    HardwareNames names;

        public void grabberMotors(HardwareMap hwm) {
            names.grabberMotors(hwm);
        }
        // Using dpad for grabber directional movement
        public void grabbergrab(boolean dLeft, boolean dRight) {
            while (dLeft) {
                names.servopinch.setPosition(0);
            }

            while  (dRight) {
                names.servopinch.setPosition(1);
            }
        }
        public void grabberlift(boolean dUp, boolean dDown) {
            while (dUp) {
                names.servograbrot.getPosition();
                names.servograbrot.setPosition(names.servograbrot.getPosition() + 0.1);
            }

            while (dDown) {
                names.servograbrot.getPosition();
                names.servograbrot.setPosition(names.servograbrot.getPosition() - 0.1);
            }


        }
    }
