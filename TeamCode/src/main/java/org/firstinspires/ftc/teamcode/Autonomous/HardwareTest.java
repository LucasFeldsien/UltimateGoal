/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.HardwareNames;

/**
 * This is NOT an opmode.
 *
 * This class can be used to define all the specific hardware for a single robot.
 * In this case that robot is a Pushbot.
 * See PushbotTeleopTank_Iterative and others classes starting with "Pushbot" for usage examples.
 *
 * This hardware class assumes the following device names have been configured on the robot:
 * Note:  All names are lower case and some have single spaces between words.
 *
 * Motor channel:  Left  drive motor:        "left_drive"
 * Motor channel:  Right drive motor:        "right_drive"
 * Motor channel:  Manipulator drive motor:  "left_arm"
 * Servo channel:  Servo to open left claw:  "left_hand"
 * Servo channel:  Servo to open right claw: "right_hand"
 */
class HardwareTest {
    HardwareNames names = new HardwareNames();

    static final double     COUNTS_PER_MOTOR_REV    = .0/*1440*/ ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = .0 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = .0 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /(WHEEL_DIAMETER_INCHES * 3.1415);

    public HardwareTest(HardwareMap hwm) {
        names.driveMotors(hwm, true);
    }

    public void runToPos() {
        names.drivefr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivefl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivebr.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        names.drivebl.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public int converstion(double baddist) {
        int dist = (int)(COUNTS_PER_INCH * baddist); /** this is for the convertion beween ticks and like cm or something**/
        return dist;
    }

    public int degreeconverstion(int angle) {
        int ticks = angle; /**haorsighdli pAINNNN**/
        return ticks;
    }
    //bas    //basic movement
    public void autoDriveStraight(double dist, double power) {
        int ticks = converstion(dist);
        names.drivefr.setTargetPosition(ticks+names.drivefr.getCurrentPosition());
        names.drivefl.setTargetPosition(ticks+names.drivefl.getCurrentPosition());
        names.drivebr.setTargetPosition(ticks+names.drivebr.getCurrentPosition());
        names.drivebl.setTargetPosition(ticks+names.drivebl.getCurrentPosition());

        runToPos();
    }
    //turning
    public void autoPivotTurn(int angle) {
        int ticks = degreeconverstion(angle);
        names.drivefr.setTargetPosition(ticks+names.drivefr.getCurrentPosition());
        names.drivefl.setTargetPosition(ticks+names.drivefl.getCurrentPosition());
        names.drivebr.setTargetPosition(-ticks+names.drivebr.getCurrentPosition());
        names.drivebl.setTargetPosition(-ticks+names.drivebl.getCurrentPosition());

        runToPos();
    }
    //Strafe movement
    public void autoStrafe(double dist) {
        int ticks = converstion(dist);
        names.drivefr.setTargetPosition(ticks+names.drivefr.getCurrentPosition());
        names.drivefl.setTargetPosition(-ticks+names.drivefl.getCurrentPosition());
        names.drivebr.setTargetPosition(-ticks+names.drivebr.getCurrentPosition());
        names.drivebl.setTargetPosition(ticks+names.drivebl.getCurrentPosition());

        runToPos();
    }
    //Basic Diagonal Movement
    public void autoDiagonalPosSlope (double dist) {
        int ticks = converstion(dist);
        names.drivefl.setTargetPosition(ticks+names.drivefl.getCurrentPosition());
        names.drivebr.setTargetPosition(ticks+names.drivebr.getCurrentPosition());

        runToPos();
    }
    //Left Diagonal Movement
    public void autoDiagonalNegSlope (double dist) {
        int ticks = converstion(dist);
        names.drivefr.setTargetPosition(-ticks+names.drivefr.getCurrentPosition());
        names.drivebl.setTargetPosition(-ticks+names.drivebl.getCurrentPosition());

        runToPos();
    }

    public void backTurn(int angle) {
        int ticks = degreeconverstion(angle);
        names.drivebr.setTargetPosition(ticks+names.drivebr.getCurrentPosition());
        names.drivebl.setTargetPosition(-ticks+names.drivebl.getCurrentPosition());

        runToPos();
    }

    public void stop() {
        names.drivefl.setPower(0);
        names.drivefr.setPower(0);
        names.drivebl.setPower(0);
        names.drivebr.setPower(0);
    }


    public void grabberMotors(HardwareMap hwm) {
        names.grabberMotors(hwm);
    }
    public void grab(int open) {
        names.servopinch.setPosition(1);
        //      if (we sense that that we get 3 rings then or if the color is i think red?? or whatever that tells us its 3 rights  )
        names.servopinch.setPosition(0);

    }
    public void launcherMotors(HardwareMap hwm) {
        names.launcherMotors(hwm);
    }
    public void shoot(double vis) {
        names.servolift.setPosition(vis);
        names.motorlaunch.setPower(1.0);
        names.servofeed.setPosition(1.0);//continous
        names.servolift.setPosition(1.0);
        //need a wait statement
        names.servolift.setPosition(0.0);
    }


 }

