package org.firstinspires.ftc.teamcode.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

@TeleOp(name="test the color", group="TeleOp")
//@Disabled
class TestColor extends OpMode {

    IntakeStorageGauge gauge = null;

    @Override
    public void init() {
        gauge = new IntakeStorageGauge();
        gauge.ledstrip = hardwareMap.get(Servo.class, "ledstrip");
        gauge.colorstore1 = hardwareMap.colorSensor.get("colorstore1");
        //drivetrain.driveMotors(HardwareMap);
    }

    @Override
    public void loop() {
        //dont intake >:()
        System.out.println("blue: " + gauge.colorstore1.blue());
        System.out.println("red: " + gauge.colorstore1.red());
        System.out.println("blue: " + gauge.colorstore1.green());

    }
}
