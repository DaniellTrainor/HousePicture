public class Picture
{
    private Square wall;
    private Person person;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Square sky;
    private Square ground;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        ground = new Square();
        person = new Person();
        wall = new Square();
        sky = new Square();
        window = new Square();
        roof = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {

            sky.changeColor("lightBlue");
            sky.moveHorizontal(-500);
            sky.moveVertical(-1000);
            sky.changeSize(1000);
            sky.makeVisible();

            ground.changeColor("brown");
            ground.moveHorizontal(-500);
            ground.moveVertical(-250);
            ground.changeSize(1000);
            ground.makeVisible();

            person.changeColor("skin");
            person.moveHorizontal(40);
            person.moveVertical(30);
            person.makeVisible();

            wall.changeColor("lightGreen");
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();

            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();

            roof.changeSize(70, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(150);
            sun.moveVertical(-80);
            sun.changeSize(100);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("Yellow");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
