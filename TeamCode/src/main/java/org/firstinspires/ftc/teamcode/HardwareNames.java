package org.firstinspires.ftc.teamcode;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;
import android.graphics.Color;
import android.hardware.Sensor;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class HardwareNames {
    // link to previous year's code https://github.com/teamftc8466/skystone8466
    // link for learning coding https://www.w3schools.com/java/java_for_loop.asp
    
    public DcMotor drivefr;
    public DcMotor drivefl;
    public DcMotor drivebr;
    public DcMotor drivebl;

    public void driveMotors(HardwareMap hwm) {
        drivefr = hwm.get(DcMotor.class, "driveFR");
        drivefl = hwm.get(DcMotor.class, "driveFL");
        drivebr = hwm.get(DcMotor.class, "driveBR");
        drivebl = hwm.get(DcMotor.class, "driveBL");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        drivefr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivefl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebr.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        drivebl.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }


    public DcMotor motorlaunch;
    public Servo servolift;
    public DcMotor motorbridge;
    public Servo servofeed;

    public void launcherMotors(HardwareMap hwm) {
        motorlaunch = hwm.get(DcMotor.class, "moterlaunch");
        servolift = hwm.get(Servo.class, "servolift");
        motorbridge = hwm.get(DcMotor.class, "motorbridge");
        servofeed = hwm.get(Servo.class, "servofeed");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
    }


    public DcMotor motoreject;

    public void storageMotors(HardwareMap hwm) {
        motoreject = hwm.get(DcMotor.class, "motoreject");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public DcMotor motorintake;

    public void intakeMotors(HardwareMap hwm) {
        motorintake = hwm.get(DcMotor.class, "motorintake");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public Servo servopinch;
    public Servo servograbrot;

      public void grabberMotors(HardwareMap hwm) {
          servopinch = hwm.get(Servo.class, "servopinch");
          servograbrot = hwm.get(Servo.class, "servograbrot");
     }




    public Servo servocam;
    public RevBlinkinLedDriver ledstrip;
    public ColorSensor colorstore1;
    public ColorSensor colorstore2;
    public ColorSensor colorstore3;
    //colorzone; color sensor

    public void sensors(HardwareMap hwm) {
        servocam = hwm.get(Servo.class, "servocam");
        ledstrip = hwm.get(RevBlinkinLedDriver.class, "blinkin");
        colorstore1 = hwm.colorSensor.get("colorstore1");
        colorstore2 = hwm.colorSensor.get("colorstore2");
        colorstore3 = hwm.colorSensor.get("colorstore3");
    }
    /**public sensors
     * public camera\
     *
     */


}
