package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.hardware.rev.RevBlinkinLedDriver;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

@TeleOp(name="test the color", group="TeleOp")
//@Disabled
public class TestColor extends OpMode {

    //ntakeStorageGauge gauge = null;
    public ColorSensor colorstore1;

    @Override
    public void init() {
        //gauge = new IntakeStorageGauge();
        //gauge.ledstrip = hardwareMap.get(RevBlinkinLedDriver.class, "blinkin");
        colorstore1 = hardwareMap.get(ColorSensor.class, "colorstore1");
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        //dont intake >:()
        /*System.out.println("blue: " + colorstore1.blue());
        System.out.println("red: " + colorstore1.red());
        System.out.println("blue: " + colorstore1.green());*/

        telemetry.addData("B", colorstore1.blue());
        telemetry.addData("Red  ", colorstore1.red());
        telemetry.addData("Green", colorstore1.green());
        telemetry.update();
    }
}
