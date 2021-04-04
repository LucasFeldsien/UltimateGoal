package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

class AutoGrabber {
    public Servo servopinch;
    public Servo servograbrot;

    public AutoGrabber(HardwareMap hwm) {
        servopinch = hwm.get(Servo.class, "servopinch");
        servograbrot = hwm.get(Servo.class, "servograbrot");
    }

    public void lifterDown() {
        servograbrot.setPosition(.32);
    }

    public void lifterUp() {
        servograbrot.setPosition(.53);
    }

    public void lifterCarry() {
        servograbrot.setPosition(.43);
    }

    public void grabberOpen() {
        servopinch.setPosition(.3);
    }

    public void grabberClose() {
        servopinch.setPosition(.46);
    }
}