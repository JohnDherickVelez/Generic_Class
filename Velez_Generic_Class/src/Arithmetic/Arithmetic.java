package Arithmetic;

public class Arithmetic<T extends Number, U extends Number> {
    private T num1;
    private U num2;

    public Arithmetic(T num1, U num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Number add() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() + num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() + num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() + num2.longValue();
        } else {
            return num1.intValue() + num2.intValue();
        }
    }

    public Number subtract() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() - num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() - num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() - num2.longValue();
        } else {
            return num1.intValue() - num2.intValue();
        }
    }

    public Number multiply() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() * num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() * num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() * num2.longValue();
        } else {
            return num1.intValue() * num2.intValue();
        }
    }

    public Number divide() {
        if (num1 instanceof Double || num2 instanceof Double) {
            return num1.doubleValue() / num2.doubleValue();
        } else if (num1 instanceof Float || num2 instanceof Float) {
            return num1.floatValue() / num2.floatValue();
        } else if (num1 instanceof Long || num2 instanceof Long) {
            return num1.longValue() / num2.longValue();
        } else {
            return num1.intValue() / num2.intValue();
        }
    }

    public Number getMin() {
        if (compare(num1, num2) < 0) {
            return num1;
        } else {
            return num2;
        }
    }

    public Number getMax() {
        if (compare(num1, num2) > 0) {
            return num1;
        } else {
            return num2;
        }
    }

    private int compare(T num1, U num2) {
        if (num1 instanceof Double && num2 instanceof Double) {
            return Double.compare(num1.doubleValue(), num2.doubleValue());
        } else if (num1 instanceof Float && num2 instanceof Float) {
            return Float.compare(num1.floatValue(), num2.floatValue());
        } else if (num1 instanceof Long && num2 instanceof Long) {
            return Long.compare(num1.longValue(), num2.longValue());
        } else {
            return Integer.compare(num1.intValue(), num2.intValue());
        }
    }
}
