package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;

import org.firstinspires.ftc.teamcode.HardwareNames;


public class IntakeStorageGauge {

    public  RevBlinkinLedDriver ledstrip;
    public ColorSensor colorstore1;
    public ColorSensor colorstore2;
    public ColorSensor colorstore3;

    public void storageledsensors(HardwareMap hwm) {
        ledstrip = hwm.get( RevBlinkinLedDriver.class, "blinkin");
        colorstore1 = hwm.colorSensor.get("colorstore1");
        colorstore2 = hwm.colorSensor.get("colorstore2");
        colorstore3 = hwm.colorSensor.get("colorstore3");
    }

    public void rings () {
        if (isyellow(colorstore1) == true && (isyellow (colorstore2) == false && isyellow (colorstore3) == false)) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.GREEN);
        }

        else  if (isyellow(colorstore2) == true && (isyellow (colorstore1) == true && isyellow (colorstore3) == false)) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.YELLOW);
        }

        else if (isyellow(colorstore3) == true && isyellow(colorstore2) == true) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RED);
        }

        else  {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RAINBOW_RAINBOW_PALETTE);
        }
    }
// lets go :)
    public boolean isyellow (ColorSensor sens) {
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

