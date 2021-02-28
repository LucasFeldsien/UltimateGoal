package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

public class GrabberMethodTeleOp {
    public Servo servopinch;
    public Servo servograbrot;

        public GrabberMethodTeleOp(HardwareMap hwm) {
            servopinch = hwm.get(Servo.class, "servopinch");
            servograbrot = hwm.get(Servo.class, "servograbrot");
        }
        // Using dpad for grabber directional movement
        public void grabbergrab(boolean dLeft, boolean dRight) {
            if (dLeft) {
                servopinch.setPosition(0);
            }

            if  (dRight) {
                servopinch.setPosition(1);
            }
        }
        public void grabberlift(boolean dUp, boolean dDown) {
            if (dUp) {
                servograbrot.getPosition();
                servograbrot.setPosition(servograbrot.getPosition() + 0.1);
            }

            if (dDown) {
                servograbrot.getPosition();
                servograbrot.setPosition(servograbrot.getPosition() - 0.1);
            }


        }
    }
