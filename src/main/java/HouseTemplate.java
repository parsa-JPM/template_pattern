public abstract class HouseTemplate {

    /*
       it defines the steps to execute an algorithm.
       and childes can't override this method and destroy order
     */
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    //default implementation
    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    public abstract void buildWalls();

    public abstract void buildPillars();

    public void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

}
