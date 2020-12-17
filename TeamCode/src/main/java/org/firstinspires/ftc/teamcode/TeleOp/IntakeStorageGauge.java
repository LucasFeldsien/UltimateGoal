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
        if (isyellow (colorstore1) == true && (isyellow (colorstore2) == false && isyellow (colorstore3) == false)) {
            ledstrip.setPosition(0.77);

        }

        else  if (isyellow (colorstore2) == true && (isyellow (colorstore1) == true && isyellow (colorstore3) == false)) {
            ledstrip.setPosition(0.69);
        }

        else if (isyellow (colorstore3) == true && isyellow(colorstore2) == true) {
            ledstrip.setPosition(0.61);
        }

        else  {
            ledstrip.setPosition(0.99);
        }
    }
// lets go :)
    private boolean isyellow (ColorSensor sens) {
        if (sens.red() == 0) {

           if (sens.green() == 0) {
               if (sens.blue() == 0) {

                   return true;
               }
               else {
                   return false;
               }
           }
           else {
               return false;
           }
        }

        else  {
            return false;
        }
    }


    public static void main(String [] args) {

    }


    }

