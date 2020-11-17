package org.firstinspires.ftc.teamcode;

public interface AutonomusInterface {

    void moveforward(int time , double speed);

    void movebackward(int time, double speed);

    void moveleft(int time, double speed);

    void moveright(int time, double speed);

    void moveupright(int time, double speed);

    void moveupleft(int time, double speed);

    void movedownright(int time, double speed);

    void movedownleft(int time, double speed);

    void turnright(int time, double speed);

    void turnleft(int time, double speed);

    void controltray(int angle);
}
