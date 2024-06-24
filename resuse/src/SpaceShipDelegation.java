/**
 * @author 刘季伟
 * @implNote 通过飞船中如何操作控制模块的示例展示委托的用法
 * @since 2024/4/26 17:53:04
 */
public class SpaceShipDelegation {
    private String name;
    private SpaceShipControls controls = new SpaceShipControls();
    public SpaceShipDelegation(String name){
        this.name = name;
    }
    // 委托的用法
    public void up(int velocity){
        controls.up(velocity);
    }
    public void down(int velocity){
        controls.down(velocity);
    }
    public void left(int velocity){
        controls.left(velocity);
    }
    public void right(int velocity){
        controls.right(velocity);
    }

    public static void main(String[] args) {
        SpaceShipDelegation protector = new SpaceShipDelegation("NASA Proctor");
        protector.up(100);
    }
}
