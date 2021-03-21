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

    //intakeStorageGauge gauge = null;
        IntakeStorageGauge gauge = null;

    @Override
    public void init() {
        gauge = new IntakeStorageGauge(hardwareMap);

        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
       /* if (gauge.colorstore1.red() != 20) {
            telemetry.addData("B", gauge.colorstore1.blue());
        }
        //dont intake >:()
        System.out.println("blue: " + gauge.colorstore1.blue());
        System.out.println("red: " + gauge.colorstore1.red());
        System.out.println("blue: " + gauge.colorstore1.green());

        telemetry.addData("B", gauge.colorstore1.blue());
        telemetry.addData("Red  ", gauge.colorstore1.red());
        telemetry.addData("Green", gauge.colorstore1.green());
        telemetry.addData("isyellow; ", gauge.isyellow1());
        telemetry.update();

        if (gauge.colorstore1.blue() >=0) {
                gauge.ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.GREEN);
            }
        else {
            gauge.ledstrip.setPattern(RevBlinkinLedDriver.BlinkinPattern.RED);


        }*/
    }
}
