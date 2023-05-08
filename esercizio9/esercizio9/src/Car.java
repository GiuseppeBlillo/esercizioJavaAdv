class Car implements Movable{
    @Override
    public void moveForward() {

    }

    @Override
    public void moveBackward(int x) {
        System.out.println( "I'm moving backward with a speed of " + x + " km/h :D");
    }
}
