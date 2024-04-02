abstract class Rectangle {
    abstract public  double getWidth();
    abstract public double getHeight();

    static class DoubleRectangle extends Rectangle{
        private double width;
        private double height;

        public DoubleRectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        @Override
        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

    }

    static class FloatRectangle extends Rectangle{
        private float width, height;

        public FloatRectangle(float width, float height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double getWidth() {
            return width;
        }

        @Override
        public double getHeight() {
            return height;
        }
    }

    double getArea(){
        return getHeight()*getWidth();
    }

}
