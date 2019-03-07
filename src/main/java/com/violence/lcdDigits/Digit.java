package com.violence.lcdDigits;

import java.util.Objects;

/**
 * created by user violence
 * created on 07.03.2019
 * class created for project lcdDigits
 */

public class Digit {
    private String top;
    private String center;
    private String bottom;
    private String leftTop;
    private String leftBottom;
    private String rightTop;
    private String rightBottom;

    public String getTop() {
        return top;
    }

    public String getCenter() {
        return center;
    }

    public String getBottom() {
        return bottom;
    }

    public String getLeftTop() {
        return leftTop;
    }

    public String getLeftBottom() {
        return leftBottom;
    }

    public String getRightTop() {
        return rightTop;
    }

    public String getRightBottom() {
        return rightBottom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Digit digit = (Digit) o;
        return Objects.equals(top, digit.top) &&
                Objects.equals(center, digit.center) &&
                Objects.equals(bottom, digit.bottom) &&
                Objects.equals(leftTop, digit.leftTop) &&
                Objects.equals(leftBottom, digit.leftBottom) &&
                Objects.equals(rightTop, digit.rightTop) &&
                Objects.equals(rightBottom, digit.rightBottom);
    }

    @Override
    public int hashCode() {

        return Objects.hash(top, center, bottom, leftTop, leftBottom, rightTop, rightBottom);
    }

    @Override
    public String toString() {
        return top + "\n"
                + leftTop + center + rightTop + "\n"
                + leftBottom + bottom + rightBottom;
    }

    public static Builder newBuilder() {
        return new Digit().new Builder();
    }

    public class Builder {
        private String top;
        private String center;
        private String bottom;
        private String leftTop;
        private String leftBottom;
        private String rightTop;
        private String rightBottom;

        public Digit.Builder setTop(String top) {
            Digit.this.top = top;
            return this;
        }

        public Digit.Builder setCenter(String center) {
            Digit.this.center = center;
            return this;
        }

        public Digit.Builder setBottom(String bottom) {
            Digit.this.bottom = bottom;
            return this;
        }

        public Digit.Builder setLeftTop(String leftTop) {
            Digit.this.leftTop = leftTop;
            return this;
        }

        public Digit.Builder setLeftBottom(String leftBottom) {
            Digit.this.leftBottom = leftBottom;
            return this;
        }

        public Digit.Builder setRightTop(String rightTop) {
            Digit.this.rightTop = rightTop;
            return this;
        }

        public Digit.Builder setRightBottom(String rightBottom) {
            Digit.this.rightBottom = rightBottom;
            return this;
        }

        public Digit build() {
            return Digit.this;
        }
    }
}
