public class Cat {
    public static final int NUMBER_EYES = 2;
    public static final int MIN_WEIGHT = 1000;
    public static final int MAX_WEIGHT = 9000;
    private double originWeight;
    private double weight;
    private double amountFood;
    private static int count;
    private static double kitten;
    private String name;
    private Color color;


    public Cat() {
        //kitten=1009;
        //weight=00000;
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        amountFood =0.0;
        count++;
        if (weight<MIN_WEIGHT){count=count-1;}
        if (weight>MAX_WEIGHT){count=count-1;}

    }

    public Cat (double weight){
        this.weight = weight;
        count++;
        if (weight<MIN_WEIGHT){count=count-1;}
        if (weight>MAX_WEIGHT){count=count-1;}
    }
    //Задание 7 копирование кота
    public Cat (Cat original) {
        this.weight = original.weight;
        this.name = original.name;
        this.originWeight = original.originWeight;
        this.amountFood = original.amountFood;
        this.color = original.color;
        count++;
        if (weight<MIN_WEIGHT){count=count-1;}
        if (weight>MAX_WEIGHT){count=count-1;}
    }

    public void setColor (Color color){
        this.color = color;
    }
    public Color getColor(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getKitten(){
        return weight;
    }

    public void pee() {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT){
            weight = weight - 1;
            System.out.println("Кот сходил в туалет " + weight);
        if (weight < MIN_WEIGHT){
            count=count-1;
            System.out.println("Кот не может ходить в туалет, он умер");}
        if (weight > MAX_WEIGHT){
            System.out.println("Кот не может ходить в туалет, он лопнул");
            count=count-1;
             }
        }
    }

    public void meow() {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT){
            weight = weight - 1000;
            System.out.println("Meow");
            if (weight < MIN_WEIGHT){
                System.out.println("Кот не может мяукать, он умер");
                count=count-1;
            }
            if (weight > MAX_WEIGHT){
                System.out.println("Кот не может мяукать, он лопнул");
                count=count-1;
            }
        }
    }
    

    public void feed(double amount) {
        if (weight < MAX_WEIGHT && weight > MIN_WEIGHT){
            amountFood = amountFood+ amount;
            System.out.println(amountFood+weight);
        if (weight > MAX_WEIGHT){
            count=count-1;
            System.out.println("Кот не может есть, он лопнул");}
        if (weight < MIN_WEIGHT){
            count=count-1;
            System.out.println("Кот не может есть, он умер");}
        }
    }

    public double foodAmount() {
        return amountFood;
    }

    public void drink(double amount) {
        if (weight > MIN_WEIGHT && weight < MAX_WEIGHT){
            weight = weight + amount;
        if (weight > MAX_WEIGHT){
            count=count-1;
            System.out.println("Кот не может пить, он лопнул");}
        if (weight < MIN_WEIGHT){
            System.out.println("Кот не может пить, он умер");
            count=count-1;
            }
        }
    }

    public double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < MIN_WEIGHT) {
            return "Dead";
        } else if (weight > MAX_WEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public static void getCount() {
        System.out.println("Всего котов " + count);
    }

}
