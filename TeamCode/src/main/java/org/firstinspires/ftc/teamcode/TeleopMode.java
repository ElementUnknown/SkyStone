package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name="TeleopMode", group="Robot")
//@Disabled
public class TeleopMode extends LinearOpMode {

    HardwareMap             robot = new HardwareMap();
    double wheelspeeds[] = new double[8];
    double lx = gamepad1.left_stick_x;
    double ly = gamepad1.left_stick_y;
    double turnpower = 0;
    boolean Abutton = gamepad2.a;
    boolean Bbutton = gamepad2.b;
    boolean Ybutton = gamepad2.y;
    boolean Xbutton = gamepad2.x;

    @Override
    public void runOpMode() {

        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            // Code Goes Here
            if (lx < .05 && lx > -.05) {
                lx = 0;
            }
            if (ly < .05 && ly > -.05) {
                ly = 0;
            }
            if (turnpower < .05 && turnpower > -.05) {
                turnpower = 0;
            }

            if (gamepad1.right_trigger > 0) {
                turnpower = gamepad1.right_trigger;
            }
            else if (gamepad1.left_trigger < 0) {
                turnpower = gamepad1.left_trigger;
            }
            else {
                turnpower = 0;
            }

            wheelspeeds[0] = lx + ly;
            wheelspeeds[1] = -lx + ly;
            wheelspeeds[2] = -lx + ly;
            wheelspeeds[3] = lx + ly;
            wheelspeeds[4] = (-turnpower + wheelspeeds[1])/2;
            wheelspeeds[5] = (-turnpower + wheelspeeds[2])/2;
            wheelspeeds[6] = (turnpower + wheelspeeds[3])/2;
            wheelspeeds[7] = (turnpower + wheelspeeds[4])/2;

            if (turnpower == 0) {
                robot.frontleftwheel.setPower(-wheelspeeds[0]);
                robot.backleftwheel.setPower(-wheelspeeds[1]);
                robot.frontrightwheel.setPower(wheelspeeds[2]);
                robot.backrightwheel.setPower(wheelspeeds[3]);
            }
            else if (turnpower != 0) {
                robot.frontleftwheel.setPower(-wheelspeeds[4]);
                robot.backleftwheel.setPower(-wheelspeeds[5]);
                robot.frontrightwheel.setPower(wheelspeeds[6]);
                robot.backrightwheel.setPower(wheelspeeds[7]);
            }
            else {
                robot.frontleftwheel.setPower(0);
                robot.backleftwheel.setPower(0);
                robot.frontrightwheel.setPower(0);
                robot.backrightwheel.setPower(0);
            }

            if (Abutton = true) {
                robot.tray.setPosition(90);
            }
            else if (Bbutton = true) {
                robot.tray.setPosition(120);
            }
            else if (Ybutton = true) {
                robot.tray.setPosition(150);
            }
            else if (Xbutton = true) {
                robot.tray.setPosition(180);
            }
        }
    }
}
