package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.HardwareNames;

public class GrabberMethodTeleOp {
    public Servo servopinch;
    public Servo servograbrot;
    private Telemetry telemetry = null;
        public GrabberMethodTeleOp(HardwareMap hwm, Telemetry telemetry) {
            servopinch = hwm.get(Servo.class, "servopinch");
            servograbrot = hwm.get(Servo.class, "servograbrot");
            this.telemetry = telemetry;

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
    // these servograbrot.getposition <= stuff is trying to stop it from hitting the robot but idk why its not working
            if (dUp && (servograbrot.getPosition() <= 0.6)) {
                servograbrot.getPosition();
                servograbrot.setPosition(servograbrot.getPosition() + 0.1);
            }

            if (dDown && ((servograbrot.getPosition() >= 0.0))) {
                servograbrot.getPosition();
                servograbrot.setPosition(servograbrot.getPosition() - 0.1);
            }

            else {
                servograbrot.setPosition(servograbrot.getPosition());
            }

        }

    public void telem() {
        telemetry.addData("Servo grabber", servograbrot.getPosition());
        telemetry.addData("Servo pincher", servopinch.getPosition());
    }
    }
