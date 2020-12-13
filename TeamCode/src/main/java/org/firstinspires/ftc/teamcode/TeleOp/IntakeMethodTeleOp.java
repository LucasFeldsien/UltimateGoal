package org.firstinspires.ftc.teamcode.TeleOp;
import java.lang.Math;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.HardwareNames;

class IntakeMethodTeleOp extends HardwareNames {
    public void intakeMotors(HardwareMap hwm) {
        super.intakeMotors(hwm);
    }

    public void intake (boolean leftbumper, boolean rightbumper) {
        if (leftbumper) {
            motorintake1.setPower(1);
            motorintake2.setPower(1);
            motorintake3.setPower(1);
        }

        else if (rightbumper) {
            motorintake1.setPower(-1);
            motorintake2.setPower(-1);
            motorintake3.setPower(-1);
        }
        else {
            motorintake1.setPower(0);
            motorintake2.setPower(0);
            motorintake3.setPower(0);
        }
    }


    public static void main (String [] args) {

}
}