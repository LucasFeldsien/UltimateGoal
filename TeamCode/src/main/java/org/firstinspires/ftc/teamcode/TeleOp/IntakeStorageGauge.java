package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;


public class IntakeStorageGauge {
    public Servo ledstrip;
    public ColorSensor colorstore1;
    public ColorSensor colorstore2;
    public ColorSensor colorstore3;

    public void storageledsensors(HardwareMap hwm) {
        ledstrip = hwm.get(Servo.class, "ledstrip");
        colorstore1 = hwm.colorSensor.get("colorstore1");
        colorstore2 = hwm.colorSensor.get("colorstore2");
        colorstore3 = hwm.colorSensor.get("colorstore3");
    }

    public void rings () {
        if (isyellow (colorstore1) == true) {
            ledstrip.setPosition(0.77);
        }

        else  if (isred (colorstore2) == true) {
            ledstrip.setPosition(0.69);
        }

        else if (isgreen (colorstore3) == true) {
            ledstrip.setPosition(0.61);
        }
        //if colorstore2
        //if colorstore3
    }

    private boolean isyellow (ColorSensor sens) {
        if (sens.red() == 0) {
            return true;
        }
        else  {
            return false;
        }
    }

    private boolean isred (ColorSensor sens) {
        if (sens.red() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean isgreen (ColorSensor sens) {
        if (sens.green() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String [] args) {

    }
    }

