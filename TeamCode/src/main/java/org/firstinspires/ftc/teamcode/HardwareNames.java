package org.firstinspires.ftc.teamcode;

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
        drivefr = hwm.get(DcMotor.class, "drivefr");
        drivefl = hwm.get(DcMotor.class, "drivefl");
        drivebr = hwm.get(DcMotor.class, "drivebr");
        drivebl = hwm.get(DcMotor.class, "drivebl");

        drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivefl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        drivebl.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }


    public DcMotor launchmotor;
    public Servo liftservo;
    public Servo aimservo;
    public Servo feedservo;

    public void launcherMotors(HardwareMap hwm) {
        launchmotor = hwm.get(DcMotor.class, "launcher");
        liftservo = hwm.get(Servo.class, "liftservo");
        aimservo = hwm.get(Servo.class, "aimservo");
        feedservo = hwm.get(Servo.class, "feedservo");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public DcMotor storgejectmotor;

    public void storageMotors(HardwareMap hwm) {
        storgejectmotor = hwm.get(DcMotor.class, "storgejectmotor");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    public DcMotor intakemotor;
    /**MAYBE ANOTHER MOTOR NO CLUE**/

    public void intakeMotors(HardwareMap hwm) {
        storgejectmotor = hwm.get(DcMotor.class, "storgejectmotor");

        /**drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);**/
    }


    /**public idk grabber
     *
     * public void intakeMotors(HardwareMap hwm) {
     *         storgejectmotor = hwm.get(DcMotor.class, "storgejectmotor");
     *
     *         drivefr.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
     *}
     */


    /**public sensors
     * public camera
     */
}
