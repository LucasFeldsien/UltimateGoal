package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;

import org.firstinspires.ftc.teamcode.HardwareNames;


public class IntakeStorageGauge {

   public  Servo ledstrip;
    //public ColorSensor colorstore1;
    //public ColorSensor colorstore2;
    //public ColorSensor colorstore3;

    public IntakeStorageGauge(HardwareMap hwm) {
        ledstrip = hwm.get(Servo.class, "blinkin");
        // colorstore1 = hwm.colorSensor.get("colorstore1");
    //    colorstore3 = hwm.get(ColorSensor.class, "colorstore3");
    //    colorstore2 = hwm.get(ColorSensor.class, "colorstore2");
       //colorstore1 = hwm.get(ColorSensor.class, "colorstore1");
    }

   /* public void rings () {
        if (isyellow1() == true && (isyellow2 () == false && isyellow3 () == false)) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.GREEN);
        }

        else  if (isyellow2() == true && (isyellow1 () == true && isyellow3 () == false)) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.YELLOW);
        }

        else if (isyellow3() == true && isyellow2() == true) {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RED);
        }

        else  {
            ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RAINBOW_RAINBOW_PALETTE);
        }
    }
*/
// lets go :)
   /* public boolean isyellow1 () {
        if (colorstore1.red() == 10) {

           if (colorstore1.green() == 10) {
               if (colorstore1.blue() == 10) {

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
    }*/

 /*  public boolean isyellow2 () {
        if (colorstore1.red() == 10) {

            if (colorstore1.green() == 10) {
                if (colorstore1.blue() == 10) {

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

    public boolean isyellow3 () {
        if (colorstore1.red() == 10) {

            if (colorstore1.green() == 10) {
                if (colorstore1.blue() == 10) {

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

*/



}

