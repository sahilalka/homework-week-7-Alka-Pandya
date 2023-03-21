package homework_week_7;

/**15. Wall Area
 Write a class with the name Wall. The class needs two fields (instance variables) with name width
 and height of type double.
 *
 */
public class Programme15WallArea {

    double width;
    double height;

    public Programme15WallArea() {

    }

    public Programme15WallArea(double width, double height) {

        if (width < 0) {
            this.width = 0;
        } else {
        }
        this.width = width;

        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;

        }


    }

    public  double getWidth() {return width;}



    public double getHeight() {return height;}


    public void setWidth(double width) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;

        }
    }

    public  void setHeight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public  double getArea() {
        double area = width * height;
        return area;

    }

               public static void main(String[] args) {
               Programme15WallArea programme15WallArea = new Programme15WallArea(5,4);
               System.out.println("area="  +  programme15WallArea.getArea());
               programme15WallArea.setHeight(-1.5);
               System.out.println("width="  + programme15WallArea.getWidth());
               System.out.println("height= "  +  programme15WallArea.getHeight());
               System.out.println("area="   +  programme15WallArea.getArea());









    }







    }

