package Adapter;

public class EnemyTankAdapter implements EnemyAttacker {
    EnemyTank theTank;
    public EnemyTankAdapter(EnemyTank newTank) {
        theTank = newTank;
    }

    @Override
    public void fireWeapon() {
        theTank.fireWeapon();
    }

    @Override
    public void driveForward() {
        theTank.driveForward();
    }

    @Override
    public void assignDriver(String driverName) {
        theTank.assignDriver(driverName);
    }
}
