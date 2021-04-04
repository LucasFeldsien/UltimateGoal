package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;
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
                servopinch.setPosition(.3);
            }

            if  (dRight) {
                servopinch.setPosition(.46);
            }
        }
        public void grabberlift(boolean dup, boolean ddown, boolean hold) {
    // these servograbrot.getposition <= stuff is trying to stop it from hitting the robot but idk why its not working
            if (ddown) {
                servograbrot.setPosition(.53);
            }
            else if (dup) {
                servograbrot.setPosition(.32);
            }
            else if (hold) {
                servograbrot.setPosition(.43);
            }
        }
    }
