package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.HardwareNames;

class autoGrabber extends HardwareNames {
    public void grabberMotors(HardwareMap hwm) {
        super.grabberMotors(hwm);
    }
    public void grab(int open) {
        servopinch.setPosition(1);
  //      if (we sense that that we get 3 rings then or if the color is i think red?? or whatever that tells us its 3 rights  )
        servopinch.setPosition(0);
        
    }
}