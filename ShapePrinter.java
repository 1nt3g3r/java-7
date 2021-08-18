abstract class Shape {
    abstract public String getName();
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Quad extends Shape {
    @Override
    public String getName() {
        return "Quad";
    }
}

class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }
}

class Hegaxon extends Shape {
    @Override
    public String getName() {
        return "Hegaxon";
    }
}

class ShapePrinter {
    public static void printShape(Shape shape) {
        System.out.println(shape.getName());
    }

    public static void main(String[] args) {
        printShape(new Circle());
        printShape(new Triangle());
        printShape(new Quad());
        printShape(new Pentagon());
        printShape(new Hegaxon());
    }
}

