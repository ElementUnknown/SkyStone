package org.firstinspires.ftc.teamcode;

public interface AutonomusInterface {

    void moveforward( double speed, double targetDistance);

    void movebackward( double speed, double targetDistance);

    void moveleft(double time, double speed);

    void moveright(double time, double speed);

    void moveupright(double time, double speed);

    void moveupleft(double time, double speed);

    void movedownright(double time, double speed);

    void movedownleft(double time, double speed);

    void turnright(double  time, double speed);

    void turnleft(double time, double speed);

    void controltray(int angle);

    void liftup(double time, double speed);

    void liftdown(double time, double speed);


}
