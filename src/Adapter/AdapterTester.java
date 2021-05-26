package Adapter;

public class AdapterTester {
    public static void main(String[] args){
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot fredTheRobot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(fredTheRobot);
        EnemyAttacker tankAdapter = new EnemyTankAdapter(rx7Tank);

        System.out.println("The Robot");
        fredTheRobot.reactToHuman("Youngmin");
        fredTheRobot.walkForward();
        fredTheRobot.smashWithHands();

        System.out.println("The Enemy Tank");
        rx7Tank.assignDriver("Han");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Logan");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

        System.out.println("The Tank with Adapter");

        tankAdapter.assignDriver("Sun");
        tankAdapter.driveForward();
        tankAdapter.fireWeapon();
    }
}
