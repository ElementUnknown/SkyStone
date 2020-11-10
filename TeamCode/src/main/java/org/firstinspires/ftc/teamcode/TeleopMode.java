package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="TeleopMode", group="Robot")
//@Disabled
public class TeleopMode extends LinearOpMode implements TeleopInterface {

    HardwareMap             robot = new HardwareMap();
    double wheelspeeds[] = new double[8];
    double lx = gamepad1.left_stick_x;
    double ly = gamepad1.left_stick_y;
    double rx = gamepad1.right_stick_x;
    double ry = gamepad1.right_stick_y;

    @Override
    public void buffer() {
        if (lx < .05 && lx > -.05) {
            lx = 0;
        }
        if (ly < .05 && ly > -.05) {
            ly = 0;
        }
        if (rx < .05 && lx > -.05) {
            rx = 0;
        }
        if (ry < .05 && lx > -.05) {
            ry = 0;
        }
    }

    @Override
    public void leftequations() {
        wheelspeeds[0] = lx + ly;
        wheelspeeds[1] = -lx + ly;
        wheelspeeds[2] = -lx + ly;
        wheelspeeds[3] = lx + ly;
    }

    /*
        fl
        bl
        fr
        br
     */
    @Override
    public void rightequations() {
        wheelspeeds[4] =
        wheelspeeds[5] =
        wheelspeeds[6] =
        wheelspeeds[7] =
    }

    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            // Code Goes Here
            if (rx > 0 && ry > 0) {
                robot.frontleftwheel.setPower(wheelspeeds[0]);
                robot.backleftwheel.setPower(wheelspeeds[1]);
                robot.frontrightwheel.setPower(wheelspeeds[2]);
                robot.backrightwheel.setPower(wheelspeeds[3]);
            }
        }
    }
}
