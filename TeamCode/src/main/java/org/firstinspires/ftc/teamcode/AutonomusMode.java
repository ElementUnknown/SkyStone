package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="AutonomusMode", group="Robot")
//@Disabled
public class AutonomusMode extends LinearOpMode implements AutonomusInterface {

    HardwareMap             robot = new HardwareMap();
    private ElapsedTime     runtime = new ElapsedTime();

    @Override
    public void moveforward(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movebackward(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveleft(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveright(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupright(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void moveupleft(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontrightwheel.setPower(rspeed);
        robot.backleftwheel.setPower(lspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownright(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontrightwheel.setPower(-rspeed);
        robot.backleftwheel.setPower(-lspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void movedownleft(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnright(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(lspeed);
        robot.backleftwheel.setPower(lspeed);
        robot.frontrightwheel.setPower(-rspeed);
        robot.backrightwheel.setPower(-rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }

    @Override
    public void turnleft(double time, double speed) {
        double rspeed = -speed;
        double lspeed = speed;
        robot.frontleftwheel.setPower(-lspeed);
        robot.backleftwheel.setPower(-lspeed);
        robot.frontrightwheel.setPower(rspeed);
        robot.backrightwheel.setPower(rspeed);
        runtime.reset();
        while (opModeIsActive() && (runtime.seconds() < time)) {

        }
    }
    @Override
    public void liftup(double time, double speed) {
        robot.lift.setPower(speed);
        while (opModeIsActive() && (runtime.seconds() <time)) {}
    }

    @Override
    public void liftdown(double time, double speed) {
        robot.lift.setPower(-speed);
        speed = -speed;
        while (opModeIsActive() && (runtime.seconds() <time)) {}
    }

    @Override
    public void controltray(int angle) {
        robot.tray.setPosition(angle);
    }

    public void runOpMode() {

        robot.init(hardwareMap);

        telemetry.addData("Status","Ready to run");
        telemetry.update();

        waitForStart();

        // Code goes here.
        moveforward(.5,.5);
       // moveleft(2,.25);
        //moveright(1,.25);
        //movebackward(1,.25);
        //turnleft(1,0.25);
        //turnright(1,0.1);
        liftup( 0.5,.5);
        controltray(60);
        controltray(0);
        liftdown(.5, .5);
        telemetry.addData("Status", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
