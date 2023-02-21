function solution() {
    class Figure {
        constructor(units = 'cm') {
            this.units = units;
        }
    
        changeUnits(newUnits) {
            this.units = newUnits;
        }
    
        transformMetric(value) {
            return this.units === 'm'
                ? value / 100
                : this.units === 'mm'
                    ? value * 10
                    : value;
        }
    
        toString() {
            return `Figures units: ${this.units} Area: ${this.area}`;
        }
    }
    
    class Circle extends Figure {
        constructor(radius, units) {
            super(units);
            this.radius = radius;
        }
    
        get area() {
            const radius = this.transformMetric(this.radius);
            return Math.PI * radius * radius;
        }
    
        toString() {
            return `${super.toString()} - radius: ${this.transformMetric(this.radius)}`;
        }
    }
    
    class Rectangle extends Figure {
        constructor(width, height, units) {
            super(units);
            this.width = width;
            this.height = height;
        }
    
        get area() {
            const width = this.transformMetric(this.width);
            const height = this.transformMetric(this.height);
            return width * height;
        }
    
        toString() {
            return `${super.toString()} - width: ${this.transformMetric(this.width)}, height: ${this.transformMetric(this.height)}`;
        }
    }

    return {
        Figure,
        Circle,
        Rectangle
    }
}